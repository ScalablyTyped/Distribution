package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p4beta1Celebrity extends StObject {
  
  /**
    * The Celebrity's description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Celebrity's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the preloaded Celebrity. Has the format `builtin/{mid\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1Celebrity {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1Celebrity]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1Celebrity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
