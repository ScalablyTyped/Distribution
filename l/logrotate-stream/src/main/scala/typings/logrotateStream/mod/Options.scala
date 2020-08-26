package typings.logrotateStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Optionally compress rotated files with gzip.
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * The file log file to write data to.
    */
  var file: String = js.native
  /**
    * The number of rotated log files to keep (including the primary log file). Additional logs are deleted no rotation.
    */
  var keep: Double = js.native
  /**
    * The max file size of a log before rotation occurs. Supports 1024, 1k, 1m, 1g
    */
  var size: String = js.native
}

object Options {
  @scala.inline
  def apply(file: String, keep: Double, size: String): Options = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setKeep(value: Double): Self = this.set("keep", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
  }
  
}

