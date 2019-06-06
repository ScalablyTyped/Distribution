package typings
package intlDashMessageformatLib.libCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compiler extends js.Object {
  var currentPlural: js.Any
  var formats: js.Any
  var locales: js.Any
  var pluralNumberFormat: js.Any
  var pluralStack: js.Any
  def compile(ast: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern): js.Array[Pattern]
  def compileArgument(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement): PluralFormat | SelectFormat | StringFormat
  def compileMessage(ast: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern): js.Array[Pattern]
  def compileMessageText(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageTextElement): java.lang.String | PluralOffsetString
  def compileOptions(element: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement): js.Object
}

object Compiler {
  @scala.inline
  def apply(
    compile: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern => js.Array[Pattern],
    compileArgument: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement => PluralFormat | SelectFormat | StringFormat,
    compileMessage: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern => js.Array[Pattern],
    compileMessageText: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageTextElement => java.lang.String | PluralOffsetString,
    compileOptions: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.ArgumentElement => js.Object,
    currentPlural: js.Any,
    formats: js.Any,
    locales: js.Any,
    pluralNumberFormat: js.Any,
    pluralStack: js.Any
  ): Compiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile), compileArgument = js.Any.fromFunction1(compileArgument), compileMessage = js.Any.fromFunction1(compileMessage), compileMessageText = js.Any.fromFunction1(compileMessageText), compileOptions = js.Any.fromFunction1(compileOptions), currentPlural = currentPlural, formats = formats, locales = locales, pluralNumberFormat = pluralNumberFormat, pluralStack = pluralStack)
  
    __obj.asInstanceOf[Compiler]
  }
}

