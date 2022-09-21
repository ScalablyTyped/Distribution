package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeDimensions extends StObject {
  
  /**
    * The height of the creative in pixels.
    */
  var height: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the creative in pixels.
    */
  var width: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeDimensions {
  
  inline def apply(): SchemaCreativeDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDimensions]
  }
  
  extension [Self <: SchemaCreativeDimensions](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
