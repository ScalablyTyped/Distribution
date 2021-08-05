package typings.mapToObj

import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[K /* <: String | Double | js.Symbol */, V](map: Map[K, V]): Record[K, V] = ^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any]).asInstanceOf[Record[K, V]]
  
  @JSImport("map-to-obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
