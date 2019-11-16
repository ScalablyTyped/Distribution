package typings.jestDashChangedDashFiles.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repos extends js.Object {
  var git: Paths
  var hg: Paths
}

object Repos {
  @scala.inline
  def apply(git: Paths, hg: Paths): Repos = {
    val __obj = js.Dynamic.literal(git = git, hg = hg)
  
    __obj.asInstanceOf[Repos]
  }
}

