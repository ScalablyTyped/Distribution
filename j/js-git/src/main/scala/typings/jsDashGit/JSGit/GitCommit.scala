package typings.jsDashGit.JSGit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends js.Object {
  var author: GitAuthor
  var message: String
  var tree: String
}

object GitCommit {
  @scala.inline
  def apply(author: GitAuthor, message: String, tree: String): GitCommit = {
    val __obj = js.Dynamic.literal(author = author, message = message, tree = tree)
  
    __obj.asInstanceOf[GitCommit]
  }
}

