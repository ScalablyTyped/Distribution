package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Etag extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var modified: js.UndefOr[String] = js.native
  var vary: js.UndefOr[Boolean] = js.native
}

object Etag {
  @scala.inline
  def apply(): Etag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etag]
  }
  @scala.inline
  implicit class EtagOps[Self <: Etag] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setVary(value: Boolean): Self = this.set("vary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVary: Self = this.set("vary", js.undefined)
  }
  
}

