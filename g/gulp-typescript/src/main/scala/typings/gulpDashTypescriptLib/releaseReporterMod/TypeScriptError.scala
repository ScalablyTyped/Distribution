package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptError
  extends nodeLib.Error {
  var diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic
  var endPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Character] = js.undefined
  var file: js.UndefOr[gulpDashTypescriptLib.releaseTypesMod.VinylFile] = js.undefined
  var fullFilename: js.UndefOr[java.lang.String] = js.undefined
  var relativeFilename: js.UndefOr[java.lang.String] = js.undefined
  var startPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Character] = js.undefined
  var tsFile: js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceFile] = js.undefined
}

object TypeScriptError {
  @scala.inline
  def apply(
    diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic,
    endPosition: gulpDashTypescriptLib.Anon_Character = null,
    file: gulpDashTypescriptLib.releaseTypesMod.VinylFile = null,
    fullFilename: java.lang.String = null,
    relativeFilename: java.lang.String = null,
    stack: java.lang.String = null,
    startPosition: gulpDashTypescriptLib.Anon_Character = null,
    tsFile: typescriptLib.typescriptMod.tsNs.SourceFile = null
  ): TypeScriptError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagnostic")(diagnostic)
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

