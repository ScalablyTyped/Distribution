package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing an image.
  */
trait SchemaImage extends StObject {
  
  /**
    * An URL to an image with a default lifetime of 30 minutes. This URL is
    * tagged with the account of the requester. Anyone with the URL effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the presentation&#39;s sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The properties of the image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.undefined
  
  /**
    * The source URL is the URL used to insert the image. The source URL can be
    * empty.
    */
  var sourceUrl: js.UndefOr[String] = js.undefined
}
object SchemaImage {
  
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  @scala.inline
  implicit class SchemaImageMutableBuilder[Self <: SchemaImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setImageProperties(value: SchemaImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
