package typings.interfaceDatastore.mod

import typings.interfaceDatastore.mod.Query.Filter
import typings.interfaceDatastore.mod.Query.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[Value] extends js.Object {
  
  var filters: js.UndefOr[js.Array[Filter[Value]]] = js.native
  
  var keysOnly: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var orders: js.UndefOr[js.Array[Order[Value]]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
@JSImport("interface-datastore", "Query")
@js.native
object Query extends js.Object {
  
  type Filter[Value] = js.Function1[/* item */ Pair[Value], Boolean]
  
  type Order[Value] = js.Function1[/* items */ js.Array[Pair[Value]], js.Array[Pair[Value]]]
}
