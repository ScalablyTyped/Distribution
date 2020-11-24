package typings.googleapis.spannerV1Mod.spannerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsInstancesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * An expression for filtering the results of the request. Filter rules are
    * case insensitive. The fields eligible for filtering are:    * `name`   *
    * `display_name`   * `labels.key` where key is the name of a label  Some
    * examples of using filters are:    * `name:*` --> The instance has a name.
    * * `name:Howl` --> The instance's name contains the string "howl".   *
    * `name:HOWL` --> Equivalent to above.   * `NAME:howl` --> Equivalent to
    * above.   * `labels.env:*` --> The instance has the label "env".   *
    * `labels.env:dev` --> The instance has the label "env" and the value of
    * the label contains the string "dev".   * `name:howl labels.env:dev` -->
    * The instance's name contains "howl" and it has the label "env" with its
    * value                                  containing "dev".
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Number of instances to be returned in the response. If 0 or less,
    * defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If non-empty, `page_token` should contain a next_page_token from a
    * previous ListInstancesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the project for which a list of instances is
    * requested. Values are of the form `projects/<project>`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsInstancesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesListOps[Self <: ParamsResourceProjectsInstancesList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
