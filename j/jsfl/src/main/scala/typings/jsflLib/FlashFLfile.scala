package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashFLfile extends js.Object {
  def copy(fileURI: java.lang.String, copyURI: java.lang.String): scala.Boolean = js.native
  def createFolder(folderURI: java.lang.String): scala.Boolean = js.native
  def exists(fileURI: java.lang.String): scala.Boolean = js.native
  def getAttributes(fileOrFolderURI: java.lang.String): java.lang.String = js.native
  def getCreationDate(fileOrFolderURI: java.lang.String): java.lang.String = js.native
  def getCreationDateObj(fileOrFolderURI: java.lang.String): stdLib.Date = js.native
  def getModificationDate(fileOrFolderURI: java.lang.String): java.lang.String = js.native
  def getModificationDateObj(fileOrFolderURI: java.lang.String): stdLib.Date = js.native
  def getSize(fileURI: java.lang.String): scala.Double = js.native
  def listFolder(folderURI: java.lang.String): js.Array[java.lang.String] = js.native
  def listFolder(folderURI: java.lang.String, filesOrDirectories: scala.Boolean): js.Array[java.lang.String] = js.native
  def platformPathToURI(fileName: java.lang.String): java.lang.String = js.native
  def read(fileOrFolderURI: java.lang.String): java.lang.String = js.native
  def remove(fileOrFolderURI: java.lang.String): scala.Boolean = js.native
  def setAttributes(fileURI: java.lang.String, strAttrs: java.lang.String): scala.Boolean = js.native
  def uriToPlatformPath(fileURI: java.lang.String): java.lang.String = js.native
  def write(fileURI: java.lang.String, textToWrite: java.lang.String): scala.Boolean = js.native
  def write(fileURI: java.lang.String, textToWrite: java.lang.String, strAppendMode: java.lang.String): scala.Boolean = js.native
}

