package typings.ionic

import typings.ionic.definitionsMod.AssociationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranches extends js.Object {
  var branches: js.Array[String]
  var repoId: Double
  var `type`: AssociationType
}

object AnonBranches {
  @scala.inline
  def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): AnonBranches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBranches]
  }
}

