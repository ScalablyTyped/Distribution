package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaForwardingRulesScopedList extends StObject {
  
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[SchemaForwardingRule]] = js.native
  
  /**
    * Informational warning which replaces the list of forwarding rules when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaForwardingRulesScopedList {
  
  @scala.inline
  def apply(): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
  
  @scala.inline
  implicit class SchemaForwardingRulesScopedListMutableBuilder[Self <: SchemaForwardingRulesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingRules(value: js.Array[SchemaForwardingRule]): Self = StObject.set(x, "forwardingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingRulesUndefined: Self = StObject.set(x, "forwardingRules", js.undefined)
    
    @scala.inline
    def setForwardingRulesVarargs(value: SchemaForwardingRule*): Self = StObject.set(x, "forwardingRules", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
