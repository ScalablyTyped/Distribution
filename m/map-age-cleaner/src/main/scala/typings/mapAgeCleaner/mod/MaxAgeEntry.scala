package typings.mapAgeCleaner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAgeEntry extends Entry {
  var maxAge: Double = js.native
}

object MaxAgeEntry {
  @scala.inline
  def apply(maxAge: Double): MaxAgeEntry = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeEntry]
  }
  @scala.inline
  implicit class MaxAgeEntryOps[Self <: MaxAgeEntry] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
  }
  
}

