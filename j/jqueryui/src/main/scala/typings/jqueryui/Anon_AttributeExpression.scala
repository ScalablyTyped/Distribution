package typings.jqueryui

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeExpression extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[RegExp] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object Anon_AttributeExpression {
  @scala.inline
  def apply(attribute: String = null, expression: RegExp = null, key: String = null): Anon_AttributeExpression = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_AttributeExpression]
  }
}

