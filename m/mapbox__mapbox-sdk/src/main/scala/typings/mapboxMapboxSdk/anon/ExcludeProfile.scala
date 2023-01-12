package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsProfileExclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeProfile
  extends StObject
     with DirectionsProfileExclusion {
  
  var exclude: js.UndefOr[js.Array[ferry | toll | motorway]] = js.undefined
  
  var profile: driving | `driving-traffic`
}
object ExcludeProfile {
  
  inline def apply(profile: driving | `driving-traffic`): ExcludeProfile = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludeProfile] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[ferry | toll | motorway]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (ferry | toll | motorway)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setProfile(value: driving | `driving-traffic`): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
