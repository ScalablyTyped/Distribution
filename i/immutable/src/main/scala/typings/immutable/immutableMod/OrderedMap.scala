package typings.immutable.immutableMod

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

