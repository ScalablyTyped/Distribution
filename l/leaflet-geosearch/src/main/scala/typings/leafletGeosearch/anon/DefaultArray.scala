package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.ValueMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultArray extends StObject {
  
  var default: js.Array[ValueMatch]
}
object DefaultArray {
  
  inline def apply(default: js.Array[ValueMatch]): DefaultArray = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultArray]
  }
  
  extension [Self <: DefaultArray](x: Self) {
    
    inline def setDefault(value: js.Array[ValueMatch]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultVarargs(value: ValueMatch*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
