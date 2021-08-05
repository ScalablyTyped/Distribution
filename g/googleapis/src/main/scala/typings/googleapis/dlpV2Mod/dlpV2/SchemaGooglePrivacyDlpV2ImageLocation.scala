package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of the finding within an image.
  */
trait SchemaGooglePrivacyDlpV2ImageLocation extends StObject {
  
  /**
    * Bounding boxes locating the pixels within the image containing the
    * finding.
    */
  var boundingBoxes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2BoundingBox]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ImageLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ImageLocation](x: Self) {
    
    inline def setBoundingBoxes(value: js.Array[SchemaGooglePrivacyDlpV2BoundingBox]): Self = StObject.set(x, "boundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxesUndefined: Self = StObject.set(x, "boundingBoxes", js.undefined)
    
    inline def setBoundingBoxesVarargs(value: SchemaGooglePrivacyDlpV2BoundingBox*): Self = StObject.set(x, "boundingBoxes", js.Array(value :_*))
  }
}
