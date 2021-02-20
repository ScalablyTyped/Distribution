package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgGridColumnFixingColumnSettingMutableBuilder[Self <: IgGridColumnFixingColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFixing(value: Boolean): Self = StObject.set(x, "allowFixing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFixingUndefined: Self = StObject.set(x, "allowFixing", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
  }
}
