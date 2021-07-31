package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ImportProductSets` method.  This message is
  * returned by the google.longrunning.Operations.GetOperation method in the
  * returned google.longrunning.Operation.response field.
  */
trait SchemaImportProductSetsResponse extends StObject {
  
  /**
    * The list of reference_images that are imported successfully.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaReferenceImage]] = js.undefined
  
  /**
    * The rpc status for each ImportProductSet request, including both
    * successes and errors.  The number of statuses here matches the number of
    * lines in the csv file, and statuses[i] stores the success or failure
    * status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
}
object SchemaImportProductSetsResponse {
  
  @scala.inline
  def apply(): SchemaImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsResponse]
  }
  
  @scala.inline
  implicit class SchemaImportProductSetsResponseMutableBuilder[Self <: SchemaImportProductSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceImages(value: js.Array[SchemaReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    @scala.inline
    def setReferenceImagesVarargs(value: SchemaReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[SchemaStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: SchemaStatus*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
