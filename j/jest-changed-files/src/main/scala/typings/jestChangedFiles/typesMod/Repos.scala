package typings.jestChangedFiles.typesMod

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
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hg = hg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Repos]
  }
}

