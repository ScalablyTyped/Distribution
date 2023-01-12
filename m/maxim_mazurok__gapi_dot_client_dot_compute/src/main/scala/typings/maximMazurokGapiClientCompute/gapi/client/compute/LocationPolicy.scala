package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPolicy extends StObject {
  
  /** Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a. */
  var locations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.LocationPolicyLocation} */ js.Any
  ] = js.undefined
}
object LocationPolicy {
  
  inline def apply(): LocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationPolicy] (val x: Self) extends AnyVal {
    
    inline def setLocations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.LocationPolicyLocation} */ js.Any
    ): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
  }
}
