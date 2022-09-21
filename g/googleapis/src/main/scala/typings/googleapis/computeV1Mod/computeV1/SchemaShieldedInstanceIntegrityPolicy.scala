package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedInstanceIntegrityPolicy extends StObject {
  
  /**
    * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaShieldedInstanceIntegrityPolicy {
  
  inline def apply(): SchemaShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIntegrityPolicy]
  }
  
  extension [Self <: SchemaShieldedInstanceIntegrityPolicy](x: Self) {
    
    inline def setUpdateAutoLearnPolicy(value: Boolean): Self = StObject.set(x, "updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoLearnPolicyNull: Self = StObject.set(x, "updateAutoLearnPolicy", null)
    
    inline def setUpdateAutoLearnPolicyUndefined: Self = StObject.set(x, "updateAutoLearnPolicy", js.undefined)
  }
}
