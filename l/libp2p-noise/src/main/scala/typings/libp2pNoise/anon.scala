package typings.libp2pNoise

import typings.itPbRpc.anon.PartialOpts
import typings.itPbRpc.mod.WrappedDuplex
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.CipherState
import typings.libp2pNoise.mod.LengthDecoderFunction
import typings.libp2pNoise.mod.LengthEncoderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cs1 extends StObject {
    
    var cs1: CipherState
    
    var cs2: CipherState
  }
  object Cs1 {
    
    inline def apply(cs1: CipherState, cs2: CipherState): Cs1 = {
      val __obj = js.Dynamic.literal(cs1 = cs1.asInstanceOf[js.Any], cs2 = cs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cs1]
    }
    
    extension [Self <: Cs1](x: Self) {
      
      inline def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      inline def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(duplex: js.Any): WrappedDuplex = js.native
    def apply(duplex: js.Any, opts: PartialOpts): WrappedDuplex = js.native
  }
  
  /* Inlined std.Partial<libp2p-noise.it-length-prefixed.DecoderOptions> */
  trait PartialDecoderOptions extends StObject {
    
    var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.undefined
    
    var maxDataLength: js.UndefOr[Double] = js.undefined
    
    var maxLengthLength: js.UndefOr[Double] = js.undefined
  }
  object PartialDecoderOptions {
    
    inline def apply(): PartialDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDecoderOptions]
    }
    
    extension [Self <: PartialDecoderOptions](x: Self) {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setLengthDecoderUndefined: Self = StObject.set(x, "lengthDecoder", js.undefined)
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLengthUndefined: Self = StObject.set(x, "maxDataLength", js.undefined)
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLengthUndefined: Self = StObject.set(x, "maxLengthLength", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  lengthEncoder :libp2p-noise.it-length-prefixed.LengthEncoderFunction}> */
  trait PartiallengthEncoderLengt extends StObject {
    
    var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.undefined
  }
  object PartiallengthEncoderLengt {
    
    inline def apply(): PartiallengthEncoderLengt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartiallengthEncoderLengt]
    }
    
    extension [Self <: PartiallengthEncoderLengt](x: Self) {
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
    }
  }
  
  trait Plaintext extends StObject {
    
    var plaintext: bytes
    
    var valid: Boolean
  }
  object Plaintext {
    
    inline def apply(plaintext: bytes, valid: Boolean): Plaintext = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plaintext]
    }
    
    extension [Self <: Plaintext](x: Self) {
      
      inline def setPlaintext(value: bytes): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
