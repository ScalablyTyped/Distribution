package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image, with a link to the main image and a thumbnail.
  */
@js.native
trait SchemaImage extends StObject {
  
  /**
    * An error explaining why the thumbnail could not be rendered.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * A reference to the full-size, original image.  This is the same as the
    * tool_outputs entry for the image under its Step.  Always set.
    */
  var sourceImage: js.UndefOr[SchemaToolOutputReference] = js.native
  
  /**
    * The step to which the image is attached.  Always set.
    */
  var stepId: js.UndefOr[String] = js.native
  
  /**
    * The thumbnail.
    */
  var thumbnail: js.UndefOr[SchemaThumbnail] = js.native
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
    def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSourceImage(value: SchemaToolOutputReference): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    @scala.inline
    def setThumbnail(value: SchemaThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
