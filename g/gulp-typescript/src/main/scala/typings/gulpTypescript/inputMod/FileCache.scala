package typings.gulpTypescript.inputMod

import typings.gulpTypescript.Typeofts
import typings.gulpTypescript.typesMod.VinylFile
import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "FileCache")
@js.native
class FileCache protected () extends js.Object {
  def this(typescript: Typeofts, options: CompilerOptions) = this()
  var commonBasePath: String = js.native
  var commonSourceDirectory: String = js.native
  var createDictionary: js.Any = js.native
  var current: FileDictionary = js.native
  var firstSourceFile: File = js.native
  var initTypeScriptSourceFile: js.Any = js.native
  var noParse: Boolean = js.native
  var options: CompilerOptions = js.native
  var previous: FileDictionary = js.native
  var typescript: Typeofts = js.native
  var version: Double = js.native
  def addContent(fileName: String, content: String): File = js.native
  def addGulp(gFile: VinylFile): File = js.native
  def getFile(name: String): File = js.native
  def getFileChange(name: String): FileChange = js.native
  def getFileNames(): js.Array[String] = js.native
  def getFileNames(onlyGulp: Boolean): js.Array[String] = js.native
  def isChanged(): Boolean = js.native
  def isChanged(onlyGulp: Boolean): Boolean = js.native
  def reset(): Unit = js.native
}

