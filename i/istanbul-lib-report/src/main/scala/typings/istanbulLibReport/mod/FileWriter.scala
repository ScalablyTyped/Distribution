package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-lib-report", "FileWriter")
@js.native
class FileWriter protected () extends js.Object {
  def this(baseDir: String) = this()
  
  /**
    * copies a file from a source directory to a destination name
    */
  def copyFile(source: String, dest: String): Unit = js.native
  def copyFile(source: String, dest: String, header: String): Unit = js.native
  
  /**
    * returns a content writer for writing content to the supplied file.
    */
  def writeFile(): ContentWriter = js.native
  def writeFile(file: String): ContentWriter = js.native
  
  /**
    * returns a FileWriter that is rooted at the supplied subdirectory
    */
  def writeForDir(subdir: String): FileWriter = js.native
}
/* static members */
@JSImport("istanbul-lib-report", "FileWriter")
@js.native
object FileWriter extends js.Object {
  
  def getOutput(): String = js.native
  
  def resetOutput(): Unit = js.native
  
  def startCapture(): Unit = js.native
  
  def stopCapture(): Unit = js.native
}
