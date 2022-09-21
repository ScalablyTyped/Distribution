package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities extends StObject {
  
  /**
    * True if the user is authorized to view the policy.
    */
  var canViewPolicy: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities](x: Self) {
    
    inline def setCanViewPolicy(value: Boolean): Self = StObject.set(x, "canViewPolicy", value.asInstanceOf[js.Any])
    
    inline def setCanViewPolicyNull: Self = StObject.set(x, "canViewPolicy", null)
    
    inline def setCanViewPolicyUndefined: Self = StObject.set(x, "canViewPolicy", js.undefined)
  }
}
