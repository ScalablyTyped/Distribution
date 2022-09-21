package typings.gzipSize

import typings.gzipSize.gzipSizeStrings.`gzip-size`
import typings.node.bufferMod.global.Buffer
import typings.node.nodeStreamMod.PassThrough
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gzipSize(input: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def gzipSize(input: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def gzipSize(input: Buffer): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def gzipSize(input: Buffer, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def gzipSizeFromFile(filePath: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def gzipSizeFromFile(filePath: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeFromFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def gzipSizeFromFileSync(filePath: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeFromFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def gzipSizeFromFileSync(filePath: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeFromFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def gzipSizeStream(): GzipSizeStream_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeStream")().asInstanceOf[GzipSizeStream_]
  inline def gzipSizeStream(options: Options): GzipSizeStream_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeStream")(options.asInstanceOf[js.Any]).asInstanceOf[GzipSizeStream_]
  
  inline def gzipSizeSync(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeSync")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def gzipSizeSync(input: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def gzipSizeSync(input: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeSync")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def gzipSizeSync(input: Buffer, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSizeSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait GzipSizeStream_ extends PassThrough {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_gzipsize(event: `gzip-size`, size: Double): Boolean = js.native
    
    /**
    	Contains the gzip size of the stream after it is finished. Since this happens asynchronously, it is recommended you use the `gzip-size` event instead.
    	*/
    var gzipSize: js.UndefOr[Double] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  }
  
  type Options = ZlibOptions
}
