package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFunctions` method.
  */
@js.native
trait SchemaListFunctionsResponse extends js.Object {
  /**
    * The functions that match the request.
    */
  var functions: js.UndefOr[js.Array[SchemaCloudFunction]] = js.native
  /**
    * If not empty, indicates that there may be more functions that match the
    * request; this value should be passed in a new
    * google.cloud.functions.v1beta2.ListFunctionsRequest to get more
    * functions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFunctionsResponse {
  @scala.inline
  def apply(): SchemaListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFunctionsResponse]
  }
  @scala.inline
  implicit class SchemaListFunctionsResponseOps[Self <: SchemaListFunctionsResponse] (val x: Self) extends AnyVal {
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
    def setFunctionsVarargs(value: SchemaCloudFunction*): Self = this.set("functions", js.Array(value :_*))
    @scala.inline
    def setFunctions(value: js.Array[SchemaCloudFunction]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

