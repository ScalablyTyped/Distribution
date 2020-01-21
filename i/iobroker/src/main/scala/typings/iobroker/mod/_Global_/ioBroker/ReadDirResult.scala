package typings.iobroker.mod._Global_.ioBroker

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of readDir */
trait ReadDirResult extends js.Object {
  /** Access rights */
  var acl: EvaluatedFileACL
  /** Date of creation */
  var createdAt: Double
  /** Name of the file or directory */
  var file: String
  /** Whether this is a directory or a file */
  var isDir: Boolean
  /** Date of last modification */
  var modifiedAt: Double
  /** File system stats */
  var stats: Stats
}

object ReadDirResult {
  @scala.inline
  def apply(
    acl: EvaluatedFileACL,
    createdAt: Double,
    file: String,
    isDir: Boolean,
    modifiedAt: Double,
    stats: Stats
  ): ReadDirResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadDirResult]
  }
}

