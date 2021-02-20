package typings.gulpTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.inputMod.File
import typings.gulpTypescript.reporterMod.TypeScriptError
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("gulp-typescript/release/utils", "deprecate")
  @js.native
  def deprecate(title: String, alternative: String): Unit = js.native
  @JSImport("gulp-typescript/release/utils", "deprecate")
  @js.native
  def deprecate(title: String, alternative: String, description: String): Unit = js.native
  
  @JSImport("gulp-typescript/release/utils", "forwardSlashes")
  @js.native
  def forwardSlashes(fileName: String): String = js.native
  
  @JSImport("gulp-typescript/release/utils", "getCommonBasePath")
  @js.native
  def getCommonBasePath(a: String, b: String): String = js.native
  
  @JSImport("gulp-typescript/release/utils", "getCommonBasePathOfArray")
  @js.native
  def getCommonBasePathOfArray(paths: js.Array[String]): String = js.native
  
  @JSImport("gulp-typescript/release/utils", "getError")
  @js.native
  def getError(info: Diagnostic, typescript: Typeofts): TypeScriptError = js.native
  @JSImport("gulp-typescript/release/utils", "getError")
  @js.native
  def getError(info: Diagnostic, typescript: Typeofts, file: File): TypeScriptError = js.native
  
  @JSImport("gulp-typescript/release/utils", "message")
  @js.native
  def message(title: String, alternative: String): Unit = js.native
  @JSImport("gulp-typescript/release/utils", "message")
  @js.native
  def message(title: String, alternative: String, description: String): Unit = js.native
  
  @JSImport("gulp-typescript/release/utils", "normalizePath")
  @js.native
  def normalizePath(caseSensitive: Boolean, pathString: String): String = js.native
  
  @JSImport("gulp-typescript/release/utils", "splitExtension")
  @js.native
  def splitExtension(fileName: String): js.Tuple2[String, String] = js.native
  @JSImport("gulp-typescript/release/utils", "splitExtension")
  @js.native
  def splitExtension(fileName: String, knownExtensions: js.Array[String]): js.Tuple2[String, String] = js.native
  
  type Map[T] = StringDictionary[T]
}
