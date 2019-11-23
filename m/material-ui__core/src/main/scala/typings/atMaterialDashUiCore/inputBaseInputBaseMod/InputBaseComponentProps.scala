package typings.atMaterialDashUiCore.inputBaseInputBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBaseComponentProps
  extends HTMLAttributes[HTMLInputElement | HTMLTextAreaElement]
     with // Accommodate arbitrary additional props coming from the `inputProps` prop
/* arbitrary */ StringDictionary[js.Any]

object InputBaseComponentProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLInputElement | HTMLTextAreaElement] = null,
    StringDictionary: // Accommodate arbitrary additional props coming from the `inputProps` prop
  /* arbitrary */ StringDictionary[js.Any] = null
  ): InputBaseComponentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InputBaseComponentProps]
  }
}

