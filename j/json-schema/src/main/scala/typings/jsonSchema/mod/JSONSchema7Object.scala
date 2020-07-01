package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema7Object
  extends /* key */ StringDictionary[JSONSchema7Type]
     with _JSONSchema7Type

object JSONSchema7Object {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[JSONSchema7Type] = null): JSONSchema7Object = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONSchema7Object]
  }
}

