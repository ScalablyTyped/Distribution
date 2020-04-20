package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait helpers extends js.Object {
  def helperExpression(node: Node): Boolean
  def scopeId(path: PathExpression): Boolean
  def simpleId(path: PathExpression): Boolean
}

object helpers {
  @scala.inline
  def apply(
    helperExpression: Node => Boolean,
    scopeId: PathExpression => Boolean,
    simpleId: PathExpression => Boolean
  ): helpers = {
    val __obj = js.Dynamic.literal(helperExpression = js.Any.fromFunction1(helperExpression), scopeId = js.Any.fromFunction1(scopeId), simpleId = js.Any.fromFunction1(simpleId))
    __obj.asInstanceOf[helpers]
  }
}

