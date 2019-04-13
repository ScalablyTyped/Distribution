package typings
package gulpDashTypescriptLib.releaseUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deprecate(title: java.lang.String, alternative: java.lang.String): scala.Unit = js.native
  def deprecate(title: java.lang.String, alternative: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def forwardSlashes(fileName: java.lang.String): java.lang.String = js.native
  def getCommonBasePath(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def getCommonBasePathOfArray(paths: js.Array[java.lang.String]): java.lang.String = js.native
  def getError(info: typescriptLib.typescriptMod.Diagnostic, typescript: gulpDashTypescriptLib.Anon_08): gulpDashTypescriptLib.releaseReporterMod.TypeScriptError = js.native
  def getError(
    info: typescriptLib.typescriptMod.Diagnostic,
    typescript: gulpDashTypescriptLib.Anon_08,
    file: gulpDashTypescriptLib.releaseInputMod.File
  ): gulpDashTypescriptLib.releaseReporterMod.TypeScriptError = js.native
  def message(title: java.lang.String, alternative: java.lang.String): scala.Unit = js.native
  def message(title: java.lang.String, alternative: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def normalizePath(pathString: java.lang.String): java.lang.String = js.native
  def splitExtension(fileName: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def splitExtension(fileName: java.lang.String, knownExtensions: js.Array[java.lang.String]): js.Tuple2[java.lang.String, java.lang.String] = js.native
}

