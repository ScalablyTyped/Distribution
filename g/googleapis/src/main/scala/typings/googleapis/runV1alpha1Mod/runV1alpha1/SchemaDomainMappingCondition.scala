package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DomainMappingCondition contains state information for a DomainMapping.
  */
trait SchemaDomainMappingCondition extends StObject {
  
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * One-word CamelCase reason for the condition&#39;s current status.
    * +optional
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Type of domain mapping condition.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDomainMappingCondition {
  
  inline def apply(): SchemaDomainMappingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingCondition]
  }
  
  extension [Self <: SchemaDomainMappingCondition](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
