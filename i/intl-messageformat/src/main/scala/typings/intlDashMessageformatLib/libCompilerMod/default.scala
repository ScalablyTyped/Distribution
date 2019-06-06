package typings
package intlDashMessageformatLib.libCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/compiler", JSImport.Default)
@js.native
class default protected () extends Compiler {
  def this(locales: java.lang.String, formats: Formats) = this()
  def this(locales: js.Array[java.lang.String], formats: Formats) = this()
  /* CompleteClass */
  override var currentPlural: js.Any = js.native
  /* CompleteClass */
  override var formats: js.Any = js.native
  /* CompleteClass */
  override var locales: js.Any = js.native
  /* CompleteClass */
  override var pluralNumberFormat: js.Any = js.native
  /* CompleteClass */
  override var pluralStack: js.Any = js.native
  /* CompleteClass */
  override def compile(ast: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern): js.Array[Pattern] = js.native
  /* CompleteClass */
  override def compileArgument(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement): PluralFormat | SelectFormat | StringFormat = js.native
  /* CompleteClass */
  override def compileMessage(ast: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern): js.Array[Pattern] = js.native
  /* CompleteClass */
  override def compileMessageText(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageTextElement): java.lang.String | PluralOffsetString = js.native
  /* CompleteClass */
  override def compileOptions(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement): js.Object = js.native
}

