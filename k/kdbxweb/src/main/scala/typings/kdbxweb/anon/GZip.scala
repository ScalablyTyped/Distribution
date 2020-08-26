package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GZip extends js.Object {
  var GZip: Double = js.native
  var None: Double = js.native
}

object GZip {
  @scala.inline
  def apply(GZip: Double, None: Double): GZip = {
    val __obj = js.Dynamic.literal(GZip = GZip.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any])
    __obj.asInstanceOf[GZip]
  }
  @scala.inline
  implicit class GZipOps[Self <: GZip] (val x: Self) extends AnyVal {
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
    def setGZip(value: Double): Self = this.set("GZip", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Double): Self = this.set("None", value.asInstanceOf[js.Any])
  }
  
}

