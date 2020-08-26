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
  def apply(): SchemaKeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValueTargetingExpression]
  }
  @scala.inline
  implicit class SchemaKeyValueTargetingExpressionOps[Self <: SchemaKeyValueTargetingExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
  }
  
}

