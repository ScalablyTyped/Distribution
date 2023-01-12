package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileApplicationTargeting extends StObject {
  
  /** Publisher owned apps to be targeted or excluded by the publisher to display the ads in. */
  var firstPartyTargeting: js.UndefOr[FirstPartyMobileApplicationTargeting] = js.undefined
}
object MobileApplicationTargeting {
  
  inline def apply(): MobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApplicationTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileApplicationTargeting] (val x: Self) extends AnyVal {
    
    inline def setFirstPartyTargeting(value: FirstPartyMobileApplicationTargeting): Self = StObject.set(x, "firstPartyTargeting", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyTargetingUndefined: Self = StObject.set(x, "firstPartyTargeting", js.undefined)
  }
}
