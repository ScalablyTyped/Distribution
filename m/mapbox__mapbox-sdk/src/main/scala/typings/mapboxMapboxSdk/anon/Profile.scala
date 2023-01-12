package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsProfileExclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile
  extends StObject
     with DirectionsProfileExclusion {
  
  var exclude: js.UndefOr[js.Array[ferry]] = js.undefined
  
  var profile: cycling
}
object Profile {
  
  inline def apply(): Profile = {
    val __obj = js.Dynamic.literal(profile = "cycling")
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[ferry]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ferry*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setProfile(value: cycling): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
