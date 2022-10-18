package typings.gulpTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.releaseInputMod.File
import typings.gulpTypescript.releaseReporterMod.TypeScriptError
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseUtilsMod {
  
  @JSImport("gulp-typescript/release/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecate(title: String, alternative: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(title.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deprecate(title: String, alternative: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(title.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forwardSlashes(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardSlashes")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCommonBasePath(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommonBasePath")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCommonBasePathOfArray(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonBasePathOfArray")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getError(info: Diagnostic, typescript: Typeofts): TypeScriptError = (^.asInstanceOf[js.Dynamic].applyDynamic("getError")(info.asInstanceOf[js.Any], typescript.asInstanceOf[js.Any])).asInstanceOf[TypeScriptError]
  inline def getError(info: Diagnostic, typescript: Typeofts, file: File): TypeScriptError = (^.asInstanceOf[js.Dynamic].applyDynamic("getError")(info.asInstanceOf[js.Any], typescript.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[TypeScriptError]
  
  inline def message(title: String, alternative: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(title.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(title: String, alternative: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(title.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizePath(caseSensitive: Boolean, pathString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(caseSensitive.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitExtension(fileName: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitExtension")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  inline def splitExtension(fileName: String, knownExtensions: js.Array[String]): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitExtension")(fileName.asInstanceOf[js.Any], knownExtensions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  
  type Map[T] = StringDictionary[T]
}
