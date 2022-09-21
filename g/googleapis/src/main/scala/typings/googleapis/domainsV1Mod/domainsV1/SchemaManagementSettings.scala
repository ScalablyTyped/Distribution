package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagementSettings extends StObject {
  
  /**
    * Output only. The renewal method for this `Registration`.
    */
  var renewalMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls whether the domain can be transferred to another registrar.
    */
  var transferLockState: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagementSettings {
  
  inline def apply(): SchemaManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagementSettings]
  }
  
  extension [Self <: SchemaManagementSettings](x: Self) {
    
    inline def setRenewalMethod(value: String): Self = StObject.set(x, "renewalMethod", value.asInstanceOf[js.Any])
    
    inline def setRenewalMethodNull: Self = StObject.set(x, "renewalMethod", null)
    
    inline def setRenewalMethodUndefined: Self = StObject.set(x, "renewalMethod", js.undefined)
    
    inline def setTransferLockState(value: String): Self = StObject.set(x, "transferLockState", value.asInstanceOf[js.Any])
    
    inline def setTransferLockStateNull: Self = StObject.set(x, "transferLockState", null)
    
    inline def setTransferLockStateUndefined: Self = StObject.set(x, "transferLockState", js.undefined)
  }
}
