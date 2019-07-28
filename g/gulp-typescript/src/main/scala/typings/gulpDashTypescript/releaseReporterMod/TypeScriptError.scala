package typings.gulpDashTypescript.releaseReporterMod

import typings.gulpDashTypescript.Anon_Character
import typings.gulpDashTypescript.releaseTypesMod.VinylFile
import typings.std.Error
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptError extends Error {
  var diagnostic: Diagnostic
  var endPosition: js.UndefOr[Anon_Character] = js.undefined
  var file: js.UndefOr[VinylFile] = js.undefined
  var fullFilename: js.UndefOr[String] = js.undefined
  var relativeFilename: js.UndefOr[String] = js.undefined
  var startPosition: js.UndefOr[Anon_Character] = js.undefined
  var tsFile: js.UndefOr[SourceFile] = js.undefined
}

object TypeScriptError {
  @scala.inline
  def apply(
    diagnostic: Diagnostic,
    message: String,
    name: String,
    endPosition: Anon_Character = null,
    file: VinylFile = null,
    fullFilename: String = null,
    relativeFilename: String = null,
    stack: String = null,
    startPosition: Anon_Character = null,
    tsFile: SourceFile = null
  ): TypeScriptError = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic, message = message, name = name)
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fullFilename != null) __obj.updateDynamic("fullFilename")(fullFilename)
    if (relativeFilename != null) __obj.updateDynamic("relativeFilename")(relativeFilename)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition)
    if (tsFile != null) __obj.updateDynamic("tsFile")(tsFile)
    __obj.asInstanceOf[TypeScriptError]
  }
}

