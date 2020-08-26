package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Types supported by Deployment Manager
  */
@js.native
trait SchemaTypesListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource types supported by Deployment Manager.
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.native
}

object SchemaTypesListResponse {
  @scala.inline
  def apply(): SchemaTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypesListResponse]
  }
  @scala.inline
  implicit class SchemaTypesListResponseOps[Self <: SchemaTypesListResponse] (val x: Self) extends AnyVal {
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
    def setTypesVarargs(value: SchemaType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[SchemaType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

