package typings.graygelf.anon

import typings.graygelf.graygelfStrings.deflate
import typings.graygelf.graygelfStrings.gzip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysCompress extends js.Object {
  
  /**
    * whether to always compress or go by chunkSize
    *
    * @default false
    */
  var alwaysCompress: js.UndefOr[Boolean] = js.native
  
  /**
    * size of chunked messages in bytes
    *
    * @default 1240
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * compression 'gzip' or 'deflate'
    *
    * @default "deflate"
    */
  var compressType: js.UndefOr[gzip | deflate] = js.native
  
  /**
    * graylog host
    *
    * @default "localhost"
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * don't send messages to GrayLog2
    *
    * @default false
    */
  var mock: js.UndefOr[Boolean] = js.native
  
  /**
    * graylog port
    *
    * @default 12201
    */
  var port: js.UndefOr[Double] = js.native
}
object AlwaysCompress {
  
  @scala.inline
  def apply(): AlwaysCompress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysCompress]
  }
  
  @scala.inline
  implicit class AlwaysCompressOps[Self <: AlwaysCompress] (val x: Self) extends AnyVal {
    
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
    def setAlwaysCompress(value: Boolean): Self = this.set("alwaysCompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysCompress: Self = this.set("alwaysCompress", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setCompressType(value: gzip | deflate): Self = this.set("compressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressType: Self = this.set("compressType", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMock(value: Boolean): Self = this.set("mock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMock: Self = this.set("mock", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
