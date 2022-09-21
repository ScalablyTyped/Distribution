package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateCustomClassRequest extends StObject {
  
  /**
    * Required. The custom class to create.
    */
  var customClass: js.UndefOr[SchemaCustomClass] = js.undefined
  
  /**
    * Required. The ID to use for the custom class, which will become the final component of the custom class' resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
    */
  var customClassId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateCustomClassRequest {
  
  inline def apply(): SchemaCreateCustomClassRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCustomClassRequest]
  }
  
  extension [Self <: SchemaCreateCustomClassRequest](x: Self) {
    
    inline def setCustomClass(value: SchemaCustomClass): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    
    inline def setCustomClassId(value: String): Self = StObject.set(x, "customClassId", value.asInstanceOf[js.Any])
    
    inline def setCustomClassIdNull: Self = StObject.set(x, "customClassId", null)
    
    inline def setCustomClassIdUndefined: Self = StObject.set(x, "customClassId", js.undefined)
    
    inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
  }
}
