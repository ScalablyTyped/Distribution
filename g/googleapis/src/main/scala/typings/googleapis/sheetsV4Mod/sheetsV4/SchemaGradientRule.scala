package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that applies a gradient color scale format, based on the
  * interpolation points listed. The format of a cell will vary based on its
  * contents as compared to the values of the interpolation points.
  */
@js.native
trait SchemaGradientRule extends js.Object {
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
}

object SchemaGradientRule {
  @scala.inline
  def apply(): SchemaGradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradientRule]
  }
  @scala.inline
  implicit class SchemaGradientRuleOps[Self <: SchemaGradientRule] (val x: Self) extends AnyVal {
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
    def setMaxpoint(value: SchemaInterpolationPoint): Self = this.set("maxpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxpoint: Self = this.set("maxpoint", js.undefined)
    @scala.inline
    def setMidpoint(value: SchemaInterpolationPoint): Self = this.set("midpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidpoint: Self = this.set("midpoint", js.undefined)
    @scala.inline
    def setMinpoint(value: SchemaInterpolationPoint): Self = this.set("minpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinpoint: Self = this.set("minpoint", js.undefined)
  }
  
}

