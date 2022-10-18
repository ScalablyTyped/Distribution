package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.ValueMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyDefault
  extends StObject
     with /* key */ StringDictionary[js.Array[ValueMatch]] {
  
  var default: js.Array[ValueMatch]
}
object DictkeyDefault {
  
  inline def apply(default: js.Array[ValueMatch]): DictkeyDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkeyDefault]
  }
  
  extension [Self <: DictkeyDefault](x: Self) {
    
    inline def setDefault(value: js.Array[ValueMatch]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultVarargs(value: ValueMatch*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
