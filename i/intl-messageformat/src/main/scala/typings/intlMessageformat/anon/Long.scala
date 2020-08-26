package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  var full: Second = js.native
  var long: Second = js.native
  var medium: Minute = js.native
  var short: Hour = js.native
}

object Long {
  @scala.inline
  def apply(full: Second, long: Second, medium: Minute, short: Hour): Long = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
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
    def setFull(value: Second): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def setLong(value: Second): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: Minute): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: Hour): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

