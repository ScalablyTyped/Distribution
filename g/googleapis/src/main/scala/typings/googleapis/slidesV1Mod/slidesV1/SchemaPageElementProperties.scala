package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageElementProperties extends StObject {
  
  /**
    * The object ID of the page where the element is located.
    */
  var pageObjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the element.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * The transform for the element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.undefined
}
object SchemaPageElementProperties {
  
  inline def apply(): SchemaPageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageElementProperties]
  }
  
  extension [Self <: SchemaPageElementProperties](x: Self) {
    
    inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdNull: Self = StObject.set(x, "pageObjectId", null)
    
    inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
