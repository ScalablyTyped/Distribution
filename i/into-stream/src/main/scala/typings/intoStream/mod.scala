package typings.intoStream

import typings.node.NodeJS.TypedArray
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* eslint-enable @typescript-eslint/ban-types */
  object default {
    
    inline def apply(input: js.Promise[Input]): Readable = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
    /**
    	Convert `input` into a stream. Adheres to the requested chunk size, except for `array` where each element will be a chunk.
    	@param input - The input to convert to a stream.
    	@returns A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
    	@example
    	```
    	import intoStream from 'into-stream';
    	intoStream('unicorn').pipe(process.stdout);
    	//=> 'unicorn'
    	```
    	*/
    inline def apply(input: Input): Readable = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
    
    @JSImport("into-stream", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def `object`(input: js.Promise[ObjectInput]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
    /**
    	Convert object `input` into a stream.
    	@param input - The object input to convert to a stream.
    	@returns A [readable object stream](https://nodejs.org/api/stream.html#stream_object_mode).
    	*/
    inline def `object`(input: ObjectInput): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  }
  
  type Input = Buffer | TypedArray | js.typedarray.ArrayBuffer | String | (js.Iterable[Buffer | String]) | (AsyncIterable[Buffer | String])
  
  type ObjectInput = js.Object | js.Iterable[js.Object] | AsyncIterable[js.Object]
}
