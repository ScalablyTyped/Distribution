package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
  def apply(): SchemaSearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResourcesRequest]
  }
  @scala.inline
  implicit class SchemaSearchResourcesRequestOps[Self <: SchemaSearchResourcesRequest] (val x: Self) extends AnyVal {
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

