package typings.graphqlCompose

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/misc", JSImport.Namespace)
@js.native
object miscMod extends js.Object {
  def camelCase(str: String): String = js.native
  def clearName(str: String): String = js.native
  def forEachKey[V](arrayOrObject: StringDictionary[V], callback: js.Function2[/* value */ V, /* key */ String, Unit]): Unit = js.native
  def getPluralName(name: String): String = js.native
  def inspect(value: js.Any): String = js.native
  def omit(obj: js.Object, keys: js.Array[String]): js.Object = js.native
  def only(obj: js.Object, keys: js.Array[String]): js.Object = js.native
  def resolveMaybeThunk[T](thingOrThunk: Thunk[T]): T = js.native
  def upperFirst(str: String): String = js.native
}

