package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResizingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables disables resizing for the column.
    *
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. this is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum column width in pixels or percents.
    *
    */
  var maximumWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Minimum column width in pixels or percents.
    *
    */
  var minimumWidth: js.UndefOr[String | Double] = js.undefined
}
object IgGridResizingColumnSetting {
  
  inline def apply(): IgGridResizingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizingColumnSetting]
  }
  
  extension [Self <: IgGridResizingColumnSetting](x: Self) {
    
    inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
    
    inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setMaximumWidth(value: String | Double): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
    
    inline def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
    
    inline def setMinimumWidth(value: String | Double): Self = StObject.set(x, "minimumWidth", value.asInstanceOf[js.Any])
    
    inline def setMinimumWidthUndefined: Self = StObject.set(x, "minimumWidth", js.undefined)
  }
}
