package typings.mapDashToDashObj

import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("map-to-obj", JSImport.Namespace)
@js.native
object mapDashToDashObjMod extends js.Object {
  def apply[K /* <: String | Double | js.Symbol */, V](map: Map[K, V]): Record[K, V] = js.native
}

