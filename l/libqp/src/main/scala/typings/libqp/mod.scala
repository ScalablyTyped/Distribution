package typings.libqp

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libqp", "Decoder")
  @js.native
  class Decoder () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("libqp", "Encoder")
  @js.native
  class Encoder () extends Transform {
    def this(opts: EncoderOptions) = this()
  }
  
  @JSImport("libqp", "decode")
  @js.native
  def decode(input: String): Buffer = js.native
  
  @JSImport("libqp", "encode")
  @js.native
  def encode(buffer: String): String = js.native
  @JSImport("libqp", "encode")
  @js.native
  def encode(buffer: Buffer): String = js.native
  
  @JSImport("libqp", "wrap")
  @js.native
  def wrap(str: String): String = js.native
  @JSImport("libqp", "wrap")
  @js.native
  def wrap(str: String, lineLength: Double): String = js.native
  
  @js.native
  trait EncoderOptions extends TransformOptions {
    
    var lineLength: js.UndefOr[Double] = js.native
  }
  object EncoderOptions {
    
    @scala.inline
    def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    @scala.inline
    implicit class EncoderOptionsMutableBuilder[Self <: EncoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    }
  }
}
