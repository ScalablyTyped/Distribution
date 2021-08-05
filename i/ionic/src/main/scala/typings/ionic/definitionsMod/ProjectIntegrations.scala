package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectIntegrations extends StObject {
  
  var capacitor: js.UndefOr[ProjectIntegration] = js.undefined
  
  var cordova: js.UndefOr[ProjectIntegration] = js.undefined
  
  var enterprise: js.UndefOr[EnterpriseProjectIntegration] = js.undefined
}
object ProjectIntegrations {
  
  inline def apply(): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegrations]
  }
  
  extension [Self <: ProjectIntegrations](x: Self) {
    
    inline def setCapacitor(value: ProjectIntegration): Self = StObject.set(x, "capacitor", value.asInstanceOf[js.Any])
    
    inline def setCapacitorUndefined: Self = StObject.set(x, "capacitor", js.undefined)
    
    inline def setCordova(value: ProjectIntegration): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    inline def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
    
    inline def setEnterprise(value: EnterpriseProjectIntegration): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
  }
}
