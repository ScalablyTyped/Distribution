package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search the resources in the specified FHIR store.
  */
@js.native
trait SchemaSearchResourcesRequest extends js.Object {
  /**
    * The type of the resource to search.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object SchemaSearchResourcesRequest {
  @scala.inline
  def apply(resourceType: String = null): SchemaSearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchResourcesRequest]
  }
}

