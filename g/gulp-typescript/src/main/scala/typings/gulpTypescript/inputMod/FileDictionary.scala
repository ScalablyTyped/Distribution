package typings.gulpTypescript.inputMod

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.typesMod.VinylFile
import typings.gulpTypescript.utilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-typescript/release/input", "FileDictionary")
@js.native
class FileDictionary protected () extends js.Object {
  def this(caseSensitive: Boolean, typescript: Typeofts) = this()
  
  def addContent(fileName: String, content: String): File = js.native
  
  var addFile: js.Any = js.native
  
  def addGulp(gFile: VinylFile): File = js.native
  
  var caseSensitive: Boolean = js.native
  
  var commonBasePath: String = js.native
  
  var commonSourceDirectory: String = js.native
  
  var files: Map[File] = js.native
  
  var firstSourceFile: File = js.native
  
  def getFile(name: String): File = js.native
  
  def getFileNames(): js.Array[String] = js.native
  def getFileNames(onlyGulp: Boolean): js.Array[String] = js.native
  
  var getSourceFileNames: js.Any = js.native
  
  def initTypeScriptSourceFile(file: File): Unit = js.native
  
  var typescript: Typeofts = js.native
}
