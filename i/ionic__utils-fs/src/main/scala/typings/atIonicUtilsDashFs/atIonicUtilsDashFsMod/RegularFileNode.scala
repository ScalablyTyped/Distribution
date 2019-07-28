package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typings.atIonicUtilsDashFs.atIonicUtilsDashFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularFileNode extends FileNode {
  var parent: FileNode
  var path: String
  var `type`: file
}

object RegularFileNode {
  @scala.inline
  def apply(parent: FileNode, path: String, `type`: file): RegularFileNode = {
    val __obj = js.Dynamic.literal(parent = parent, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegularFileNode]
  }
}

