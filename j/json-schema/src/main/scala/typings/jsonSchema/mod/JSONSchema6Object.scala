package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema6Object
  extends /* key */ StringDictionary[JSONSchema6Type]
     with _JSONSchema6Type

object JSONSchema6Object {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[JSONSchema6Type] = null): JSONSchema6Object = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONSchema6Object]
  }
}

