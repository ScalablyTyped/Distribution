package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema4Object
  extends /* key */ StringDictionary[JSONSchema4Type]
     with _JSONSchema4Type

object JSONSchema4Object {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[JSONSchema4Type] = null): JSONSchema4Object = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONSchema4Object]
  }
}

