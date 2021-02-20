package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an image configuration resource.
  */
@js.native
trait SchemaImageConfiguration extends StObject {
  
  /**
    * The image type for the image.
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#imageConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The resource ID of resource which the image belongs to.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The url for this image.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaImageConfiguration {
  
  @scala.inline
  def apply(): SchemaImageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfiguration]
  }
  
  @scala.inline
  implicit class SchemaImageConfigurationMutableBuilder[Self <: SchemaImageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
