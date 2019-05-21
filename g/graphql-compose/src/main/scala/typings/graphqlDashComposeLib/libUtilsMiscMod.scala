package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/misc", JSImport.Namespace)
@js.native
object libUtilsMiscMod extends js.Object {
  def camelCase(str: java.lang.String): java.lang.String = js.native
  def clearName(str: java.lang.String): java.lang.String = js.native
  def forEachKey[V](
    arrayOrObject: org.scalablytyped.runtime.StringDictionary[V],
    callback: js.Function2[/* value */ V, /* key */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getPluralName(name: java.lang.String): java.lang.String = js.native
  def inspect(value: js.Any): java.lang.String = js.native
  def omit(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def only(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def resolveMaybeThunk[T](thingOrThunk: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[T]): T = js.native
  def upperFirst(str: java.lang.String): java.lang.String = js.native
}

