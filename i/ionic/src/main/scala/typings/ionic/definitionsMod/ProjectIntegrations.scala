package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectIntegrations extends StObject {
  
  var capacitor: js.UndefOr[ProjectIntegration] = js.native
  
  var cordova: js.UndefOr[ProjectIntegration] = js.native
  
  var enterprise: js.UndefOr[EnterpriseProjectIntegration] = js.native
}
object ProjectIntegrations {
  
  @scala.inline
  def apply(): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegrations]
  }
  
  @scala.inline
  implicit class ProjectIntegrationsMutableBuilder[Self <: ProjectIntegrations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacitor(value: ProjectIntegration): Self = StObject.set(x, "capacitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacitorUndefined: Self = StObject.set(x, "capacitor", js.undefined)
    
    @scala.inline
    def setCordova(value: ProjectIntegration): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
    
    @scala.inline
    def setEnterprise(value: EnterpriseProjectIntegration): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
  }
}
