package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSSEAttestationOccurrence extends StObject {
  
  /** If doing something security critical, make sure to verify the signatures in this metadata. */
  var envelope: js.UndefOr[Envelope] = js.undefined
  
  var statement: js.UndefOr[InTotoStatement] = js.undefined
}
object DSSEAttestationOccurrence {
  
  inline def apply(): DSSEAttestationOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSSEAttestationOccurrence]
  }
  
  extension [Self <: DSSEAttestationOccurrence](x: Self) {
    
    inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setStatement(value: InTotoStatement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
  }
}
