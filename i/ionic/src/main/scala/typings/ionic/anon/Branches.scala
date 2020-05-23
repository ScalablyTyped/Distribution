package typings.ionic.anon

import typings.ionic.definitionsMod.AssociationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branches extends js.Object {
  var branches: js.Array[String]
  var repoId: Double
  var `type`: AssociationType
}

object Branches {
  @scala.inline
  def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branches]
  }
}

