package typings.jestChangedFiles.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedFiles extends js.Object {
  var changedFiles: Paths
  var repos: Repos
}

object ChangedFiles {
  @scala.inline
  def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFiles]
  }
}

