package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestationNote extends StObject {
  
  /**
    * Hint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[SchemaHint] = js.undefined
}
object SchemaAttestationNote {
  
  inline def apply(): SchemaAttestationNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationNote]
  }
  
  extension [Self <: SchemaAttestationNote](x: Self) {
    
    inline def setHint(value: SchemaHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
