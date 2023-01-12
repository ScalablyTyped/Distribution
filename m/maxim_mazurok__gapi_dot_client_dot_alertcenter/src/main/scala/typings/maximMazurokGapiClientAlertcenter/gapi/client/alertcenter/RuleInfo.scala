package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleInfo extends StObject {
  
  /** User provided name of the rule. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name that uniquely identifies the rule. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object RuleInfo {
  
  inline def apply(): RuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
