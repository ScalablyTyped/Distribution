package typings
package graphqlDashComposeLib.libTypeStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/TypeStorage", "TypeStorage")
@js.native
class TypeStorage[TContext] () extends js.Object {
  var size: scala.Double = js.native
  var types: stdLib.Map[K, V[TContext]] = js.native
  def add(value: V[TContext]): java.lang.String | scala.Null = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  def entries(): stdLib.Iterator[js.Tuple2[K, V[TContext]]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V[TContext], /* index */ K, /* map */ stdLib.Map[K, V[TContext]], _]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V[TContext], /* index */ K, /* map */ stdLib.Map[K, V[TContext]], _],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): V[TContext] = js.native
  def getETC(typeName: K): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def getIFTC(typeName: K): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _] = js.native
  def getITC(typeName: K): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def getOrSet(key: K, typeOrThunk: V[TContext]): V[TContext] = js.native
  def getOrSet(key: K, typeOrThunk: js.Function0[V[TContext]]): V[TContext] = js.native
  def getSTC(typeName: K): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def getTC(typeName: K): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext] = js.native
  @JSName("getTC")
  def getTC_TSource[TSource](typeName: K): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] = js.native
  def getUTC(typeName: K): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _] = js.native
  def has(key: K): scala.Boolean = js.native
  def hasInstance(key: K, ClassObj: js.Any): scala.Boolean = js.native
  def keys(): stdLib.Iterator[K] = js.native
  def set(key: K, value: V[TContext]): TypeStorage[TContext] = js.native
  def values(): stdLib.Iterator[V[TContext]] = js.native
}

