package typings.mapAgeCleaner

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("map-age-cleaner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[K, V /* <: MaxAgeEntry */](map: Map[K, V]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def default[K, V](map: Map[K, V], property: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Entry = StringDictionary[js.Any]
  
  trait MaxAgeEntry
    extends StObject
       with Entry {
    
    var maxAge: Double
  }
  object MaxAgeEntry {
    
    inline def apply(maxAge: Double): MaxAgeEntry = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxAgeEntry]
    }
    
    extension [Self <: MaxAgeEntry](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
}
