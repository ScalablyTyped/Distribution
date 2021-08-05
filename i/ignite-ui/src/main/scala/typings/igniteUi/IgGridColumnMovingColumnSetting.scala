package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridColumnMovingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Allows the column to be moved.
    *
    */
  var allowMoving: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
}
object IgGridColumnMovingColumnSetting {
  
  inline def apply(): IgGridColumnMovingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMovingColumnSetting]
  }
  
  extension [Self <: IgGridColumnMovingColumnSetting](x: Self) {
    
    inline def setAllowMoving(value: Boolean): Self = StObject.set(x, "allowMoving", value.asInstanceOf[js.Any])
    
    inline def setAllowMovingUndefined: Self = StObject.set(x, "allowMoving", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
  }
}
