package typings.justMapValues

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-map-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, U](
    item: Record[String, T],
    callback: js.Function3[/* value */ T, /* key */ String, /* object */ Record[String, T], U]
  ): Record[String, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, U]]
}
