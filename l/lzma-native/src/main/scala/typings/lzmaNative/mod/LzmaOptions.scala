package typings.lzmaNative.mod

import typings.lzmaNative.lzmaNativeStrings.CONCATENATED
import typings.lzmaNative.lzmaNativeStrings.TELL_ANY_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_NO_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_UNSUPPORTED_CHECK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LzmaOptions extends js.Object {
  var blockSize: js.UndefOr[Double] = js.native
  var bufsize: js.UndefOr[Double] = js.native
  var check: js.UndefOr[Check] = js.native
  var flags: js.UndefOr[TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED] = js.native
  var memlimit: js.UndefOr[Double] = js.native
  var preset: js.UndefOr[Preset] = js.native
  var synchronous: js.UndefOr[Boolean] = js.native
  var threads: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object LzmaOptions {
  @scala.inline
  def apply(): LzmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LzmaOptions]
  }
  @scala.inline
  implicit class LzmaOptionsOps[Self <: LzmaOptions] (val x: Self) extends AnyVal {
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    @scala.inline
    def setBufsize(value: Double): Self = this.set("bufsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufsize: Self = this.set("bufsize", js.undefined)
    @scala.inline
    def setCheck(value: Check): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setFlags(value: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setMemlimit(value: Double): Self = this.set("memlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemlimit: Self = this.set("memlimit", js.undefined)
    @scala.inline
    def setPreset(value: Preset): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

