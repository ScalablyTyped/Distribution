package typings.mapboxMapboxSdk.servicesDirectionsMod

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.anon.Exclude
  - typings.mapboxMapboxSdk.anon.Profile
  - typings.mapboxMapboxSdk.anon.ExcludeProfile
*/
trait DirectionsProfileExclusion extends StObject
object DirectionsProfileExclusion {
  
  inline def Exclude(): typings.mapboxMapboxSdk.anon.Exclude = {
    val __obj = js.Dynamic.literal(profile = "walking")
    __obj.asInstanceOf[typings.mapboxMapboxSdk.anon.Exclude]
  }
  
  inline def ExcludeProfile(profile: driving | `driving-traffic`): typings.mapboxMapboxSdk.anon.ExcludeProfile = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxMapboxSdk.anon.ExcludeProfile]
  }
  
  inline def Profile(): typings.mapboxMapboxSdk.anon.Profile = {
    val __obj = js.Dynamic.literal(profile = "cycling")
    __obj.asInstanceOf[typings.mapboxMapboxSdk.anon.Profile]
  }
}
