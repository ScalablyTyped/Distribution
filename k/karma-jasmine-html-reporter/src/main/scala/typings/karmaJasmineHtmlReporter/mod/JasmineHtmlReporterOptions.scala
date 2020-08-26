package typings.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineHtmlReporterOptions extends js.Object {
  /**
    * Suppress all messages (overrides other suppress settings)
    */
  var suppressAll: js.UndefOr[Boolean] = js.native
  /** Suppress failed messages */
  var suppressFailed: js.UndefOr[Boolean] = js.native
}

object JasmineHtmlReporterOptions {
  @scala.inline
  def apply(): JasmineHtmlReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineHtmlReporterOptions]
  }
  @scala.inline
  implicit class JasmineHtmlReporterOptionsOps[Self <: JasmineHtmlReporterOptions] (val x: Self) extends AnyVal {
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
    def setSuppressAll(value: Boolean): Self = this.set("suppressAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAll: Self = this.set("suppressAll", js.undefined)
    @scala.inline
    def setSuppressFailed(value: Boolean): Self = this.set("suppressFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressFailed: Self = this.set("suppressFailed", js.undefined)
  }
  
}

