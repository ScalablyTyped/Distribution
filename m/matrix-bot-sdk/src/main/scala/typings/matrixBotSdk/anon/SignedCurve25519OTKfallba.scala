package typings.matrixBotSdk.anon

import typings.matrixBotSdk.cryptoMod.Signatures
import typings.matrixBotSdk.matrixBotSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined matrix-bot-sdk.matrix-bot-sdk/lib/models/Crypto.SignedCurve25519OTK & {  fallback :true} */
trait SignedCurve25519OTKfallba extends StObject {
  
  var fallback: js.UndefOr[Boolean] & `true`
  
  var key: String
  
  var signatures: Signatures
}
object SignedCurve25519OTKfallba {
  
  inline def apply(fallback: js.UndefOr[Boolean] & `true`, key: String, signatures: Signatures): SignedCurve25519OTKfallba = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedCurve25519OTKfallba]
  }
  
  extension [Self <: SignedCurve25519OTKfallba](x: Self) {
    
    inline def setFallback(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: Signatures): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
  }
}
