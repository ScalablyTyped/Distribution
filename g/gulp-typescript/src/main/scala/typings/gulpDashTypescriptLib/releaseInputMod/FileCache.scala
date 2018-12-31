package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "FileCache")
@js.native
class FileCache protected () extends js.Object {
  def this(typescript: gulpDashTypescriptLib.Anon_CreateFunctionExpression, options: typescriptLib.typescriptMod.tsNs.CompilerOptions) = this()
  var commonBasePath: java.lang.String = js.native
  var commonSourceDirectory: java.lang.String = js.native
  var createDictionary: js.Any = js.native
  var current: FileDictionary = js.native
  var firstSourceFile: File = js.native
  var initTypeScriptSourceFile: js.Any = js.native
  var noParse: scala.Boolean = js.native
  var options: typescriptLib.typescriptMod.tsNs.CompilerOptions = js.native
  var previous: FileDictionary = js.native
  var typescript: gulpDashTypescriptLib.Anon_CreateFunctionExpression = js.native
  var version: scala.Double = js.native
  def addContent(fileName: java.lang.String, content: java.lang.String): File = js.native
  def addGulp(gFile: gulpDashTypescriptLib.releaseTypesMod.VinylFile): File = js.native
  def getFile(name: java.lang.String): File = js.native
  def getFileChange(name: java.lang.String): FileChange = js.native
  def getFileNames(): js.Array[java.lang.String] = js.native
  def getFileNames(onlyGulp: scala.Boolean): js.Array[java.lang.String] = js.native
  def isChanged(): scala.Boolean = js.native
  def isChanged(onlyGulp: scala.Boolean): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
}

