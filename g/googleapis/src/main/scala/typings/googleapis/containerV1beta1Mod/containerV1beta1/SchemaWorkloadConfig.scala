package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadConfig extends StObject {
  
  /**
    * Sets which mode of auditing should be used for the cluster's workloads.
    */
  var auditMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkloadConfig {
  
  inline def apply(): SchemaWorkloadConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadConfig]
  }
  
  extension [Self <: SchemaWorkloadConfig](x: Self) {
    
    inline def setAuditMode(value: String): Self = StObject.set(x, "auditMode", value.asInstanceOf[js.Any])
    
    inline def setAuditModeNull: Self = StObject.set(x, "auditMode", null)
    
    inline def setAuditModeUndefined: Self = StObject.set(x, "auditMode", js.undefined)
  }
}
