package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a floating point mean metric contribution.
  */
@js.native
trait SchemaFloatingPointMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double] = js.native
}

object SchemaFloatingPointMean {
  @scala.inline
  def apply(): SchemaFloatingPointMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointMean]
  }
  @scala.inline
  implicit class SchemaFloatingPointMeanOps[Self <: SchemaFloatingPointMean] (val x: Self) extends AnyVal {
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
    def setCount(value: SchemaSplitInt64): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
  
}

