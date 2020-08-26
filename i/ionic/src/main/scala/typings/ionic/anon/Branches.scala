package typings.ionic.anon

import typings.ionic.definitionsMod.AssociationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branches extends js.Object {
  var branches: js.Array[String] = js.native
  var repoId: Double = js.native
  var `type`: AssociationType = js.native
}

object Branches {
  @scala.inline
  def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branches]
  }
  @scala.inline
  implicit class BranchesOps[Self <: Branches] (val x: Self) extends AnyVal {
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
    def setBranchesVarargs(value: String*): Self = this.set("branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: js.Array[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepoId(value: Double): Self = this.set("repoId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AssociationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

