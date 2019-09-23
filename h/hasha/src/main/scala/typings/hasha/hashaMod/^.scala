package typings.hasha.hashaMod

import typings.hasha.hashaStrings.buffer
import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.cryptoMod.Hash
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
  def apply(input: HashaInput): String = js.native
  def apply(input: HashaInput, options: Options[buffer]): Buffer = js.native
  /**
  	Asynchronously calculate the hash for a `string`, `Buffer`, or an array thereof.
  	In Node.js 12 or later, the operation is executed using `worker_threads`. A thread is lazily spawned on the first operation and lives until the end of the program execution. It's unrefed, so it won't keep the process alive.
  	@param input - Data you want to hash.
  	While strings are supported you should prefer buffers as they're faster to hash. Although if you already have a string you should not convert it to a buffer.
  	Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  	@returns A hash.
  	@example
  	```
  	import hasha = require('hasha');
  	(async () => {
  		console.log(await hasha.async('unicorn'));
  		//=> 'e233b19aabc7d5e53826fb734d1222f1f0444c3a3fc67ff4af370a66e7cadd2cb24009f1bc86f0bed12ca5fcb226145ad10fc5f650f6ef0959f8aadc5a594b27'
  	})();
  	```
  	*/
  def async(input: HashaInput): js.Promise[String] = js.native
  def async(input: HashaInput, options: Options[ToStringEncoding]): js.Promise[String] = js.native
  @JSName("async")
  def async_buffer(input: HashaInput, options: Options[buffer]): js.Promise[Buffer] = js.native
  /**
  	Calculate the hash for a file.
  	In Node.js 12 or later, the operation is executed using `worker_threads`. A thread is lazily spawned on the first operation and lives until the end of the program execution. It's unrefed, so it won't keep the process alive.
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
  def fromFile(filePath: String): js.Promise[String | Null] = js.native
  def fromFile(filePath: String, options: Options[ToStringEncoding]): js.Promise[String | Null] = js.native
  /**
  	Synchronously calculate the hash for a file.
  	@param filePath - Path to a file you want to hash.
  	@returns The calculated file hash.
  	*/
  def fromFileSync(filePath: String): String = js.native
  def fromFileSync(filePath: String, options: Options[ToStringEncoding]): String = js.native
  @JSName("fromFileSync")
  def fromFileSync_buffer(filePath: String, options: Options[buffer]): Buffer = js.native
  @JSName("fromFile")
  def fromFile_buffer(filePath: String, options: Options[buffer]): js.Promise[Buffer | Null] = js.native
  /**
  	Calculate the hash for a stream.
  	@param stream - A stream you want to hash.
  	@returns The calculated hash.
  	*/
  def fromStream(stream: ReadableStream): js.Promise[String | Null] = js.native
  def fromStream(stream: ReadableStream, options: Options[ToStringEncoding]): js.Promise[String | Null] = js.native
  @JSName("fromStream")
  def fromStream_buffer(stream: ReadableStream, options: Options[buffer]): js.Promise[Buffer | Null] = js.native
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
  def stream(): Hash = js.native
  def stream(options: Options[HashaEncoding]): Hash = js.native
}

