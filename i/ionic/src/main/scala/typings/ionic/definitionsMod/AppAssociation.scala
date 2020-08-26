package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppAssociation extends js.Object {
  var repository: RepoAssociation = js.native
}

object AppAssociation {
  @scala.inline
  def apply(repository: RepoAssociation): AppAssociation = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAssociation]
  }
  @scala.inline
  implicit class AppAssociationOps[Self <: AppAssociation] (val x: Self) extends AnyVal {
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
    def setRepository(value: RepoAssociation): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

