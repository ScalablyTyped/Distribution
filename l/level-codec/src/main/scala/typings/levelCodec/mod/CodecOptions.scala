package typings.levelCodec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodecOptions extends js.Object {
  var keyEncoding: js.UndefOr[String | CodecEncoder] = js.native
  var valueEncoding: js.UndefOr[String | CodecEncoder] = js.native
}

object CodecOptions {
  @scala.inline
  def apply(): CodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodecOptions]
  }
  @scala.inline
  implicit class CodecOptionsOps[Self <: CodecOptions] (val x: Self) extends AnyVal {
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
    def setKeyEncoding(value: String | CodecEncoder): Self = this.set("keyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyEncoding: Self = this.set("keyEncoding", js.undefined)
    @scala.inline
    def setValueEncoding(value: String | CodecEncoder): Self = this.set("valueEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueEncoding: Self = this.set("valueEncoding", js.undefined)
  }
  
}

