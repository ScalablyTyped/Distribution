package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image, with a link to the main image and a thumbnail.
  */
trait SchemaImage extends StObject {
  
  /**
    * An error explaining why the thumbnail could not be rendered.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * A reference to the full-size, original image.  This is the same as the
    * tool_outputs entry for the image under its Step.  Always set.
    */
  var sourceImage: js.UndefOr[SchemaToolOutputReference] = js.undefined
  
  /**
    * The step to which the image is attached.  Always set.
    */
  var stepId: js.UndefOr[String] = js.undefined
  
  /**
    * The thumbnail.
    */
  var thumbnail: js.UndefOr[SchemaThumbnail] = js.undefined
}
object SchemaImage {
  
  inline def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  extension [Self <: SchemaImage](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSourceImage(value: SchemaToolOutputReference): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    inline def setThumbnail(value: SchemaThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
