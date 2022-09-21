package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestationAuthorityHint extends StObject {
  
  /**
    * The human readable name of this Attestation Authority, for example "qa".
    */
  var humanReadableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttestationAuthorityHint {
  
  inline def apply(): SchemaAttestationAuthorityHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationAuthorityHint]
  }
  
  extension [Self <: SchemaAttestationAuthorityHint](x: Self) {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameNull: Self = StObject.set(x, "humanReadableName", null)
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
