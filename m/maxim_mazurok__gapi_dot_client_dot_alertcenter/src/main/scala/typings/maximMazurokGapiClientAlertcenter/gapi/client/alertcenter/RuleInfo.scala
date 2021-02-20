package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleInfo extends StObject {
  
  /** User provided name of the rule. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name that uniquely identifies the rule. */
  var resourceName: js.UndefOr[String] = js.native
}
object RuleInfo {
  
  @scala.inline
  def apply(): RuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleInfo]
  }
  
  @scala.inline
  implicit class RuleInfoMutableBuilder[Self <: RuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
