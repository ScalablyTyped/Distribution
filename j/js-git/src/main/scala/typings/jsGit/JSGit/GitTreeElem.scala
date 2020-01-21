package typings.jsGit.JSGit

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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitTreeElem]
  }
}

