package typings
package mathjsLib.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// FactoryFunctionMap can be nested; all nested objects will be flattened
trait FactoryFunctionMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[FactoryFunction[_] | FactoryFunctionMap]

object FactoryFunctionMap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[FactoryFunction[_] | FactoryFunctionMap] = null
  ): FactoryFunctionMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FactoryFunctionMap]
  }
}

