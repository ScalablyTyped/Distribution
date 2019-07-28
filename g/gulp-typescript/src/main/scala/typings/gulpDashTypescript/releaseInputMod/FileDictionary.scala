package typings.gulpDashTypescript.releaseInputMod

import typings.gulpDashTypescript.Typeofts
import typings.gulpDashTypescript.releaseTypesMod.VinylFile
import typings.gulpDashTypescript.releaseUtilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "FileDictionary")
@js.native
class FileDictionary protected () extends js.Object {
  def this(typescript: Typeofts) = this()
  var addFile: js.Any = js.native
  var commonBasePath: String = js.native
  var commonSourceDirectory: String = js.native
  var files: Map[File] = js.native
  var firstSourceFile: File = js.native
  var getSourceFileNames: js.Any = js.native
  var typescript: Typeofts = js.native
  def addContent(fileName: String, content: String): File = js.native
  def addGulp(gFile: VinylFile): File = js.native
  def getFile(name: String): File = js.native
  def getFileNames(): js.Array[String] = js.native
  def getFileNames(onlyGulp: Boolean): js.Array[String] = js.native
  def initTypeScriptSourceFile(file: File): Unit = js.native
}

