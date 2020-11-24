package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRepository extends js.Object {
  
  /**
    * Output only. The URL pointing to the hosted repository where the function were defined at the time of deployment. It always points to a specific commit in the format described
    * above.
    */
  var deployedUrl: js.UndefOr[String] = js.native
  
  /**
    * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats: To refer to a specific commit:
    * `https://source.developers.google.com/projects/∗/repos/∗/revisions/∗/paths/ *` To refer to a moveable alias (branch):
    * `https://source.developers.google.com/projects/∗/repos/∗/moveable-aliases/∗/paths/ *` In particular, to refer to HEAD use `master` moveable alias. To refer to a specific fixed alias
    * (tag): `https://source.developers.google.com/projects/∗/repos/∗/fixed-aliases/∗/paths/ *` You may omit `paths/ *` if you want to use the main directory.
    */
  var url: js.UndefOr[String] = js.native
}
object SourceRepository {
  
  @scala.inline
  def apply(): SourceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceRepository]
  }
  
  @scala.inline
  implicit class SourceRepositoryOps[Self <: SourceRepository] (val x: Self) extends AnyVal {
    
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
    def setDeployedUrl(value: String): Self = this.set("deployedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedUrl: Self = this.set("deployedUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
