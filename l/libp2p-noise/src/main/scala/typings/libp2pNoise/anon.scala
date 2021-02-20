package typings.libp2pNoise

import typings.itPbRpc.anon.PartialOpts
import typings.itPbRpc.mod.WrappedDuplex
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.CipherState
import typings.libp2pNoise.mod.LengthDecoderFunction
import typings.libp2pNoise.mod.LengthEncoderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cs1 extends StObject {
    
    var cs1: CipherState = js.native
    
    var cs2: CipherState = js.native
  }
  object Cs1 {
    
    @scala.inline
    def apply(cs1: CipherState, cs2: CipherState): Cs1 = {
      val __obj = js.Dynamic.literal(cs1 = cs1.asInstanceOf[js.Any], cs2 = cs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cs1]
    }
    
    @scala.inline
    implicit class Cs1MutableBuilder[Self <: Cs1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(duplex: js.Any): WrappedDuplex = js.native
    def apply(duplex: js.Any, opts: PartialOpts): WrappedDuplex = js.native
  }
  
  /* Inlined std.Partial<libp2p-noise.it-length-prefixed.DecoderOptions> */
  @js.native
  trait PartialDecoderOptions extends StObject {
    
    var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.native
    
    var maxDataLength: js.UndefOr[Double] = js.native
    
    var maxLengthLength: js.UndefOr[Double] = js.native
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
    }
  }
  
  /* Inlined std.Partial<{  lengthEncoder :libp2p-noise.it-length-prefixed.LengthEncoderFunction}> */
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
  
  @js.native
  trait Plaintext extends StObject {
    
    var plaintext: bytes = js.native
    
    var valid: Boolean = js.native
  }
  object Plaintext {
    
    @scala.inline
    def apply(plaintext: bytes, valid: Boolean): Plaintext = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plaintext]
    }
    
    @scala.inline
    implicit class PlaintextMutableBuilder[Self <: Plaintext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaintext(value: bytes): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
