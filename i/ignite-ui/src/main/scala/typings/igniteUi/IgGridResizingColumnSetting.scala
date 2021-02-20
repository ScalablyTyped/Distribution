package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridResizingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables disables resizing for the column.
    *
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  
  /**
    * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Column key. this is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Maximum column width in pixels or percents.
    *
    */
  var maximumWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Minimum column width in pixels or percents.
    *
    */
  var minimumWidth: js.UndefOr[String | Double] = js.native
}
object IgGridResizingColumnSetting {
  
  @scala.inline
  def apply(): IgGridResizingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizingColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridResizingColumnSettingMutableBuilder[Self <: IgGridResizingColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setMaximumWidth(value: String | Double): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
    
    @scala.inline
    def setMinimumWidth(value: String | Double): Self = StObject.set(x, "minimumWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWidthUndefined: Self = StObject.set(x, "minimumWidth", js.undefined)
  }
}
