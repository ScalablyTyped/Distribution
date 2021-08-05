package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `ReferenceImage` represents a product image and its associated metadata,
  * such as bounding boxes.
  */
trait SchemaGoogleCloudVisionV1p4beta1ReferenceImage extends StObject {
  
  /**
    * Bounding polygons around the areas of interest in the reference image.
    * Optional. If this field is empty, the system will try to detect regions
    * of interest. At most 10 bounding polygons will be used.  The provided
    * shape is converted into a non-rotated rectangle. Once converted, the
    * small edge of the rectangle must be greater than or equal to 300 pixels.
    * The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]] = js.undefined
  
  /**
    * The resource name of the reference image.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
    * This field is ignored when creating a reference image.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Cloud Storage URI of the reference image.  The URI must start
    * with `gs://`.  Required.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1ReferenceImage {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1ReferenceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ReferenceImage]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1ReferenceImage](x: Self) {
    
    inline def setBoundingPolys(value: js.Array[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]): Self = StObject.set(x, "boundingPolys", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolysUndefined: Self = StObject.set(x, "boundingPolys", js.undefined)
    
    inline def setBoundingPolysVarargs(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly*): Self = StObject.set(x, "boundingPolys", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
