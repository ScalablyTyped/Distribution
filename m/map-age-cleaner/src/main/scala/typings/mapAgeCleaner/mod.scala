package typings.mapAgeCleaner

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Automatically cleanup the items in the provided `map`. The property of the expiration timestamp should be named `maxAge`.
    *
    * @param map - Map instance which should be cleaned up.
    */
  inline def apply[K, V /* <: MaxAgeEntry */](map: Map[K, V]): Any = ^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any]).asInstanceOf[Any]
  /**
    * Automatically cleanup the items in the provided `map`.
    *
    * @param map - Map instance which should be cleaned up.
    * @param property - Name of the property which olds the expiry timestamp.
    */
  inline def apply[K, V](map: Map[K, V], property: String): Any = (^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("map-age-cleaner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Entry = StringDictionary[Any]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxAgeEntry] (val x: Self) extends AnyVal {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
}
