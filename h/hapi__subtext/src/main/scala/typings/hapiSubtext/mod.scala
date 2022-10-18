package typings.hapiSubtext

import typings.hapiSubtext.hapiSubtextStrings.data
import typings.hapiSubtext.hapiSubtextStrings.file
import typings.hapiSubtext.hapiSubtextStrings.stream
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Transform
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/subtext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(req: IncomingMessage, tap: Null, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(req.asInstanceOf[js.Any], tap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def parse(req: IncomingMessage, tap: WritableStream, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(req.asInstanceOf[js.Any], tap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  trait ContentDecoders extends StObject {
    
    var br: js.UndefOr[js.Function1[/* options */ BrotliOptions | Null, Transform]] = js.undefined
    
    var compress: js.UndefOr[js.Function1[/* options */ BrotliOptions | Null, Transform]] = js.undefined
    
    var deflate: js.UndefOr[js.Function1[/* options */ ZlibOptions | Null, Transform]] = js.undefined
    
    var gzip: js.UndefOr[js.Function1[/* options */ ZlibOptions | Null, Transform]] = js.undefined
  }
  object ContentDecoders {
    
    inline def apply(): ContentDecoders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentDecoders]
    }
    
    extension [Self <: ContentDecoders](x: Self) {
      
      inline def setBr(value: /* options */ BrotliOptions | Null => Transform): Self = StObject.set(x, "br", js.Any.fromFunction1(value))
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setCompress(value: /* options */ BrotliOptions | Null => Transform): Self = StObject.set(x, "compress", js.Any.fromFunction1(value))
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setDeflate(value: /* options */ ZlibOptions | Null => Transform): Self = StObject.set(x, "deflate", js.Any.fromFunction1(value))
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setGzip(value: /* options */ ZlibOptions | Null => Transform): Self = StObject.set(x, "gzip", js.Any.fromFunction1(value))
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    }
  }
  
  trait DecompressionOptions extends StObject {
    
    var br: js.UndefOr[BrotliOptions] = js.undefined
    
    var compress: js.UndefOr[BrotliOptions] = js.undefined
    
    var deflate: js.UndefOr[ZlibOptions] = js.undefined
    
    var gzip: js.UndefOr[ZlibOptions] = js.undefined
  }
  object DecompressionOptions {
    
    inline def apply(): DecompressionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecompressionOptions]
    }
    
    extension [Self <: DecompressionOptions](x: Self) {
      
      inline def setBr(value: BrotliOptions): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setCompress(value: BrotliOptions): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setDeflate(value: ZlibOptions): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setGzip(value: ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    }
  }
  
  trait MultipartOptions extends StObject {
    
    var output: data | stream | file
  }
  object MultipartOptions {
    
    inline def apply(output: data | stream | file): MultipartOptions = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartOptions]
    }
    
    extension [Self <: MultipartOptions](x: Self) {
      
      inline def setOutput(value: data | stream | file): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    var compression: js.UndefOr[DecompressionOptions] = js.undefined
    
    var decoders: js.UndefOr[ContentDecoders] = js.undefined
    
    var defaultContentType: js.UndefOr[String] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var multipart: js.UndefOr[Boolean | MultipartOptions] = js.undefined
    
    var output: data | stream | file
    
    var `override`: js.UndefOr[String] = js.undefined
    
    var parse: Boolean
    
    var querystring: js.UndefOr[
        js.Function1[/* str */ String, Partial[Record[String, String | js.Array[String]]]]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uploads: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(output: data | stream | file, parse: Boolean): Options = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setCompression(value: DecompressionOptions): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDecoders(value: ContentDecoders): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setDecodersUndefined: Self = StObject.set(x, "decoders", js.undefined)
      
      inline def setDefaultContentType(value: String): Self = StObject.set(x, "defaultContentType", value.asInstanceOf[js.Any])
      
      inline def setDefaultContentTypeUndefined: Self = StObject.set(x, "defaultContentType", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setMultipart(value: Boolean | MultipartOptions): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      inline def setOutput(value: data | stream | file): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOverride(value: String): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setQuerystring(value: /* str */ String => Partial[Record[String, String | js.Array[String]]]): Self = StObject.set(x, "querystring", js.Any.fromFunction1(value))
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var mime: String
    
    /**
      * Will be `null` if no payload was present on request
      */
    var payload: Any
  }
  object Result {
    
    inline def apply(mime: String, payload: Any): Result = {
      val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
