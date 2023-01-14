package typings.indySdk.mod

import typings.indySdk.indySdkStrings.ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidConfig extends StObject {
  
  var cid: js.UndefOr[Boolean] = js.undefined
  
  var crypto_type: js.UndefOr[ed25519] = js.undefined
  
  var did: js.UndefOr[String] = js.undefined
  
  var method_name: js.UndefOr[String] = js.undefined
  
  var seed: js.UndefOr[String] = js.undefined
}
object DidConfig {
  
  inline def apply(): DidConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidConfig] (val x: Self) extends AnyVal {
    
    inline def setCid(value: Boolean): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setCrypto_type(value: ed25519): Self = StObject.set(x, "crypto_type", value.asInstanceOf[js.Any])
    
    inline def setCrypto_typeUndefined: Self = StObject.set(x, "crypto_type", js.undefined)
    
    inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
    
    inline def setMethod_name(value: String): Self = StObject.set(x, "method_name", value.asInstanceOf[js.Any])
    
    inline def setMethod_nameUndefined: Self = StObject.set(x, "method_name", js.undefined)
    
    inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
