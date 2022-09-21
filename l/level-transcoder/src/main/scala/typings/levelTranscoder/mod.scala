package typings.levelTranscoder

import typings.levelTranscoder.encodingMod.IEncoding
import typings.levelTranscoder.encodingMod.KnownEncoding
import typings.levelTranscoder.encodingMod.KnownEncodingName
import typings.levelTranscoder.encodingMod.MixedEncoding
import typings.levelTranscoder.levelTranscoderStrings.buffer
import typings.levelTranscoder.levelTranscoderStrings.utf8
import typings.levelTranscoder.levelTranscoderStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("level-transcoder", "Encoding")
  @js.native
  abstract class Encoding[TIn, TFormat, TOut] protected ()
    extends typings.levelTranscoder.encodingMod.Encoding[TIn, TFormat, TOut] {
    def this(options: IEncoding[TIn, TFormat, TOut]) = this()
  }
  
  @JSImport("level-transcoder", "Transcoder")
  @js.native
  open class Transcoder[T] protected () extends StObject {
    /**
      * Create a Transcoder.
      * @param formats Formats supported by consumer.
      */
    def this(formats: js.Array[buffer | view | utf8]) = this()
    
    def encoding(encoding: String): typings.levelTranscoder.encodingMod.Encoding[Any, T, Any] = js.native
    def encoding[N /* <: KnownEncodingName */](encoding: N): KnownEncoding[N, T] = js.native
    /**
      * Get the given encoding, creating a transcoder encoding if necessary.
      * @param encoding Named encoding or encoding object.
      */
    def encoding[TIn, TFormat, TOut](encoding: MixedEncoding[TIn, TFormat, TOut]): typings.levelTranscoder.encodingMod.Encoding[TIn, T, TOut] = js.native
    
    /**
      * Get an array of supported encoding objects.
      */
    def encodings(): js.Array[typings.levelTranscoder.encodingMod.Encoding[Any, T, Any]] = js.native
  }
}
