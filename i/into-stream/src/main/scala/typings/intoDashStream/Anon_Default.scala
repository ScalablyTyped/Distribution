package typings.intoDashStream

import typings.intoDashStream.intoDashStreamMod.Input
import typings.intoDashStream.intoDashStreamMod.InputObject
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(input: js.Promise[Input]): Readable = js.native
  /**
  	Convert `input` into a stream. Adheres to the requested chunk size, except for `array` where each element will be a chunk.
  	@param input - The input to convert to a stream.
  	@returns A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	@example
  	```
  	import intoStream = require('into-stream');
  	intoStream('unicorn').pipe(process.stdout);
  	//=> 'unicorn'
  	```
  	*/
  def apply(input: Input): Readable = js.native
  def `object`(input: js.Promise[InputObject]): Readable = js.native
  /**
  	Convert object `input` into a stream.
  	@param input - The object input to convert to a stream.
  	@returns A [readable object stream](https://nodejs.org/api/stream.html#stream_object_mode).
  	*/
  def `object`(input: InputObject): Readable = js.native
}

