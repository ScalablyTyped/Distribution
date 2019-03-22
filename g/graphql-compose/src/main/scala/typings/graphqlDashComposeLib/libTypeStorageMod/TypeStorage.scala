package typings
package graphqlDashComposeLib.libTypeStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/TypeStorage", "TypeStorage")
@js.native
class TypeStorage[K, V] () extends js.Object {
  val size: scala.Double = js.native
  var types: stdLib.Map[K, V] = js.native
  def add(value: V): java.lang.String | scala.Null = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  def entries(): stdLib.Iterator[js.Tuple2[K, V]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ stdLib.Map[K, V], _]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ stdLib.Map[K, V], _],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): V = js.native
  def getOrSet(key: K, typeOrThunk: V): V = js.native
  def getOrSet(key: K, typeOrThunk: js.Function0[V]): V = js.native
  def has(key: K): scala.Boolean = js.native
  def hasInstance(key: K, ClassObj: js.Any): scala.Boolean = js.native
  def keys(): stdLib.Iterator[K] = js.native
  def set(key: K, value: V): this.type = js.native
  def values(): stdLib.Iterator[V] = js.native
}

