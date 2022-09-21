package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grid extends StObject {
  
  /** The border style to apply to each grid item. */
  var borderStyle: js.UndefOr[BorderStyle] = js.undefined
  
  /** The items to display in the grid. */
  var items: js.UndefOr[js.Array[GridItem]] = js.undefined
  
  /**
    * The number of columns to display in the grid. Note that a default value will be used if this field is not specified, and that default value will be different depending on where the
    * grid is shown (dialog vs companion).
    */
  var numColumns: js.UndefOr[Double] = js.undefined
  
  /** This callback will be reused by each individual GridItem, but with the item's identifier and index in the items list added to the callback's parameters. */
  var onClick: js.UndefOr[OnClick] = js.undefined
  
  /** The text to display in the grid header. */
  var title: js.UndefOr[String] = js.undefined
}
object Grid {
  
  inline def apply(): Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grid]
  }
  
  extension [Self <: Grid](x: Self) {
    
    inline def setBorderStyle(value: BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setItems(value: js.Array[GridItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GridItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
