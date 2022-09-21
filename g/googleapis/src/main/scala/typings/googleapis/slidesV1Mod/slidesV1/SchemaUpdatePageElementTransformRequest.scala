package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdatePageElementTransformRequest extends StObject {
  
  /**
    * The apply mode of the transform update.
    */
  var applyMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the page element to update.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The input transform matrix used to update the page element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.undefined
}
object SchemaUpdatePageElementTransformRequest {
  
  inline def apply(): SchemaUpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementTransformRequest]
  }
  
  extension [Self <: SchemaUpdatePageElementTransformRequest](x: Self) {
    
    inline def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
    
    inline def setApplyModeNull: Self = StObject.set(x, "applyMode", null)
    
    inline def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
