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
    helperExpression: Node => scala.Boolean,
    scopeId: PathExpression => scala.Boolean,
    simpleId: PathExpression => scala.Boolean
  ): helpers = {
    val __obj = js.Dynamic.literal(helperExpression = js.Any.fromFunction1(helperExpression), scopeId = js.Any.fromFunction1(scopeId), simpleId = js.Any.fromFunction1(simpleId))
  
    __obj.asInstanceOf[helpers]
  }
}

