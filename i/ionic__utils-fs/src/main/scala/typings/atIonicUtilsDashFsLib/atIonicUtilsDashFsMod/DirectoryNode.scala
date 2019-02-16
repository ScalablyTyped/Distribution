package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNode extends js.Object {
  var children: js.Array[FileNode]
  var parent: js.UndefOr[FileNode] = js.undefined
  var path: java.lang.String
  var `type`: FileType
}

