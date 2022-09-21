package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPolicyLocation extends StObject {
  
  /** Preference for a given location: ALLOW or DENY. */
  var preference: js.UndefOr[String] = js.undefined
}
object LocationPolicyLocation {
  
  inline def apply(): LocationPolicyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPolicyLocation]
  }
  
  extension [Self <: LocationPolicyLocation](x: Self) {
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
  }
}
