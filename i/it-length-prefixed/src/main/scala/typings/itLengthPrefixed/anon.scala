package typings.itLengthPrefixed

import typings.bl.mod.^
import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itLengthPrefixed.mod.LengthEncoderFunction
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<it-length-prefixed.it-length-prefixed.DecoderOptions<bl.bl.^>> */
  @js.native
  trait PartialDecoderOptions extends StObject {
    
    var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.native
    
    var maxDataLength: js.UndefOr[Double] = js.native
    
    var maxLengthLength: js.UndefOr[Double] = js.native
    
    var onData: js.UndefOr[js.Function1[/* data */ ^ | Buffer, ^]] = js.native
  }
  object PartialDecoderOptions {
    
    @scala.inline
    def apply(): PartialDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDecoderOptions]
    }
    
    @scala.inline
    implicit class PartialDecoderOptionsMutableBuilder[Self <: PartialDecoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthDecoderUndefined: Self = StObject.set(x, "lengthDecoder", js.undefined)
      
      @scala.inline
      def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDataLengthUndefined: Self = StObject.set(x, "maxDataLength", js.undefined)
      
      @scala.inline
      def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthLengthUndefined: Self = StObject.set(x, "maxLengthLength", js.undefined)
      
      @scala.inline
      def setOnData(value: /* data */ ^ | Buffer => ^): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  lengthEncoder :it-length-prefixed.it-length-prefixed.LengthEncoderFunction}> */
  @js.native
  trait PartiallengthEncoderLengt extends StObject {
    
    var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.native
  }
  object PartiallengthEncoderLengt {
    
    @scala.inline
    def apply(): PartiallengthEncoderLengt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartiallengthEncoderLengt]
    }
    
    @scala.inline
    implicit class PartiallengthEncoderLengtMutableBuilder[Self <: PartiallengthEncoderLengt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
    }
  }
}
