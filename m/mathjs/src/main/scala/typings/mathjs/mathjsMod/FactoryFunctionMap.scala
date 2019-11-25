package typings.mathjs.mathjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// FactoryFunctionMap can be nested; all nested objects will be flattened
trait FactoryFunctionMap extends /* key */ StringDictionary[FactoryFunction[_] | FactoryFunctionMap]

object FactoryFunctionMap {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[FactoryFunction[_] | FactoryFunctionMap] = null): FactoryFunctionMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FactoryFunctionMap]
  }
}

