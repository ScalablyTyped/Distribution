package typings.jose

import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyGenerateSecretMod {
  
  @JSImport("jose/dist/types/key/generate_secret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateSecret[T /* <: KeyLike */](alg: String): js.Promise[T | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def generateSecret[T /* <: KeyLike */](alg: String, options: GenerateSecretOptions): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  
  trait GenerateSecretOptions extends StObject {
    
    /**
      * (Only effective in Web Crypto API runtimes) The value to use as
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey SubtleCrypto.generateKey()}
      * `extractable` argument. Default is false.
      */
    var extractable: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateSecretOptions {
    
    inline def apply(): GenerateSecretOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateSecretOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateSecretOptions] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
    }
  }
}
