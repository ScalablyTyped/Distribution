package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedMap[K, V] extends Map[K, V] {
  /**
    * Returns a new OrderedMap with only the entries for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_V_OrderedMap[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): OrderedMap[K, F] = js.native
  @JSName("filter")
  def filter_F_V_OrderedMap[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): OrderedMap[K, F] = js.native
}

@JSImport("immutable", "OrderedMap")
@js.native
object OrderedMap extends js.Object {
  def apply(): OrderedMap[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): OrderedMap[K, V] = js.native
  /**
    * True if the provided value is an OrderedMap.
    */
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.immutable.OrderedMap<any, any> */ Boolean = js.native
}

