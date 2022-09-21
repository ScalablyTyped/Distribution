package typings.mapValues

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[TKey /* <: String | Double | js.Symbol */, TValue, TNewValue](
    obj: Record[TKey, TValue],
    mapFn: js.Function3[/* value */ TValue, /* key */ TKey, /* obj */ Record[TKey, TValue], TNewValue]
  ): Record[TKey, TNewValue] = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[Record[TKey, TNewValue]]
  
  @JSImport("map-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
