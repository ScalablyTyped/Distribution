package typings.jsonfile.anon

import typings.jsonfile.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.native
  var flag: js.UndefOr[String] = js.native
  var fs: js.UndefOr[FS] = js.native
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
  var throws: js.UndefOr[Boolean] = js.native
}

object Encoding {
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setFs(value: FS): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = this.set("reviver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
    @scala.inline
    def setThrows(value: Boolean): Self = this.set("throws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrows: Self = this.set("throws", js.undefined)
  }
  
}

