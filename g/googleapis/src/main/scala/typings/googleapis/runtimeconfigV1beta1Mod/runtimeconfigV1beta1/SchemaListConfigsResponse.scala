package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ListConfigs()` returns the following response. The order of returned
  * objects is arbitrary; that is, it is not ordered in any particular way.
  */
@js.native
trait SchemaListConfigsResponse extends js.Object {
  /**
    * A list of the configurations in the project. The order of returned
    * objects is arbitrary; that is, it is not ordered in any particular way.
    */
  var configs: js.UndefOr[js.Array[SchemaRuntimeConfig]] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListConfigsResponse {
  @scala.inline
  def apply(): SchemaListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListConfigsResponseOps[Self <: SchemaListConfigsResponse] (val x: Self) extends AnyVal {
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
    def setConfigsVarargs(value: SchemaRuntimeConfig*): Self = this.set("configs", js.Array(value :_*))
    @scala.inline
    def setConfigs(value: js.Array[SchemaRuntimeConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigs: Self = this.set("configs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

