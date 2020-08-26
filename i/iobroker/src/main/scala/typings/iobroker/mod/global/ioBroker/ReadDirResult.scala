package typings.iobroker.mod.global.ioBroker

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of readDir */
@js.native
trait ReadDirResult extends js.Object {
  /** Access rights */
  var acl: js.UndefOr[EvaluatedFileACL] = js.native
  /** Date of creation */
  var createdAt: js.UndefOr[Double] = js.native
  /** Name of the file or directory */
  var file: String = js.native
  /** Whether this is a directory or a file */
  var isDir: Boolean = js.native
  /** Date of last modification */
  var modifiedAt: js.UndefOr[Double] = js.native
  /** File system stats */
  var stats: Stats = js.native
}

object ReadDirResult {
  @scala.inline
  def apply(file: String, isDir: Boolean, stats: Stats): ReadDirResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirResult]
  }
  @scala.inline
  implicit class ReadDirResultOps[Self <: ReadDirResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDir(value: Boolean): Self = this.set("isDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcl(value: EvaluatedFileACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setModifiedAt(value: Double): Self = this.set("modifiedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedAt: Self = this.set("modifiedAt", js.undefined)
  }
  
}

