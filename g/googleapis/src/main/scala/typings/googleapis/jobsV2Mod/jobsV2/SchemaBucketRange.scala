package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents starting and ending value of a range in double.
  */
@js.native
trait SchemaBucketRange extends js.Object {
  /**
    * Starting value of the bucket range.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Ending value of the bucket range.
    */
  var to: js.UndefOr[Double] = js.native
}

object SchemaBucketRange {
  @scala.inline
  def apply(): SchemaBucketRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketRange]
  }
  @scala.inline
  implicit class SchemaBucketRangeOps[Self <: SchemaBucketRange] (val x: Self) extends AnyVal {
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

