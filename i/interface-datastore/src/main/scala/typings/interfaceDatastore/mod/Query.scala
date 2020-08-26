package typings.interfaceDatastore.mod

import typings.interfaceDatastore.mod.Query.Filter
import typings.interfaceDatastore.mod.Query.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type Filter[T] = js.Function1[/* item */ Result[T], Boolean]
  type Order[T] = js.Function1[/* items */ js.Array[Result[T]], js.Array[Result[T]]]
}

