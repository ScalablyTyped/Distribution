package typings.levelTranscoder

import typings.levelTranscoder.encodingMod.Encoding
import typings.levelTranscoder.encodingMod.IEncoding
import typings.levelTranscoder.levelTranscoderStrings.format
import typings.node.bufferMod.global.Buffer
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatsMod {
  
  @JSImport("level-transcoder/lib/formats", "BufferFormat")
  @js.native
  open class BufferFormat[TIn, TOut] protected () extends Encoding[TIn, Buffer, TOut] {
    def this(options: Omit[IEncoding[TIn, Buffer, TOut], format]) = this()
  }
  
  @JSImport("level-transcoder/lib/formats", "UTF8Format")
  @js.native
  open class UTF8Format[TIn, TOut] protected () extends Encoding[TIn, String, TOut] {
    def this(options: Omit[IEncoding[TIn, String, TOut], format]) = this()
  }
  
  @JSImport("level-transcoder/lib/formats", "ViewFormat")
  @js.native
  open class ViewFormat[TIn, TOut] protected ()
    extends Encoding[TIn, js.typedarray.Uint8Array, TOut] {
    def this(options: Omit[IEncoding[TIn, js.typedarray.Uint8Array, TOut], format]) = this()
  }
}
