package typings.koaCompress.mod

import typings.koaCompress.koaCompressBooleans.`false`
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressOptions extends js.Object {
  
  /**
    * Options for brotli compression.
    */
  var br: js.UndefOr[BrotliOptions | `false`] = js.native
  
  /**
    * An optional string, which specifies what encoders to use for requests
    * without Accept-Encoding. Default: 'idenity'.
    */
  var defaultEncoding: js.UndefOr[String] = js.native
  
  /**
    * Options for deflate compression.
    */
  var deflate: js.UndefOr[ZlibOptions | `false`] = js.native
  
  /**
    * An optional function that checks the response content type to decide whether to compress. By default, it uses compressible.
    */
  var filter: js.UndefOr[js.Function1[/* mimeType */ String, Boolean]] = js.native
  
  /**
    * Options for gzip compression.
    */
  var gzip: js.UndefOr[ZlibOptions | `false`] = js.native
  
  /**
    * Minimum response size in bytes to compress. Default 1024 bytes or 1kb.
    */
  var threshold: js.UndefOr[Double | String] = js.native
}
object CompressOptions {
  
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    
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
    def setBr(value: BrotliOptions | `false`): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    
    @scala.inline
    def setDeflate(value: ZlibOptions | `false`): Self = this.set("deflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflate: Self = this.set("deflate", js.undefined)
    
    @scala.inline
    def setFilter(value: /* mimeType */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGzip(value: ZlibOptions | `false`): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double | String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
