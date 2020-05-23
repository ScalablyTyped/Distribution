package typings.iobroker.mod.global.ioBroker

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of readDir */
trait ReadDirResult extends js.Object {
  /** Access rights */
  var acl: js.UndefOr[EvaluatedFileACL] = js.undefined
  /** Date of creation */
  var createdAt: js.UndefOr[Double] = js.undefined
  /** Name of the file or directory */
  var file: String
  /** Whether this is a directory or a file */
  var isDir: Boolean
  /** Date of last modification */
  var modifiedAt: js.UndefOr[Double] = js.undefined
  /** File system stats */
  var stats: Stats
}

object ReadDirResult {
  @scala.inline
  def apply(
    file: String,
    isDir: Boolean,
    stats: Stats,
    acl: EvaluatedFileACL = null,
    createdAt: js.UndefOr[Double] = js.undefined,
    modifiedAt: js.UndefOr[Double] = js.undefined
  ): ReadDirResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(createdAt)) __obj.updateDynamic("createdAt")(createdAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifiedAt)) __obj.updateDynamic("modifiedAt")(modifiedAt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirResult]
  }
}

