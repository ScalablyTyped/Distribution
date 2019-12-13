package typings.interfaceDashDatastore.interfaceDashDatastoreMod

import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Query.Filter
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Query.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[Value] extends js.Object {
  var filters: js.UndefOr[js.Array[Filter[Value]]] = js.undefined
  var keysOnly: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orders: js.UndefOr[js.Array[Order[Value]]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

@JSImport("interface-datastore", "Query")
@js.native
object Query extends js.Object {
  type Filter[T] = js.Function1[/* item */ Result[T], Boolean]
  type Order[T] = js.Function1[/* items */ js.Array[Result[T]], js.Array[Result[T]]]
}

