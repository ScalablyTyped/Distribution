package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var association: js.UndefOr[Null | AppAssociation] = js.native
  var id: String = js.native
  var name: String = js.native
  @JSName("org")
  var org_ : Null | Org = js.native
  var repo_url: js.UndefOr[String] = js.native
  var slug: String = js.native
}

object App {
  @scala.inline
  def apply(id: String, name: String, slug: String): App = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociation(value: AppAssociation): Self = this.set("association", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
    @scala.inline
    def setAssociationNull: Self = this.set("association", null)
    @scala.inline
    def setOrg_(value: Org): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_Null: Self = this.set("org", null)
    @scala.inline
    def setRepo_url(value: String): Self = this.set("repo_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepo_url: Self = this.set("repo_url", js.undefined)
  }
  
}

