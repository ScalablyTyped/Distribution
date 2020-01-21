package typings.gulpTypescript.reporterMod

import typings.gulpTypescript.AnonCharacter
import typings.gulpTypescript.typesMod.VinylFile
import typings.std.Error
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptError extends Error {
  var diagnostic: Diagnostic
  var endPosition: js.UndefOr[AnonCharacter] = js.undefined
  var file: js.UndefOr[VinylFile] = js.undefined
  var fullFilename: js.UndefOr[String] = js.undefined
  var relativeFilename: js.UndefOr[String] = js.undefined
  var startPosition: js.UndefOr[AnonCharacter] = js.undefined
  var tsFile: js.UndefOr[SourceFile] = js.undefined
}

object TypeScriptError {
  @scala.inline
  def apply(
    diagnostic: Diagnostic,
    message: String,
    name: String,
    endPosition: AnonCharacter = null,
    file: VinylFile = null,
    fullFilename: String = null,
    relativeFilename: String = null,
    stack: String = null,
    startPosition: AnonCharacter = null,
    tsFile: SourceFile = null
  ): TypeScriptError = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fullFilename != null) __obj.updateDynamic("fullFilename")(fullFilename.asInstanceOf[js.Any])
    if (relativeFilename != null) __obj.updateDynamic("relativeFilename")(relativeFilename.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (tsFile != null) __obj.updateDynamic("tsFile")(tsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptError]
  }
}

