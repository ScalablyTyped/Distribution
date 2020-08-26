package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grantable role query request.
  */
@js.native
trait SchemaQueryGrantableRolesRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of grantable
    * roles.  The name follows the Google Cloud Platform resource format. For
    * example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /**
    * Optional limit on the number of roles to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier
    * QueryGrantableRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  var view: js.UndefOr[String] = js.native
}

object SchemaQueryGrantableRolesRequest {
  @scala.inline
  def apply(): SchemaQueryGrantableRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryGrantableRolesRequest]
  }
  @scala.inline
  implicit class SchemaQueryGrantableRolesRequestOps[Self <: SchemaQueryGrantableRolesRequest] (val x: Self) extends AnyVal {
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
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

