package typings.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paste extends js.Object {
  var Date: String = js.native
  var EmailCount: Double = js.native
  var Id: String = js.native
  var Source: String = js.native
  var Title: String = js.native
}

object Paste {
  @scala.inline
  def apply(Date: String, EmailCount: Double, Id: String, Source: String, Title: String): Paste = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EmailCount = EmailCount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paste]
  }
  @scala.inline
  implicit class PasteOps[Self <: Paste] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailCount(value: Double): Self = this.set("EmailCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
  }
  
}

