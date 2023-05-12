package typings.jose

import typings.jose.distTypesTypesMod.CritOption
import typings.jose.distTypesTypesMod.DeflateOption
import typings.jose.distTypesTypesMod.GeneralJWE
import typings.jose.distTypesTypesMod.JWEHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweGeneralEncryptMod {
  
  @JSImport("jose/dist/types/jwe/general/encrypt", "GeneralEncrypt")
  @js.native
  open class GeneralEncrypt protected () extends StObject {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
    
    /* private */ var _aad: Any = js.native
    
    /* private */ var _plaintext: Any = js.native
    
    /* private */ var _protectedHeader: Any = js.native
    
    /* private */ var _recipients: Any = js.native
    
    /* private */ var _unprotectedHeader: Any = js.native
    
    def addRecipient(key: js.typedarray.Uint8Array): Recipient = js.native
    def addRecipient(key: js.typedarray.Uint8Array, options: CritOption): Recipient = js.native
    /**
      * Adds an additional recipient for the General JWE object.
      *
      * @param key Public Key or Secret to encrypt the Content Encryption Key for the recipient with.
      *   See {@link https://github.com/panva/jose/issues/210#jwe-alg Algorithm Key Requirements}.
      * @param options JWE Encryption options.
      */
    def addRecipient(key: KeyLike): Recipient = js.native
    def addRecipient(key: KeyLike, options: CritOption): Recipient = js.native
    
    /**
      * Encrypts and resolves the value of the General JWE object.
      *
      * @param options JWE Encryption options.
      */
    def encrypt(): js.Promise[GeneralJWE] = js.native
    def encrypt(options: DeflateOption): js.Promise[GeneralJWE] = js.native
    
    /**
      * Sets the Additional Authenticated Data on the GeneralEncrypt object.
      *
      * @param aad Additional Authenticated Data.
      */
    def setAdditionalAuthenticatedData(aad: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Sets the JWE Protected Header on the GeneralEncrypt object.
      *
      * @param protectedHeader JWE Protected Header object.
      */
    def setProtectedHeader(protectedHeader: JWEHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWE Shared Unprotected Header on the GeneralEncrypt object.
      *
      * @param sharedUnprotectedHeader JWE Shared Unprotected Header object.
      */
    def setSharedUnprotectedHeader(sharedUnprotectedHeader: JWEHeaderParameters): this.type = js.native
  }
  
  trait Recipient extends StObject {
    
    /** A shorthand for calling addRecipient() on the enclosing GeneralEncrypt instance */
    def addRecipient(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeneralEncrypt['addRecipient']> is not an array type */ args: Parameters[
          js.Function2[
            /* key */ KeyLike | js.typedarray.Uint8Array, 
            /* options */ js.UndefOr[CritOption], 
            Recipient
          ]
        ]
    ): Recipient
    
    /** Returns the enclosing GeneralEncrypt */
    def done(): GeneralEncrypt
    
    /** A shorthand for calling encrypt() on the enclosing GeneralEncrypt instance */
    def encrypt(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeneralEncrypt['encrypt']> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[DeflateOption], js.Promise[GeneralJWE]]]
    ): js.Promise[GeneralJWE]
    
    /**
      * Sets the JWE Per-Recipient Unprotected Header on the Recipient object.
      *
      * @param unprotectedHeader JWE Per-Recipient Unprotected Header.
      */
    def setUnprotectedHeader(unprotectedHeader: JWEHeaderParameters): Recipient
  }
  object Recipient {
    
    inline def apply(
      addRecipient: Parameters[
          js.Function2[
            /* key */ KeyLike | js.typedarray.Uint8Array, 
            /* options */ js.UndefOr[CritOption], 
            Recipient
          ]
        ] => Recipient,
      done: () => GeneralEncrypt,
      encrypt: Parameters[js.Function1[/* options */ js.UndefOr[DeflateOption], js.Promise[GeneralJWE]]] => js.Promise[GeneralJWE],
      setUnprotectedHeader: JWEHeaderParameters => Recipient
    ): Recipient = {
      val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1(addRecipient), done = js.Any.fromFunction0(done), encrypt = js.Any.fromFunction1(encrypt), setUnprotectedHeader = js.Any.fromFunction1(setUnprotectedHeader))
      __obj.asInstanceOf[Recipient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recipient] (val x: Self) extends AnyVal {
      
      inline def setAddRecipient(
        value: Parameters[
              js.Function2[
                /* key */ KeyLike | js.typedarray.Uint8Array, 
                /* options */ js.UndefOr[CritOption], 
                Recipient
              ]
            ] => Recipient
      ): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1(value))
      
      inline def setDone(value: () => GeneralEncrypt): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setEncrypt(
        value: Parameters[js.Function1[/* options */ js.UndefOr[DeflateOption], js.Promise[GeneralJWE]]] => js.Promise[GeneralJWE]
      ): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
      
      inline def setSetUnprotectedHeader(value: JWEHeaderParameters => Recipient): Self = StObject.set(x, "setUnprotectedHeader", js.Any.fromFunction1(value))
    }
  }
}
