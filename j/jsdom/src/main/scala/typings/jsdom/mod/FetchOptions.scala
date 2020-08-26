package typings.jsdom.mod

import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLLinkElement
import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var cookieJar: js.UndefOr[CookieJar] = js.native
  var element: js.UndefOr[HTMLScriptElement | HTMLLinkElement | HTMLIFrameElement | HTMLImageElement] = js.native
  var referrer: js.UndefOr[String] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
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
    def setCookieJar(value: CookieJar): Self = this.set("cookieJar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieJar: Self = this.set("cookieJar", js.undefined)
    @scala.inline
    def setElement(value: HTMLScriptElement | HTMLLinkElement | HTMLIFrameElement | HTMLImageElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
  }
  
}

