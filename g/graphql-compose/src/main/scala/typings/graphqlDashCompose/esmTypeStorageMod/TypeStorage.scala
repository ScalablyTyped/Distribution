package typings.graphqlDashCompose.esmTypeStorageMod

import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/TypeStorage", "TypeStorage")
@js.native
class TypeStorage[K, V] () extends js.Object {
  val size: Double = js.native
  var types: Map[K, V] = js.native
  def add(value: V): String | Null = js.native
  def clear(): Unit = js.native
  def delete(key: K): Boolean = js.native
  def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], _]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], _], thisArg: js.Any): Unit = js.native
  def get(key: K): V = js.native
  def getOrSet(key: K, typeOrThunk: V): V = js.native
  def getOrSet(key: K, typeOrThunk: js.Function0[V]): V = js.native
  def has(key: K): Boolean = js.native
  def hasInstance(key: K, ClassObj: js.Any): Boolean = js.native
  def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
  def set(key: K, value: V): this.type = js.native
  def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
}

