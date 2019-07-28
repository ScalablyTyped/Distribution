package typings.gzipDashSize.gzipDashSizeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gzip-size", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Get the gzipped size of a string or buffer.
  	@returns The gzipped size of `input`.
  	*/
  def apply(input: String): js.Promise[Double] = js.native
  def apply(input: String, options: Options): js.Promise[Double] = js.native
  def apply(input: Buffer): js.Promise[Double] = js.native
  def apply(input: Buffer, options: Options): js.Promise[Double] = js.native
  /**
  	Get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  def file(path: String): js.Promise[Double] = js.native
  def file(path: String, options: Options): js.Promise[Double] = js.native
  /**
  	Synchronously get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  def fileSync(path: String): Double = js.native
  def fileSync(path: String, options: Options): Double = js.native
  /**
  	@returns A stream that emits a `gzip-size` event and has a `gzipSize` property.
  	*/
  def stream(): GzipSizeStream = js.native
  def stream(options: Options): GzipSizeStream = js.native
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
  def sync(input: String): Double = js.native
  def sync(input: String, options: Options): Double = js.native
  def sync(input: Buffer): Double = js.native
  def sync(input: Buffer, options: Options): Double = js.native
}

