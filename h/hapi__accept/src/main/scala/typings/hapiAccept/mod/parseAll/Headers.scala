package typings.hapiAccept.mod.parseAll

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers
  extends /* header */ StringDictionary[js.Any] {
  val accept: js.UndefOr[String] = js.native
  val `accept-charset`: js.UndefOr[String] = js.native
  val `accept-encoding`: js.UndefOr[String] = js.native
  val `accept-language`: js.UndefOr[String] = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def `setAccept-charset`(value: String): Self = this.set("accept-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-charset`: Self = this.set("accept-charset", js.undefined)
    @scala.inline
    def `setAccept-encoding`(value: String): Self = this.set("accept-encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-encoding`: Self = this.set("accept-encoding", js.undefined)
    @scala.inline
    def `setAccept-language`(value: String): Self = this.set("accept-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-language`: Self = this.set("accept-language", js.undefined)
  }
  
}

