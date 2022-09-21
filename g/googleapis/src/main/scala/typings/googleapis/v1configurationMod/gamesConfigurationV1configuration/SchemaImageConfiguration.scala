package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageConfiguration extends StObject {
  
  /**
    * The image type for the image.
    */
  var imageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#imageConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource ID of resource which the image belongs to.
    */
  var resourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url for this image.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageConfiguration {
  
  inline def apply(): SchemaImageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfiguration]
  }
  
  extension [Self <: SchemaImageConfiguration](x: Self) {
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeNull: Self = StObject.set(x, "imageType", null)
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
