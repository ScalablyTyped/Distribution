package typings.jsDashGit.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeElem extends js.Object {
  var hash: String
  var mode: Double
  var name: String
}

object GitTreeElem {
  @scala.inline
  def apply(hash: String, mode: Double, name: String): GitTreeElem = {
    val __obj = js.Dynamic.literal(hash = hash, mode = mode, name = name)
  
    __obj.asInstanceOf[GitTreeElem]
  }
}

