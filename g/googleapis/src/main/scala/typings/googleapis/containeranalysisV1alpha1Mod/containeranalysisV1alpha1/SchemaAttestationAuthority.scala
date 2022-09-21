package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestationAuthority extends StObject {
  
  var hint: js.UndefOr[SchemaAttestationAuthorityHint] = js.undefined
}
object SchemaAttestationAuthority {
  
  inline def apply(): SchemaAttestationAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationAuthority]
  }
  
  extension [Self <: SchemaAttestationAuthority](x: Self) {
    
    inline def setHint(value: SchemaAttestationAuthorityHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
