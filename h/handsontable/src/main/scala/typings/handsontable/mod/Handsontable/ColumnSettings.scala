package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Column settings inherit grid settings but overload the meaning of `data` to be specific to each column.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.GridSettings ]: P} & {[ P in 'data' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.GridSettings] ]: handsontable.handsontable.Handsontable.GridSettings[P]} */ @js.native
trait ColumnSettings
  extends /**
  * Column and cell meta data is extensible, developers can add any properties they want.
  */
/* key */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[String | Double | ColumnDataGetterSetterFunction] = js.native
}
object ColumnSettings {
  
  @scala.inline
  def apply(): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSettings]
  }
  
  @scala.inline
  implicit class ColumnSettingsOps[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String | Double | ColumnDataGetterSetterFunction): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
