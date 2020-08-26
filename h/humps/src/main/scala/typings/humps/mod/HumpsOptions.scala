package typings.humps.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumpsOptions extends js.Object {
  var process: js.UndefOr[HumpsProcessor] = js.native
  var separator: js.UndefOr[String] = js.native
  var split: js.UndefOr[RegExp] = js.native
}

object HumpsOptions {
  @scala.inline
  def apply(): HumpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumpsOptions]
  }
  @scala.inline
  implicit class HumpsOptionsOps[Self <: HumpsOptions] (val x: Self) extends AnyVal {
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
    def setProcess(
      value: (/* key */ String, /* convert */ HumpsProcessorParameter, /* options */ js.UndefOr[HumpsOptions]) => String
    ): Self = this.set("process", js.Any.fromFunction3(value))
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSplit(value: RegExp): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
  
}

