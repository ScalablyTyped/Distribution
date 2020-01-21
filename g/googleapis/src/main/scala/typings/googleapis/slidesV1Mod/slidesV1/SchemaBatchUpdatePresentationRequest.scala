package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for PresentationsService.BatchUpdatePresentation.
  */
@js.native
trait SchemaBatchUpdatePresentationRequest extends js.Object {
  /**
    * A list of updates to apply to the presentation.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.native
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdatePresentationRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaRequest] = null, writeControl: SchemaWriteControl = null): SchemaBatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdatePresentationRequest]
  }
}

