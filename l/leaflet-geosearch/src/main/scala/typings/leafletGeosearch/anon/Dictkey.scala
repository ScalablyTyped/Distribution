package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.ValueMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[ValueMatch] {
  
  var default: ValueMatch
}
object Dictkey {
  
  inline def apply(default: ValueMatch): Dictkey = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setDefault(value: ValueMatch): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
