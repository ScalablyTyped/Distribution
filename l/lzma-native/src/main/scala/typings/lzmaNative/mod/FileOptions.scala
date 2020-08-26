package typings.lzmaNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  var fileSize: Double = js.native
  var memlimit: js.UndefOr[Double] = js.native
  def read(count: Double, offset: Double, cb: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Unit = js.native
}

object FileOptions {
  @scala.inline
  def apply(
    fileSize: Double,
    read: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Unit
  ): FileOptions = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], read = js.Any.fromFunction3(read))
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Unit): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def setMemlimit(value: Double): Self = this.set("memlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemlimit: Self = this.set("memlimit", js.undefined)
  }
  
}

