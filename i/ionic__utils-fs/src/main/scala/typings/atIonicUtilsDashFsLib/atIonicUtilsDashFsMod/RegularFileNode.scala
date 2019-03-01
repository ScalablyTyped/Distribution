package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularFileNode extends FileNode {
  var parent: FileNode
  var path: java.lang.String
  var `type`: FileType
}

object RegularFileNode {
  @scala.inline
  def apply(parent: FileNode, path: java.lang.String, `type`: FileType): RegularFileNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RegularFileNode]
  }
}

