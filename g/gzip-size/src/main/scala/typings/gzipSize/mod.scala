package typings.gzipSize

import typings.gzipSize.gzipSizeStrings.`gzip-size`
import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the gzipped size of a string or buffer.
  	@returns The gzipped size of `input`.
  	*/
  @scala.inline
  def apply(input: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(input: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(input: Buffer): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(input: Buffer, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  @scala.inline
  def file(path: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def file(path: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  /**
  	Synchronously get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  @scala.inline
  def fileSync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def fileSync(path: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
  	@returns A stream that emits a `gzip-size` event and has a `gzipSize` property.
  	*/
  @scala.inline
  def stream(): GzipSizeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[GzipSizeStream]
  @scala.inline
  def stream(options: Options): GzipSizeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any]).asInstanceOf[GzipSizeStream]
  
  /**
  	Synchronously get the gzipped size of a string or buffer.
  	@returns The gzipped size of `input`.
  	@example
  	```
  	import gzipSize = require('gzip-size');
  	const text = 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.';
  	console.log(text.length);
  	//=> 191
  	console.log(gzipSize.sync(text));
  	//=> 78
  	```
  	*/
  @scala.inline
  def sync(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def sync(input: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def sync(input: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def sync(input: Buffer, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait GzipSizeStream extends PassThrough {
    
    @JSName("addListener")
    def addListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_gzipsize(event: `gzip-size`, size: Double): Boolean = js.native
    
    /**
    		Contains the gzip size of the stream after it is finished. Since this happens asynchronously, it is recommended you use the `gzip-size` event instead.
    		*/
    var gzipSize: js.UndefOr[Double] = js.native
    
    @JSName("off")
    def off_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("on")
    def on_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  }
  
  type Options = ZlibOptions
}
