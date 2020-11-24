package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumnFixingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies whether the column can be fixed or not. If allow fixing is false, then the fixing pin will not be rendered for the column.
    *
    */
  var allowFixing: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the column is initially fixed or not. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#initial-state) out for more information.
    *
    */
  var isFixed: js.UndefOr[Boolean] = js.native
}
object IgGridColumnFixingColumnSetting {
  
  @scala.inline
  def apply(): IgGridColumnFixingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridColumnFixingColumnSettingOps[Self <: IgGridColumnFixingColumnSetting] (val x: Self) extends AnyVal {
    
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
    def setAllowFixing(value: Boolean): Self = this.set("allowFixing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFixing: Self = this.set("allowFixing", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = this.set("isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFixed: Self = this.set("isFixed", js.undefined)
  }
}
