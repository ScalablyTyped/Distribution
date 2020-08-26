package typings.grammarkdown.hostMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncHostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.native
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.native
}

object AsyncHostOptions {
  @scala.inline
  def apply(): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncHostOptions]
  }
  @scala.inline
  implicit class AsyncHostOptionsOps[Self <: AsyncHostOptions] (val x: Self) extends AnyVal {
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
    def setReadFile(value: ReadFileCallback | LegacyReadFileCallback | `false`): Self = this.set("readFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    @scala.inline
    def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback | `false`): Self = this.set("writeFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
  }
  
}

