package typings.jsdom.mod

import typings.jsdom.jsdomStrings.`outside-only`
import typings.jsdom.jsdomStrings.dangerously
import typings.jsdom.jsdomStrings.usable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  var beforeParse: js.UndefOr[js.Function1[/* window */ DOMWindow, Unit]] = js.native
  var cookieJar: js.UndefOr[CookieJar] = js.native
  /**
    * `includeNodeLocations` preserves the location info produced by the HTML parser,
    * allowing you to retrieve it with the nodeLocation() method (described below).
    *
    * It defaults to false to give the best performance,
    * and cannot be used with an XML content type since our XML parser does not support location info.
    *
    * @default false
    */
  var includeNodeLocations: js.UndefOr[Boolean] = js.native
  /**
    * jsdom does not have the capability to render visual content, and will act like a headless browser by default.
    * It provides hints to web pages through APIs such as document.hidden that their content is not visible.
    *
    * When the `pretendToBeVisual` option is set to `true`, jsdom will pretend that it is rendering and displaying
    * content.
    *
    * @default false
    */
  var pretendToBeVisual: js.UndefOr[Boolean] = js.native
  /**
    * referrer just affects the value read from document.referrer.
    * It defaults to no referrer (which reflects as the empty string).
    */
  var referrer: js.UndefOr[String] = js.native
  var resources: js.UndefOr[usable | ResourceLoader] = js.native
  var runScripts: js.UndefOr[dangerously | `outside-only`] = js.native
  /**
    * userAgent affects the value read from navigator.userAgent, as well as the User-Agent header sent while fetching subresources.
    *
    * @default
    * `Mozilla/5.0 (${process.platform}) AppleWebKit/537.36 (KHTML, like Gecko) jsdom/${jsdomVersion}`
    */
  var userAgent: js.UndefOr[String] = js.native
  var virtualConsole: js.UndefOr[VirtualConsole] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setBeforeParse(value: /* window */ DOMWindow => Unit): Self = this.set("beforeParse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeParse: Self = this.set("beforeParse", js.undefined)
    @scala.inline
    def setCookieJar(value: CookieJar): Self = this.set("cookieJar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieJar: Self = this.set("cookieJar", js.undefined)
    @scala.inline
    def setIncludeNodeLocations(value: Boolean): Self = this.set("includeNodeLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeNodeLocations: Self = this.set("includeNodeLocations", js.undefined)
    @scala.inline
    def setPretendToBeVisual(value: Boolean): Self = this.set("pretendToBeVisual", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretendToBeVisual: Self = this.set("pretendToBeVisual", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setResources(value: usable | ResourceLoader): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRunScripts(value: dangerously | `outside-only`): Self = this.set("runScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunScripts: Self = this.set("runScripts", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setVirtualConsole(value: VirtualConsole): Self = this.set("virtualConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualConsole: Self = this.set("virtualConsole", js.undefined)
  }
  
}

