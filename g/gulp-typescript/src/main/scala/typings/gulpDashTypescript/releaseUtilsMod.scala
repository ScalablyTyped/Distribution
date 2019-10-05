package typings.gulpDashTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.gulpDashTypescript.releaseInputMod.File
import typings.gulpDashTypescript.releaseReporterMod.TypeScriptError
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/utils", JSImport.Namespace)
@js.native
object releaseUtilsMod extends js.Object {
  def deprecate(title: String, alternative: String): Unit = js.native
  def deprecate(title: String, alternative: String, description: String): Unit = js.native
  def forwardSlashes(fileName: String): String = js.native
  def getCommonBasePath(a: String, b: String): String = js.native
  def getCommonBasePathOfArray(paths: js.Array[String]): String = js.native
  def getError(info: Diagnostic, typescript: Typeofts): TypeScriptError = js.native
  def getError(info: Diagnostic, typescript: Typeofts, file: File): TypeScriptError = js.native
  def message(title: String, alternative: String): Unit = js.native
  def message(title: String, alternative: String, description: String): Unit = js.native
  def normalizePath(pathString: String): String = js.native
  def splitExtension(fileName: String): js.Tuple2[String, String] = js.native
  def splitExtension(fileName: String, knownExtensions: js.Array[String]): js.Tuple2[String, String] = js.native
  type Map[T] = StringDictionary[T]
}

