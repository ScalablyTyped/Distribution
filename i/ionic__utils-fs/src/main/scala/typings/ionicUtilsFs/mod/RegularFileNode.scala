package typings.ionicUtilsFs.mod

import typings.ionicUtilsFs.ionicUtilsFsStrings.file
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
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularFileNode]
  }
}

