package typings
package graphqlDashComposeLib.libUtilsDefinitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericMap[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T] {
  @JSName("$call")
  var $call: js.UndefOr[scala.Unit] = js.undefined
}

object GenericMap {
  @scala.inline
  def apply[T](
    $call: js.UndefOr[scala.Unit] = js.undefined,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null
  ): GenericMap[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GenericMap[T]]
  }
}

