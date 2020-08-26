package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceConfigs method.
  */
@js.native
trait SchemaListServiceConfigsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaListServiceConfigsResponse {
  @scala.inline
  def apply(): SchemaListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListServiceConfigsResponseOps[Self <: SchemaListServiceConfigsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setServiceConfigsVarargs(value: SchemaService*): Self = this.set("serviceConfigs", js.Array(value :_*))
    @scala.inline
    def setServiceConfigs(value: js.Array[SchemaService]): Self = this.set("serviceConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigs: Self = this.set("serviceConfigs", js.undefined)
  }
  
}

