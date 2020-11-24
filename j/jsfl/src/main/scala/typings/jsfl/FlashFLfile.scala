package typings.jsfl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashFLfile extends js.Object {
  
  def copy(fileURI: String, copyURI: String): Boolean = js.native
  
  def createFolder(folderURI: String): Boolean = js.native
  
  def exists(fileURI: String): Boolean = js.native
  
  def getAttributes(fileOrFolderURI: String): String = js.native
  
  def getCreationDate(fileOrFolderURI: String): String = js.native
  
  def getCreationDateObj(fileOrFolderURI: String): Date = js.native
  
  def getModificationDate(fileOrFolderURI: String): String = js.native
  
  def getModificationDateObj(fileOrFolderURI: String): Date = js.native
  
  def getSize(fileURI: String): Double = js.native
  
  def listFolder(folderURI: String): js.Array[String] = js.native
  def listFolder(folderURI: String, filesOrDirectories: Boolean): js.Array[String] = js.native
  
  def platformPathToURI(fileName: String): String = js.native
  
  def read(fileOrFolderURI: String): String = js.native
  
  def remove(fileOrFolderURI: String): Boolean = js.native
  
  def setAttributes(fileURI: String, strAttrs: String): Boolean = js.native
  
  def uriToPlatformPath(fileURI: String): String = js.native
  
  def write(fileURI: String, textToWrite: String): Boolean = js.native
  def write(fileURI: String, textToWrite: String, strAppendMode: String): Boolean = js.native
}
