package typings.iobroker.iobrokerMod.Global.ioBroker

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
    val __obj = js.Dynamic.literal(acl = acl, createdAt = createdAt, file = file, isDir = isDir, modifiedAt = modifiedAt, stats = stats)
  
    __obj.asInstanceOf[ReadDirResult]
  }
}

