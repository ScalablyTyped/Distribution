package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNode extends FileNode {
  var children: js.Array[FileNode]
  var parent: js.UndefOr[FileNode] = js.undefined
  var path: java.lang.String
  var `type`: FileType
}

object DirectoryNode {
  @scala.inline
  def apply(children: js.Array[FileNode], path: java.lang.String, `type`: FileType, parent: FileNode = null): DirectoryNode = {
    val __obj = js.Dynamic.literal(children = children, path = path)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DirectoryNode]
  }
}

