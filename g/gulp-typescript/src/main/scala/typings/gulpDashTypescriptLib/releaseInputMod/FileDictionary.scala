package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "FileDictionary")
@js.native
class FileDictionary protected () extends js.Object {
  def this(typescript: gulpDashTypescriptLib.Anon_08) = this()
  var addFile: js.Any = js.native
  var commonBasePath: java.lang.String = js.native
  var commonSourceDirectory: java.lang.String = js.native
  var files: gulpDashTypescriptLib.releaseUtilsMod.Map[File] = js.native
  var firstSourceFile: File = js.native
  var getSourceFileNames: js.Any = js.native
  var typescript: gulpDashTypescriptLib.Anon_08 = js.native
  def addContent(fileName: java.lang.String, content: java.lang.String): File = js.native
  def addGulp(gFile: gulpDashTypescriptLib.releaseTypesMod.VinylFile): File = js.native
  def getFile(name: java.lang.String): File = js.native
  def getFileNames(): js.Array[java.lang.String] = js.native
  def getFileNames(onlyGulp: scala.Boolean): js.Array[java.lang.String] = js.native
  def initTypeScriptSourceFile(file: File): scala.Unit = js.native
}

