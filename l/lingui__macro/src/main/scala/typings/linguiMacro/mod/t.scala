package typings.linguiMacro.mod

import typings.linguiCore.i18nMod.MessageDescriptor
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/macro", "t")
@js.native
object t extends js.Object {
  
  def apply(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  def apply(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
}
