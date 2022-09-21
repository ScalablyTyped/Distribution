package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digest extends StObject {
  
  /** `SHA1`, `SHA512` etc. */
  var algo: js.UndefOr[String] = js.undefined
  
  /** Value of the digest. */
  var digestBytes: js.UndefOr[String] = js.undefined
}
object Digest {
  
  inline def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  
  extension [Self <: Digest](x: Self) {
    
    inline def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
    
    inline def setAlgoUndefined: Self = StObject.set(x, "algo", js.undefined)
    
    inline def setDigestBytes(value: String): Self = StObject.set(x, "digestBytes", value.asInstanceOf[js.Any])
    
    inline def setDigestBytesUndefined: Self = StObject.set(x, "digestBytes", js.undefined)
  }
}
