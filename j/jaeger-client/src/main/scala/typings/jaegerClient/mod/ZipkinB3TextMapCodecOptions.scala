package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipkinB3TextMapCodecOptions extends js.Object {
  
  var baggagePrefix: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[MetricsFactory] = js.native
  
  var urlEncoding: js.UndefOr[Boolean] = js.native
}
object ZipkinB3TextMapCodecOptions {
  
  @scala.inline
  def apply(): ZipkinB3TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipkinB3TextMapCodecOptions]
  }
  
  @scala.inline
  implicit class ZipkinB3TextMapCodecOptionsOps[Self <: ZipkinB3TextMapCodecOptions] (val x: Self) extends AnyVal {
    
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
    def setBaggagePrefix(value: String): Self = this.set("baggagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaggagePrefix: Self = this.set("baggagePrefix", js.undefined)
    
    @scala.inline
    def setMetrics(value: MetricsFactory): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setUrlEncoding(value: Boolean): Self = this.set("urlEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEncoding: Self = this.set("urlEncoding", js.undefined)
  }
}
