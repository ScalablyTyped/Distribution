package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ImportProductSets` method.  This message is
  * returned by the google.longrunning.Operations.GetOperation method in the
  * returned google.longrunning.Operation.response field.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponse extends js.Object {
  /**
    * The list of reference_images that are imported successfully.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1ReferenceImage]] = js.native
  /**
    * The rpc status for each ImportProductSet request, including both
    * successes and errors.  The number of statuses here matches the number of
    * lines in the csv file, and statuses[i] stores the success or failure
    * status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponseOps[Self <: SchemaGoogleCloudVisionV1p4beta1ImportProductSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReferenceImagesVarargs(value: SchemaGoogleCloudVisionV1p4beta1ReferenceImage*): Self = this.set("referenceImages", js.Array(value :_*))
    @scala.inline
    def setReferenceImages(value: js.Array[SchemaGoogleCloudVisionV1p4beta1ReferenceImage]): Self = this.set("referenceImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceImages: Self = this.set("referenceImages", js.undefined)
    @scala.inline
    def setStatusesVarargs(value: SchemaStatus*): Self = this.set("statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: js.Array[SchemaStatus]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
  }
  
}

