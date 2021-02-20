package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DomainMappingCondition contains state information for a DomainMapping.
  */
@js.native
trait SchemaDomainMappingCondition extends StObject {
  
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * One-word CamelCase reason for the condition&#39;s current status.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Type of domain mapping condition.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDomainMappingCondition {
  
  @scala.inline
  def apply(): SchemaDomainMappingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingCondition]
  }
  
  @scala.inline
  implicit class SchemaDomainMappingConditionMutableBuilder[Self <: SchemaDomainMappingCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
