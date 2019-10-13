package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of chownFile */
trait ChownFileResult extends js.Object {
  /** Access rights */
  var acl: FileACL
  /** Date of creation */
  var createdAt: Double
  /** Name of the file or directory */
  var file: String
  /** Whether this is a directory or a file */
  var isDir: Boolean
  /** Date of last modification */
  var modifiedAt: Double
  /** The parent directory of the processed file or directory */
  var path: String
  /** File system stats */
  var stats: Stats
}

object ChownFileResult {
  @scala.inline
  def apply(
    acl: FileACL,
    createdAt: Double,
    file: String,
    isDir: Boolean,
    modifiedAt: Double,
    path: String,
    stats: Stats
  ): ChownFileResult = {
    val __obj = js.Dynamic.literal(acl = acl, createdAt = createdAt, file = file, isDir = isDir, modifiedAt = modifiedAt, path = path, stats = stats)
  
    __obj.asInstanceOf[ChownFileResult]
  }
}

