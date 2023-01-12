package typings.inflation

import typings.inflation.inflationStrings.deflate
import typings.inflation.inflationStrings.gzip
import typings.inflation.inflationStrings.identity
import typings.node.streamMod.Readable
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Automatically unzip an HTTP stream.
    *
    * @returns a stream that emits inflated data from the given stream.
    */
  inline def apply(req: Readable): Readable = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def apply(req: Readable, options: Options): Readable = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  @JSImport("inflation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with ZlibOptions {
    
    /**
      * The encoding of the stream. If not given, will look in `stream.headers['content-encoding']`.
      */
    var gzip: js.UndefOr[deflate | typings.inflation.inflationStrings.gzip | identity] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setGzip(value: deflate | gzip | identity): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    }
  }
}
