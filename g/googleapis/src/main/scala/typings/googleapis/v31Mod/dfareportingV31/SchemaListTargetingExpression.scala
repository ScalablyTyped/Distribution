package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Targeting Expression.
  */
@js.native
trait SchemaListTargetingExpression extends js.Object {
  /**
    * Expression describing which lists are being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object SchemaListTargetingExpression {
  @scala.inline
  def apply(expression: String = null): SchemaListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTargetingExpression]
  }
}

