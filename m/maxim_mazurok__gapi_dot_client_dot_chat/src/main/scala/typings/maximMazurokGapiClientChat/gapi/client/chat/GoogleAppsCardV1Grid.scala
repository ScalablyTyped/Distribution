package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1Grid extends StObject {
  
  /** The border style to apply to each grid item. */
  var borderStyle: js.UndefOr[GoogleAppsCardV1BorderStyle] = js.undefined
  
  /**
    * The number of columns to display in the grid. A default value is used if this field isn't specified, and that default value is different depending on where the grid is shown (dialog
    * versus companion).
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /** The items to display in the grid. */
  var items: js.UndefOr[js.Array[GoogleAppsCardV1GridItem]] = js.undefined
  
  /** This callback is reused by each individual grid item, but with the item's identifier and index in the items list added to the callback's parameters. */
  var onClick: js.UndefOr[GoogleAppsCardV1OnClick] = js.undefined
  
  /** The text that displays in the grid header. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1Grid {
  
  inline def apply(): GoogleAppsCardV1Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1Grid]
  }
  
  extension [Self <: GoogleAppsCardV1Grid](x: Self) {
    
    inline def setBorderStyle(value: GoogleAppsCardV1BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setItems(value: js.Array[GoogleAppsCardV1GridItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleAppsCardV1GridItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnClick(value: GoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
