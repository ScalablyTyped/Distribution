package typings.hellosignEmbedded.mod.HelloSign

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenParameters extends js.Object {
  /**
    * Whether a cancel button should be displayed
    *
    * @default true
    */
  var allowCancel: js.UndefOr[Boolean] = js.native
  /**
    * DOM element that will contain the iframe on the page (defaults to document.body)
    */
  var container: js.UndefOr[Element] = js.native
  /**
    * When true, debugging statements will be written to the console
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Height of the iFrame (only applicable when a container is specified)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * When true, the header will be hidden.
    * This is only functional for customers with embedded branding enabled.
    *
    * @default false
    */
  var hideHeader: js.UndefOr[Boolean] = js.native
  /**
    * A listener for X-window messages coming from the child frame
    */
  var messageListener: js.UndefOr[js.Function1[/* eventData */ MessageEvent, Unit]] = js.native
  /**
    * Where to go after the signature is completed
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * The email of the person issuing a signature request.
    * Required for allowing 'Me + Others' requests
    */
  var requester: js.UndefOr[String] = js.native
  /**
    * When true, domain verification step will be skipped if and only if the Signature Request was created with test_mode=1
    *
    * @default false
    */
  var skipDomainVerification: js.UndefOr[Boolean] = js.native
  /**
    * The url to open in the child frame
    */
  var url: js.UndefOr[String] = js.native
  /**
    * One of the HelloSign.CULTURES.supportedCultures
    *
    * @default HelloSign.CULTURES.EN_US
    */
  var userCulture: js.UndefOr[String] = js.native
  /**
    * The version of the embedded user experience to display to signers (1 = legacy, 2 = responsive).
    * This option is only honored if your account has accessed the API prior to Nov 14, 2015.
    */
  var uxVersion: js.UndefOr[Double] = js.native
  /**
    * An associative array to be used to customize the app's signer page
    */
  var whiteLabelingOptions: js.UndefOr[js.Object] = js.native
}

object OpenParameters {
  @scala.inline
  def apply(): OpenParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenParameters]
  }
  @scala.inline
  implicit class OpenParametersOps[Self <: OpenParameters] (val x: Self) extends AnyVal {
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
    def setAllowCancel(value: Boolean): Self = this.set("allowCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCancel: Self = this.set("allowCancel", js.undefined)
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideHeader(value: Boolean): Self = this.set("hideHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideHeader: Self = this.set("hideHeader", js.undefined)
    @scala.inline
    def setMessageListener(value: /* eventData */ MessageEvent => Unit): Self = this.set("messageListener", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMessageListener: Self = this.set("messageListener", js.undefined)
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    @scala.inline
    def setRequester(value: String): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setSkipDomainVerification(value: Boolean): Self = this.set("skipDomainVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipDomainVerification: Self = this.set("skipDomainVerification", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUserCulture(value: String): Self = this.set("userCulture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCulture: Self = this.set("userCulture", js.undefined)
    @scala.inline
    def setUxVersion(value: Double): Self = this.set("uxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUxVersion: Self = this.set("uxVersion", js.undefined)
    @scala.inline
    def setWhiteLabelingOptions(value: js.Object): Self = this.set("whiteLabelingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteLabelingOptions: Self = this.set("whiteLabelingOptions", js.undefined)
  }
  
}

