package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDSSEAttestationOccurrence extends StObject {
  
  /**
    * If doing something security critical, make sure to verify the signatures in this metadata.
    */
  var envelope: js.UndefOr[SchemaEnvelope] = js.undefined
  
  var statement: js.UndefOr[SchemaInTotoStatement] = js.undefined
}
object SchemaDSSEAttestationOccurrence {
  
  inline def apply(): SchemaDSSEAttestationOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDSSEAttestationOccurrence]
  }
  
  extension [Self <: SchemaDSSEAttestationOccurrence](x: Self) {
    
    inline def setEnvelope(value: SchemaEnvelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setStatement(value: SchemaInTotoStatement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
  }
}
