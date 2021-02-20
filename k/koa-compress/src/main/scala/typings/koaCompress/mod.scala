package typings.koaCompress

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaCompress.koaCompressBooleans.`false`
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compress middleware for Koa
    */
  @JSImport("koa-compress", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-compress", JSImport.Namespace)
  @js.native
  def apply(options: CompressOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait CompressOptions extends StObject {
    
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
    implicit class CompressOptionsMutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBr(value: BrotliOptions | `false`): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDeflate(value: ZlibOptions | `false`): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      @scala.inline
      def setFilter(value: /* mimeType */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGzip(value: ZlibOptions | `false`): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double | String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
