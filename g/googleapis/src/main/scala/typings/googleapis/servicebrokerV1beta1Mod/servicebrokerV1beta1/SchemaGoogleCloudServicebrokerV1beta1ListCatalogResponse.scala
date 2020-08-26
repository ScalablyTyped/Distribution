package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListCatalog()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse extends js.Object {
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The services available for the requested GCP project.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Service]] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponseOps[Self <: SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setServicesVarargs(value: SchemaGoogleCloudServicebrokerV1beta1Service*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[SchemaGoogleCloudServicebrokerV1beta1Service]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

