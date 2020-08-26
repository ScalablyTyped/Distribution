package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfig extends js.Object {
  var disable: js.UndefOr[Boolean] = js.native
  var reporter: js.UndefOr[ReporterConfig] = js.native
  var sampler: js.UndefOr[SamplerConfig] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var shareRpcSpan: js.UndefOr[Boolean] = js.native
  var traceId128bit: js.UndefOr[Boolean] = js.native
}

object TracingConfig {
  @scala.inline
  def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  @scala.inline
  implicit class TracingConfigOps[Self <: TracingConfig] (val x: Self) extends AnyVal {
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
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setReporter(value: ReporterConfig): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setSampler(value: SamplerConfig): Self = this.set("sampler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampler: Self = this.set("sampler", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setShareRpcSpan(value: Boolean): Self = this.set("shareRpcSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareRpcSpan: Self = this.set("shareRpcSpan", js.undefined)
    @scala.inline
    def setTraceId128bit(value: Boolean): Self = this.set("traceId128bit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceId128bit: Self = this.set("traceId128bit", js.undefined)
  }
  
}

