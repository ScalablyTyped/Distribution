package typings.markedjsHtmlDiffer.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  /**
    * the number of characters around the diff result between two HTML
    * @default 40
    */
  var charsAroundDiff: js.UndefOr[Double] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
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
    def setCharsAroundDiff(value: Double): Self = this.set("charsAroundDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsAroundDiff: Self = this.set("charsAroundDiff", js.undefined)
  }
  
}

