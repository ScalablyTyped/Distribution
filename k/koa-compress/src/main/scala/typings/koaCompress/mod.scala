package typings.koaCompress

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaCompress.koaCompressBooleans.`false`
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compress middleware for Koa
    */
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(options: CompressOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-compress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompressOptions extends StObject {
    
    /**
      * Options for brotli compression.
      */
    var br: js.UndefOr[BrotliOptions | `false`] = js.undefined
    
    /**
      * An optional string, which specifies what encoders to use for requests
      * without Accept-Encoding. Default: 'idenity'.
      */
    var defaultEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * Options for deflate compression.
      */
    var deflate: js.UndefOr[ZlibOptions | `false`] = js.undefined
    
    /**
      * An optional function that checks the response content type to decide whether to compress. By default, it uses compressible.
      */
    var filter: js.UndefOr[js.Function1[/* mimeType */ String, Boolean]] = js.undefined
    
    /**
      * Options for gzip compression.
      */
    var gzip: js.UndefOr[ZlibOptions | `false`] = js.undefined
    
    /**
      * Minimum response size in bytes to compress. Default 1024 bytes or 1kb.
      */
    var threshold: js.UndefOr[Double | String] = js.undefined
  }
  object CompressOptions {
    
    inline def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    extension [Self <: CompressOptions](x: Self) {
      
      inline def setBr(value: BrotliOptions | `false`): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setDeflate(value: ZlibOptions | `false`): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setFilter(value: /* mimeType */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGzip(value: ZlibOptions | `false`): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setThreshold(value: Double | String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
