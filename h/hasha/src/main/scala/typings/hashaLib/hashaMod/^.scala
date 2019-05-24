package typings
package hashaLib.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hasha", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Calculate the hash for a `string`, `Buffer`, or an array thereof.
  	@param input - Data you want to hash.
  	While strings are supported you should prefer buffers as they're faster to hash. Although if you already have a string you should not convert it to a buffer.
  	Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  	@returns A hash.
  	@example
  	```
  	import hasha = require('hasha');
  	hasha('unicorn');
  	//=> 'e233b19aabc7d5e53826fb734d1222f1f0444c3a3fc67ff4af370a66e7cadd2cb24009f1bc86f0bed12ca5fcb226145ad10fc5f650f6ef0959f8aadc5a594b27'
  	```
  	*/
  def apply(input: HashaInput): java.lang.String = js.native
  def apply(input: HashaInput, options: Options[hashaLib.hashaLibStrings.buffer]): nodeLib.Buffer = js.native
  /**
  	Calculate the hash for a file.
  	@param filePath - Path to a file you want to hash.
  	@returns The calculated file hash.
  	@example
  	```
  	import hasha = require('hasha');
  	(async () => {
  		// Get the MD5 hash of an image
  		const hash = await hasha.fromFile('unicorn.png', {algorithm: 'md5'});
  		console.log(hash);
  		//=> '1abcb33beeb811dca15f0ac3e47b88d9'
  	})();
  	```
  	*/
  def fromFile(filePath: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def fromFile(filePath: java.lang.String, options: Options[ToStringEncoding]): js.Promise[java.lang.String | scala.Null] = js.native
  /**
  	Synchronously calculate the hash for a file.
  	@param filePath - Path to a file you want to hash.
  	@returns The calculated file hash.
  	*/
  def fromFileSync(filePath: java.lang.String): java.lang.String = js.native
  def fromFileSync(filePath: java.lang.String, options: Options[ToStringEncoding]): java.lang.String = js.native
  @JSName("fromFileSync")
  def fromFileSync_buffer(filePath: java.lang.String, options: Options[hashaLib.hashaLibStrings.buffer]): nodeLib.Buffer = js.native
  @JSName("fromFile")
  def fromFile_buffer(filePath: java.lang.String, options: Options[hashaLib.hashaLibStrings.buffer]): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  /**
  	Calculate the hash for a stream.
  	@param stream - A stream you want to hash.
  	@returns The calculated hash.
  	*/
  def fromStream(stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[java.lang.String | scala.Null] = js.native
  def fromStream(stream: nodeLib.NodeJSNs.ReadableStream, options: Options[ToStringEncoding]): js.Promise[java.lang.String | scala.Null] = js.native
  @JSName("fromStream")
  def fromStream_buffer(stream: nodeLib.NodeJSNs.ReadableStream, options: Options[hashaLib.hashaLibStrings.buffer]): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  /**
  	Create a [hash transform stream](https://nodejs.org/api/crypto.html#crypto_class_hash).
  	@returns The created hash transform stream.
  	@example
  	```
  	import hasha = require('hasha');
  	// Hash the process input and output the hash sum
  	process.stdin.pipe(hasha.stream()).pipe(process.stdout);
  	```
  	*/
  def stream(): nodeLib.cryptoMod.Hash = js.native
  def stream(options: Options[HashaEncoding]): nodeLib.cryptoMod.Hash = js.native
}

