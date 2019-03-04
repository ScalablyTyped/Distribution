package typings
package jsDashGitLib.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitObject extends js.Object {
  var body: js.Any
  var `type`: java.lang.String
}

object GitObject {
  @scala.inline
  def apply(body: js.Any, `type`: java.lang.String): GitObject = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitObject]
  }
}

