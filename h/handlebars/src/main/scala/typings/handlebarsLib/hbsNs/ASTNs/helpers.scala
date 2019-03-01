package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait helpers extends js.Object {
  def helperExpression(node: Node): scala.Boolean
  def scopeId(path: PathExpression): scala.Boolean
  def simpleId(path: PathExpression): scala.Boolean
}

object helpers {
  @scala.inline
  def apply(
    helperExpression: js.Function1[Node, scala.Boolean],
    scopeId: js.Function1[PathExpression, scala.Boolean],
    simpleId: js.Function1[PathExpression, scala.Boolean]
  ): helpers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("helperExpression")(helperExpression)
    __obj.updateDynamic("scopeId")(scopeId)
    __obj.updateDynamic("simpleId")(simpleId)
    __obj.asInstanceOf[helpers]
  }
}

