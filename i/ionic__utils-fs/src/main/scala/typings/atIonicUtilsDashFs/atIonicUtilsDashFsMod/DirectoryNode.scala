package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typings.atIonicUtilsDashFs.atIonicUtilsDashFsStrings.directory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNode extends FileNode {
  var children: js.Array[FileNode]
  var parent: js.UndefOr[FileNode] = js.undefined
  var path: String
  var `type`: directory
}

object DirectoryNode {
  @scala.inline
  def apply(children: js.Array[FileNode], path: String, `type`: directory, parent: FileNode = null): DirectoryNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNode]
  }
}

