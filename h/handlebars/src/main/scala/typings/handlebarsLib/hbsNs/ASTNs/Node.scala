package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var loc: SourceLocation
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(loc: SourceLocation, `type`: java.lang.String): Node = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Node]
  }
}

