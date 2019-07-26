package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateDiagnostic extends js.Object {
  var absFilePath: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var debugText: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var level: java.lang.String | js.Any
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var lines: js.UndefOr[js.Array[atIonicCoreLib.Anon_ErrorCharStart]] = js.undefined
  var messageText: java.lang.String
  var relFilePath: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String | js.Any
}

object HydrateDiagnostic {
  @scala.inline
  def apply(
    level: java.lang.String | js.Any,
    messageText: java.lang.String,
    `type`: java.lang.String | js.Any,
    absFilePath: java.lang.String = null,
    code: java.lang.String = null,
    columnNumber: scala.Int | scala.Double = null,
    debugText: java.lang.String = null,
    header: java.lang.String = null,
    language: java.lang.String = null,
    lineNumber: scala.Int | scala.Double = null,
    lines: js.Array[atIonicCoreLib.Anon_ErrorCharStart] = null,
    relFilePath: java.lang.String = null
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

