package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackCountryAvailability extends StObject {
  
  /**
    * A list of one or more countries where artifacts in this track are available. This list includes all countries that are targeted by the track, even if only specific carriers are
    * targeted in that country.
    */
  var countries: js.UndefOr[js.Array[TrackTargetedCountry]] = js.undefined
  
  /** Whether artifacts in this track are available to "rest of the world" countries. */
  var restOfWorld: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this track's availability is synced with the default production track. See https://support.google.com/googleplay/android-developer/answer/7550024 for more information on
    * syncing country availability with production. Note that if this is true, the returned "countries" and "rest_of_world" fields will reflect the values for the default production
    * track.
    */
  var syncWithProduction: js.UndefOr[Boolean] = js.undefined
}
object TrackCountryAvailability {
  
  inline def apply(): TrackCountryAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackCountryAvailability]
  }
  
  extension [Self <: TrackCountryAvailability](x: Self) {
    
    inline def setCountries(value: js.Array[TrackTargetedCountry]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: TrackTargetedCountry*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setRestOfWorld(value: Boolean): Self = StObject.set(x, "restOfWorld", value.asInstanceOf[js.Any])
    
    inline def setRestOfWorldUndefined: Self = StObject.set(x, "restOfWorld", js.undefined)
    
    inline def setSyncWithProduction(value: Boolean): Self = StObject.set(x, "syncWithProduction", value.asInstanceOf[js.Any])
    
    inline def setSyncWithProductionUndefined: Self = StObject.set(x, "syncWithProduction", js.undefined)
  }
}
