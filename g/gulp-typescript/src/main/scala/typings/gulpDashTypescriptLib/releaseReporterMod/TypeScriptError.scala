package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeScriptError
  extends nodeLib.Error {
  var diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic
  var endPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
  var file: js.UndefOr[vinylLib.vinylMod.File] = js.undefined
  var fullFilename: js.UndefOr[java.lang.String] = js.undefined
  var relativeFilename: js.UndefOr[java.lang.String] = js.undefined
  var startPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
  var tsFile: js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceFile] = js.undefined
}

