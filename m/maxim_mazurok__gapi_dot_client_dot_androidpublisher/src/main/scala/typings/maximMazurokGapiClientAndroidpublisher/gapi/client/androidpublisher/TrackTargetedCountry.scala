package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackTargetedCountry extends StObject {
  
  /** The country to target, as a two-letter CLDR code. */
  var countryCode: js.UndefOr[String] = js.undefined
}
object TrackTargetedCountry {
  
  inline def apply(): TrackTargetedCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackTargetedCountry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackTargetedCountry] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
  }
}
