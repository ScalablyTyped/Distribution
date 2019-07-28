package typings.atIonicCore.hydrateMod

import typings.atIonicCore.Anon_ErrorCharStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateDiagnostic extends js.Object {
  var absFilePath: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var debugText: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var level: String | js.Any
  var lineNumber: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[js.Array[Anon_ErrorCharStart]] = js.undefined
  var messageText: String
  var relFilePath: js.UndefOr[String] = js.undefined
  var `type`: String | js.Any
}

object HydrateDiagnostic {
  @scala.inline
  def apply(
    level: String | js.Any,
    messageText: String,
    `type`: String | js.Any,
    absFilePath: String = null,
    code: String = null,
    columnNumber: Int | Double = null,
    debugText: String = null,
    header: String = null,
    language: String = null,
    lineNumber: Int | Double = null,
    lines: js.Array[Anon_ErrorCharStart] = null,
    relFilePath: String = null
  ): HydrateDiagnostic = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], messageText = messageText)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (absFilePath != null) __obj.updateDynamic("absFilePath")(absFilePath)
    if (code != null) __obj.updateDynamic("code")(code)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (debugText != null) __obj.updateDynamic("debugText")(debugText)
    if (header != null) __obj.updateDynamic("header")(header)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (relFilePath != null) __obj.updateDynamic("relFilePath")(relFilePath)
    __obj.asInstanceOf[HydrateDiagnostic]
  }
}

