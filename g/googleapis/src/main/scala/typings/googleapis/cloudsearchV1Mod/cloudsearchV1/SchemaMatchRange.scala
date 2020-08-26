package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matched range of a snippet [start, end).
  */
@js.native
trait SchemaMatchRange extends js.Object {
  /**
    * End of the match in the snippet.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Starting position of the match in the snippet.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaMatchRange {
  @scala.inline
  def apply(): SchemaMatchRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchRange]
  }
  @scala.inline
  implicit class SchemaMatchRangeOps[Self <: SchemaMatchRange] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

