package typings.leveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownOptions extends js.Object {
  var blockRestartInterval: js.UndefOr[Double] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var compression: js.UndefOr[Boolean] = js.native
  var createIfMissing: js.UndefOr[Boolean] = js.native
  var errorIfExists: js.UndefOr[Boolean] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var maxOpenFiles: js.UndefOr[Double] = js.native
  var writeBufferSize: js.UndefOr[Double] = js.native
}

object LevelDownOptions {
  @scala.inline
  def apply(): LevelDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownOptions]
  }
  @scala.inline
  implicit class LevelDownOptionsOps[Self <: LevelDownOptions] (val x: Self) extends AnyVal {
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
    def setBlockRestartInterval(value: Double): Self = this.set("blockRestartInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockRestartInterval: Self = this.set("blockRestartInterval", js.undefined)
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCreateIfMissing(value: Boolean): Self = this.set("createIfMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateIfMissing: Self = this.set("createIfMissing", js.undefined)
    @scala.inline
    def setErrorIfExists(value: Boolean): Self = this.set("errorIfExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorIfExists: Self = this.set("errorIfExists", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMaxOpenFiles(value: Double): Self = this.set("maxOpenFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOpenFiles: Self = this.set("maxOpenFiles", js.undefined)
    @scala.inline
    def setWriteBufferSize(value: Double): Self = this.set("writeBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteBufferSize: Self = this.set("writeBufferSize", js.undefined)
  }
  
}

