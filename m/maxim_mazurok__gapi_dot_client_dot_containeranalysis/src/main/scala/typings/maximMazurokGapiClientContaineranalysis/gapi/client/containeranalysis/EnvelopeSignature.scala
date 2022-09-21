package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeSignature extends StObject {
  
  var keyid: js.UndefOr[String] = js.undefined
  
  var sig: js.UndefOr[String] = js.undefined
}
object EnvelopeSignature {
  
  inline def apply(): EnvelopeSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeSignature]
  }
  
  extension [Self <: EnvelopeSignature](x: Self) {
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
  }
}
