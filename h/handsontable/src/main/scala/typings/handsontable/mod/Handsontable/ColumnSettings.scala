package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Column settings inherit grid settings but overload the meaning of `data` to be specific to each column.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.GridSettings ]: P} & {[ P in 'data' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.GridSettings] ]: handsontable.handsontable.Handsontable.GridSettings[P]} */ trait ColumnSettings
  extends /**
  * Column and cell meta data is extensible, developers can add any properties they want.
  */
/* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[String | Double | ColumnDataGetterSetterFunction] = js.undefined
}

object ColumnSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: String | Double | ColumnDataGetterSetterFunction = null
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSettings]
  }
}

