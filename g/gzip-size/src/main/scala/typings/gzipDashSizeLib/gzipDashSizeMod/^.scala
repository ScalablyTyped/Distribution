package typings
package gzipDashSizeLib.gzipDashSizeMod

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
  def apply(input: java.lang.String): js.Promise[scala.Double] = js.native
  def apply(input: java.lang.String, options: Options): js.Promise[scala.Double] = js.native
  def apply(input: nodeLib.Buffer): js.Promise[scala.Double] = js.native
  def apply(input: nodeLib.Buffer, options: Options): js.Promise[scala.Double] = js.native
  /**
  	Get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  def file(path: java.lang.String): js.Promise[scala.Double] = js.native
  def file(path: java.lang.String, options: Options): js.Promise[scala.Double] = js.native
  /**
  	Synchronously get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  def fileSync(path: java.lang.String): scala.Double = js.native
  def fileSync(path: java.lang.String, options: Options): scala.Double = js.native
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
  def sync(input: java.lang.String): scala.Double = js.native
  def sync(input: java.lang.String, options: Options): scala.Double = js.native
  def sync(input: nodeLib.Buffer): scala.Double = js.native
  def sync(input: nodeLib.Buffer, options: Options): scala.Double = js.native
}

