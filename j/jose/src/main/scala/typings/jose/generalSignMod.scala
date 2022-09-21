package typings.jose

import typings.jose.typesMod.GeneralJWS
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.SignOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalSignMod {
  
  @JSImport("jose/dist/types/jws/general/sign", "GeneralSign")
  @js.native
  open class GeneralSign protected () extends StObject {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
    
    /* private */ var _payload: Any = js.native
    
    /* private */ var _signatures: Any = js.native
    
    def addSignature(key: js.typedarray.Uint8Array): Signature = js.native
    def addSignature(key: js.typedarray.Uint8Array, options: SignOptions): Signature = js.native
    /**
      * Adds an additional signature for the General JWS object.
      *
      * @param key Private Key or Secret to sign the individual JWS signature with.
      * @param options JWS Sign options.
      */
    def addSignature(key: KeyLike): Signature = js.native
    def addSignature(key: KeyLike, options: SignOptions): Signature = js.native
    
    /** Signs and resolves the value of the General JWS object. */
    def sign(): js.Promise[GeneralJWS] = js.native
  }
  
  trait Signature extends StObject {
    
    /** A shorthand for calling addSignature() on the enclosing GeneralSign instance */
    def addSignature(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeneralSign['addSignature']> is not an array type */ args: Parameters[
          js.Function2[
            /* key */ KeyLike | js.typedarray.Uint8Array, 
            /* options */ js.UndefOr[SignOptions], 
            Signature
          ]
        ]
    ): Signature
    
    /** Returns the enclosing GeneralSign */
    def done(): GeneralSign
    
    /**
      * Sets the JWS Protected Header on the Signature object.
      *
      * @param protectedHeader JWS Protected Header.
      */
    def setProtectedHeader(protectedHeader: JWSHeaderParameters): Signature
    
    /**
      * Sets the JWS Unprotected Header on the Signature object.
      *
      * @param unprotectedHeader JWS Unprotected Header.
      */
    def setUnprotectedHeader(unprotectedHeader: JWSHeaderParameters): Signature
    
    /** A shorthand for calling encrypt() on the enclosing GeneralSign instance */
    def sign(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeneralSign['sign']> is not an array type */ args: Parameters[js.Function0[js.Promise[GeneralJWS]]]
    ): js.Promise[GeneralJWS]
  }
  object Signature {
    
    inline def apply(
      addSignature: Parameters[
          js.Function2[
            /* key */ KeyLike | js.typedarray.Uint8Array, 
            /* options */ js.UndefOr[SignOptions], 
            Signature
          ]
        ] => Signature,
      done: () => GeneralSign,
      setProtectedHeader: JWSHeaderParameters => Signature,
      setUnprotectedHeader: JWSHeaderParameters => Signature,
      sign: Parameters[js.Function0[js.Promise[GeneralJWS]]] => js.Promise[GeneralJWS]
    ): Signature = {
      val __obj = js.Dynamic.literal(addSignature = js.Any.fromFunction1(addSignature), done = js.Any.fromFunction0(done), setProtectedHeader = js.Any.fromFunction1(setProtectedHeader), setUnprotectedHeader = js.Any.fromFunction1(setUnprotectedHeader), sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setAddSignature(
        value: Parameters[
              js.Function2[
                /* key */ KeyLike | js.typedarray.Uint8Array, 
                /* options */ js.UndefOr[SignOptions], 
                Signature
              ]
            ] => Signature
      ): Self = StObject.set(x, "addSignature", js.Any.fromFunction1(value))
      
      inline def setDone(value: () => GeneralSign): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setSetProtectedHeader(value: JWSHeaderParameters => Signature): Self = StObject.set(x, "setProtectedHeader", js.Any.fromFunction1(value))
      
      inline def setSetUnprotectedHeader(value: JWSHeaderParameters => Signature): Self = StObject.set(x, "setUnprotectedHeader", js.Any.fromFunction1(value))
      
      inline def setSign(value: Parameters[js.Function0[js.Promise[GeneralJWS]]] => js.Promise[GeneralJWS]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
}
