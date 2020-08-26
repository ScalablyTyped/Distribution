package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.native
  var metrics: js.UndefOr[PrometheusMetricsFactory] = js.native
  var reporter: js.UndefOr[Reporter] = js.native
  var tags: js.UndefOr[js.Any] = js.native
}

object TracingOptions {
  @scala.inline
  def apply(): TracingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingOptions]
  }
  @scala.inline
  implicit class TracingOptionsOps[Self <: TracingOptions] (val x: Self) extends AnyVal {
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
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMetrics(value: PrometheusMetricsFactory): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setReporter(value: Reporter): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setTags(value: js.Any): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

