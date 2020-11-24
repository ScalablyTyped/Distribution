package typings.hotShots.mod

import typings.hotShots.anon.Buffer
import typings.hotShots.hotShotsStrings.tcp
import typings.hotShots.hotShotsStrings.udp
import typings.hotShots.hotShotsStrings.uds
import typings.node.dgramMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var bufferFlushInterval: js.UndefOr[Double] = js.native
  
  var bufferHolder: js.UndefOr[Buffer] = js.native
  
  var cacheDns: js.UndefOr[Boolean] = js.native
  
  var cacheDnsTtl: js.UndefOr[Double] = js.native
  
  var errorHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  
  var globalTags: js.UndefOr[Tags] = js.native
  
  var globalize: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var isChild: js.UndefOr[Boolean] = js.native
  
  var maxBufferSize: js.UndefOr[Double] = js.native
  
  var mock: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[tcp | udp | uds] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var socket: js.UndefOr[Socket] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var tagPrefix: js.UndefOr[String] = js.native
  
  var tagSeparator: js.UndefOr[String] = js.native
  
  var telegraf: js.UndefOr[Boolean] = js.native
  
  var udsGracefulErrorHandling: js.UndefOr[Boolean] = js.native
  
  var udsGracefulRestartRateLimit: js.UndefOr[Double] = js.native
  
  var useDefaultRoute: js.UndefOr[Boolean] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setBufferFlushInterval(value: Double): Self = this.set("bufferFlushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferFlushInterval: Self = this.set("bufferFlushInterval", js.undefined)
    
    @scala.inline
    def setBufferHolder(value: Buffer): Self = this.set("bufferHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferHolder: Self = this.set("bufferHolder", js.undefined)
    
    @scala.inline
    def setCacheDns(value: Boolean): Self = this.set("cacheDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDns: Self = this.set("cacheDns", js.undefined)
    
    @scala.inline
    def setCacheDnsTtl(value: Double): Self = this.set("cacheDnsTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDnsTtl: Self = this.set("cacheDnsTtl", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* err */ Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setGlobalTagsVarargs(value: String*): Self = this.set("globalTags", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTags(value: Tags): Self = this.set("globalTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTags: Self = this.set("globalTags", js.undefined)
    
    @scala.inline
    def setGlobalize(value: Boolean): Self = this.set("globalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalize: Self = this.set("globalize", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIsChild(value: Boolean): Self = this.set("isChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChild: Self = this.set("isChild", js.undefined)
    
    @scala.inline
    def setMaxBufferSize(value: Double): Self = this.set("maxBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBufferSize: Self = this.set("maxBufferSize", js.undefined)
    
    @scala.inline
    def setMock(value: Boolean): Self = this.set("mock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMock: Self = this.set("mock", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProtocol(value: tcp | udp | uds): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTagPrefix(value: String): Self = this.set("tagPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagPrefix: Self = this.set("tagPrefix", js.undefined)
    
    @scala.inline
    def setTagSeparator(value: String): Self = this.set("tagSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSeparator: Self = this.set("tagSeparator", js.undefined)
    
    @scala.inline
    def setTelegraf(value: Boolean): Self = this.set("telegraf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelegraf: Self = this.set("telegraf", js.undefined)
    
    @scala.inline
    def setUdsGracefulErrorHandling(value: Boolean): Self = this.set("udsGracefulErrorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdsGracefulErrorHandling: Self = this.set("udsGracefulErrorHandling", js.undefined)
    
    @scala.inline
    def setUdsGracefulRestartRateLimit(value: Double): Self = this.set("udsGracefulRestartRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdsGracefulRestartRateLimit: Self = this.set("udsGracefulRestartRateLimit", js.undefined)
    
    @scala.inline
    def setUseDefaultRoute(value: Boolean): Self = this.set("useDefaultRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultRoute: Self = this.set("useDefaultRoute", js.undefined)
  }
}
