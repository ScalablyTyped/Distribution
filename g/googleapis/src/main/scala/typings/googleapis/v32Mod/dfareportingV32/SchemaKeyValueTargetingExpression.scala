package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key Value Targeting Expression.
  */
@js.native
trait SchemaKeyValueTargetingExpression extends js.Object {
  /**
    * Keyword expression being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object SchemaKeyValueTargetingExpression {
  @scala.inline
  def apply(expression: String = null): SchemaKeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKeyValueTargetingExpression]
  }
}

