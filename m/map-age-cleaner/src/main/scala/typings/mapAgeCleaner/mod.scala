package typings.mapAgeCleaner

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("map-age-cleaner", JSImport.Default)
  @js.native
  def default[K, V /* <: MaxAgeEntry */](map: Map[K, V]): js.Any = js.native
  @JSImport("map-age-cleaner", JSImport.Default)
  @js.native
  def default[K, V](map: Map[K, V], property: String): js.Any = js.native
  
  type Entry = StringDictionary[js.Any]
  
  @js.native
  trait MaxAgeEntry extends Entry {
    
    var maxAge: Double = js.native
  }
  object MaxAgeEntry {
    
    @scala.inline
    def apply(maxAge: Double): MaxAgeEntry = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxAgeEntry]
    }
    
    @scala.inline
    implicit class MaxAgeEntryMutableBuilder[Self <: MaxAgeEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
}
