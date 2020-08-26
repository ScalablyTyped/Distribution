package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIResponsePageTokenMeta extends APIResponseMeta {
  var next_page_token: js.UndefOr[String] = js.native
  var prev_page_token: js.UndefOr[String] = js.native
}

object APIResponsePageTokenMeta {
  @scala.inline
  def apply(request_id: String, status: Double, version: String): APIResponsePageTokenMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponsePageTokenMeta]
  }
  @scala.inline
  implicit class APIResponsePageTokenMetaOps[Self <: APIResponsePageTokenMeta] (val x: Self) extends AnyVal {
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
    def setNext_page_token(value: String): Self = this.set("next_page_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_page_token: Self = this.set("next_page_token", js.undefined)
    @scala.inline
    def setPrev_page_token(value: String): Self = this.set("prev_page_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev_page_token: Self = this.set("prev_page_token", js.undefined)
  }
  
}

