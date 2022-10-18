package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsProfileExclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude
  extends StObject
     with DirectionsProfileExclusion {
  
  var exclude: js.UndefOr[js.Array[Any]] = js.undefined
  
  var profile: walking
}
object Exclude {
  
  inline def apply(): Exclude = {
    val __obj = js.Dynamic.literal(profile = "walking")
    __obj.asInstanceOf[Exclude]
  }
  
  extension [Self <: Exclude](x: Self) {
    
    inline def setExclude(value: js.Array[Any]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: Any*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setProfile(value: walking): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
