package typings.ionicUtilsFs.mod

import typings.ionicUtilsFs.ionicUtilsFsStrings.directory
import typings.ionicUtilsFs.ionicUtilsFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicUtilsFs.mod.RegularFileNode
  - typings.ionicUtilsFs.mod.DirectoryNode
*/
trait FileNode extends js.Object

object FileNode {
  @scala.inline
  def RegularFileNode(parent: FileNode, path: String, `type`: file): FileNode = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNode]
  }
  @scala.inline
  def DirectoryNode(children: js.Array[FileNode], path: String, `type`: directory): FileNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNode]
  }
}

