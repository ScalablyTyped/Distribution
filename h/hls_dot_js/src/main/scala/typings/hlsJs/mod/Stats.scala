package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var mtime: Double = js.native
  var tbuffered: js.UndefOr[Double] = js.native
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double = js.native
  /**
    * performance.now() on load complete
    */
  var tload: Double = js.native
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double = js.native
}

object Stats {
  @scala.inline
  def apply(mtime: Double, tfirst: Double, tload: Double, trequest: Double): Stats = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTfirst(value: Double): Self = this.set("tfirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setTload(value: Double): Self = this.set("tload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrequest(value: Double): Self = this.set("trequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setTbuffered(value: Double): Self = this.set("tbuffered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbuffered: Self = this.set("tbuffered", js.undefined)
  }
  
}

