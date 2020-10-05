package typings.materialUiCore.inputBaseInputBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBaseComponentProps
  extends HTMLAttributes[HTMLInputElement | HTMLTextAreaElement]
     with // Accommodate arbitrary additional props coming from the `inputProps` prop
/* arbitrary */ StringDictionary[js.Any]

object InputBaseComponentProps {
  @scala.inline
  def apply(): InputBaseComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBaseComponentProps]
  }
}

