package typings.grammarkdown.distCoreMod

import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "mapSet")
@js.native
object mapSet extends js.Object {
  def apply[K, V](map: Map[K, V], key: K, value: V): V = js.native
  def apply[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = js.native
}

