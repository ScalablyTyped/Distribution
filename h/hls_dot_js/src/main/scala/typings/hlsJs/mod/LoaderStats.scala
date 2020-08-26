package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderStats extends js.Object {
  /**
    * download bandwitdh in bit/s
    */
  var bw: Double = js.native
  /**
    * number of loaded bytes
    */
  var loaded: Double = js.native
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double = js.native
  /**
    * performance.now() on load complete
    */
  var tload: Double = js.native
  /**
    * total nb of bytes
    */
  var total: Double = js.native
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double = js.native
}

object LoaderStats {
  @scala.inline
  def apply(bw: Double, loaded: Double, tfirst: Double, tload: Double, total: Double, trequest: Double): LoaderStats = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderStats]
  }
  @scala.inline
  implicit class LoaderStatsOps[Self <: LoaderStats] (val x: Self) extends AnyVal {
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
    def setBw(value: Double): Self = this.set("bw", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTfirst(value: Double): Self = this.set("tfirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setTload(value: Double): Self = this.set("tload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrequest(value: Double): Self = this.set("trequest", value.asInstanceOf[js.Any])
  }
  
}

