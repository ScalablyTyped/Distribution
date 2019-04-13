package typings
package intoDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply(input: intoDashStreamLib.intoDashStreamMod.Input): nodeLib.streamMod.Readable = js.native
  def apply(input: js.Promise[intoDashStreamLib.intoDashStreamMod.Input]): nodeLib.streamMod.Readable = js.native
  /**
  	Convert object `input` into a stream.
  	@param input - The object input to convert to a stream.
  	@returns A [readable object stream](https://nodejs.org/api/stream.html#stream_object_mode).
  	*/
  def `object`(input: intoDashStreamLib.intoDashStreamMod.InputObject): nodeLib.streamMod.Readable = js.native
  def `object`(input: js.Promise[intoDashStreamLib.intoDashStreamMod.InputObject]): nodeLib.streamMod.Readable = js.native
}

