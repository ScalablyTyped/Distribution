package typings.intoStream

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Readable
import typings.std.ArrayBuffer
import typings.std.AsyncIterable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: js.Promise[Input]): Readable = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
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
  @scala.inline
  def apply(input: Input): Readable = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  @JSImport("into-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def `object`(input: js.Promise[InputObject]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  /**
  	Convert object `input` into a stream.
  	@param input - The object input to convert to a stream.
  	@returns A [readable object stream](https://nodejs.org/api/stream.html#stream_object_mode).
  	*/
  @scala.inline
  def `object`(input: InputObject): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  type Input = Buffer | TypedArray | ArrayBuffer | String | (Iterable[Buffer | String]) | (AsyncIterable[Buffer | String])
  
  /* eslint-disable @typescript-eslint/ban-types */
  type InputObject = js.Object | Iterable[js.Object] | AsyncIterable[js.Object]
}
