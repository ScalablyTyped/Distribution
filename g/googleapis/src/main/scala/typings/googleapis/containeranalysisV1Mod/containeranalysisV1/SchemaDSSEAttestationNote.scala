package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDSSEAttestationNote extends StObject {
  
  /**
    * DSSEHint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[SchemaDSSEHint] = js.undefined
}
object SchemaDSSEAttestationNote {
  
  inline def apply(): SchemaDSSEAttestationNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDSSEAttestationNote]
  }
  
  extension [Self <: SchemaDSSEAttestationNote](x: Self) {
    
    inline def setHint(value: SchemaDSSEHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
