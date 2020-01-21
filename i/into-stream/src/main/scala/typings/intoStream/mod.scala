package typings.intoStream

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Readable
import typings.std.ArrayBuffer
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("into-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof intoStream */ js.Any = js.native
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
  type Input = Buffer | TypedArray | ArrayBuffer | String | (Iterable[Buffer | String])
  type InputObject = StringDictionary[js.Any] | Iterable[StringDictionary[js.Any]]
}

