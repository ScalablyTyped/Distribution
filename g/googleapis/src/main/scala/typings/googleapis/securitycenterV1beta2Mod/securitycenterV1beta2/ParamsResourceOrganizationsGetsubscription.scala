package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetsubscription
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the subscription to retrieve. Format: organizations/{organization\}/subscription
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetsubscription {
  
  inline def apply(): ParamsResourceOrganizationsGetsubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetsubscription]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetsubscription](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
