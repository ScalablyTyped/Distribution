package typings.jsDashGit.JSGit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitObject extends js.Object {
  var body: js.Any
  var `type`: String
}

object GitObject {
  @scala.inline
  def apply(body: js.Any, `type`: String): GitObject = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitObject]
  }
}

