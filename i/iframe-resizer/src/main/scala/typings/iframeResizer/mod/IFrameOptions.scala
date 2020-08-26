package typings.iframeResizer.mod

import typings.iframeResizer.iframeResizerStrings.auto
import typings.iframeResizer.iframeResizerStrings.child
import typings.iframeResizer.iframeResizerStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IFrameOptions extends js.Object {
  /**
    * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
    * Disable if using size method with custom dimensions.
    */
  var autoResize: js.UndefOr[Boolean] = js.native
  /**
    * Override the body background style in the iFrame.
    */
  var bodyBackground: js.UndefOr[String] = js.native
  /**
    * Override the default body margin style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyMargin: js.UndefOr[Double | String] = js.native
  /**
    * Override the default body padding style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyPadding: js.UndefOr[Double | String] = js.native
  /**
    * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
    * If your iFrame navigates between different domains, ports or protocols; then you will need to
    * provide an array of URLs or disable this option.
    */
  var checkOrigin: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
    */
  var closedCallback: js.UndefOr[js.Function1[/* iframeId */ String, Unit]] = js.native
  /**
    * Height calculation method.
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.native
  /**
    * Set iFrame Id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
    */
  var inPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Initial setup callback function.
    */
  var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, Unit]] = js.native
  /**
    * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
    * setInterval, to check for changes to the page size.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Setting the log option to true will make the scripts in both the host page and the iFrame output
    * everything they do to the JavaScript console so you can see the communication between the two scripts.
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * Set maximum height of iFrame.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Set maximum width of iFrame.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, Unit]] = js.native
  /**
    * Set minimum height of iFrame.
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * Set minimum width of iFrame.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
    * can be resized independently of the browser window. Selecting this value can cause issues with some
    * height calculation methods on mobile devices.
    */
  var resizeFrom: js.UndefOr[parent | child] = js.native
  /**
    * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
    * and the type of event that triggered the iFrame to resize.
    */
  var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, Unit]] = js.native
  /**
    * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
    * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
    * If this callback function returns false, it will stop the library from repositioning the page, so that
    * you can implement your own animated page scrolling instead.
    */
  var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, Boolean]] = js.native
  /**
    * Enable scroll bars in iFrame.
    */
  var scrolling: js.UndefOr[Boolean | auto] = js.native
  /**
    * Resize iFrame to content height.
    */
  var sizeHeight: js.UndefOr[Boolean] = js.native
  /**
    * Resize iFrame to content width.
    */
  var sizeWidth: js.UndefOr[Boolean] = js.native
  /**
    * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
    */
  var tolerance: js.UndefOr[Double] = js.native
  /**
    * Width calculation method.
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.native
}

object IFrameOptions {
  @scala.inline
  def apply(): IFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFrameOptions]
  }
  @scala.inline
  implicit class IFrameOptionsOps[Self <: IFrameOptions] (val x: Self) extends AnyVal {
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    @scala.inline
    def setBodyBackground(value: String): Self = this.set("bodyBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyBackground: Self = this.set("bodyBackground", js.undefined)
    @scala.inline
    def setBodyMargin(value: Double | String): Self = this.set("bodyMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyMargin: Self = this.set("bodyMargin", js.undefined)
    @scala.inline
    def setBodyPadding(value: Double | String): Self = this.set("bodyPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyPadding: Self = this.set("bodyPadding", js.undefined)
    @scala.inline
    def setCheckOriginVarargs(value: String*): Self = this.set("checkOrigin", js.Array(value :_*))
    @scala.inline
    def setCheckOrigin(value: Boolean | js.Array[String]): Self = this.set("checkOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckOrigin: Self = this.set("checkOrigin", js.undefined)
    @scala.inline
    def setClosedCallback(value: /* iframeId */ String => Unit): Self = this.set("closedCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClosedCallback: Self = this.set("closedCallback", js.undefined)
    @scala.inline
    def setHeightCalculationMethod(value: HeightCalculationMethod): Self = this.set("heightCalculationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightCalculationMethod: Self = this.set("heightCalculationMethod", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInPageLinks(value: Boolean): Self = this.set("inPageLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInPageLinks: Self = this.set("inPageLinks", js.undefined)
    @scala.inline
    def setInitCallback(value: /* iframe */ IFrameComponent => Unit): Self = this.set("initCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitCallback: Self = this.set("initCallback", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMessageCallback(value: /* data */ IFrameMessageData => Unit): Self = this.set("messageCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMessageCallback: Self = this.set("messageCallback", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setResizeFrom(value: parent | child): Self = this.set("resizeFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeFrom: Self = this.set("resizeFrom", js.undefined)
    @scala.inline
    def setResizedCallback(value: /* data */ IFrameResizedData => Unit): Self = this.set("resizedCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizedCallback: Self = this.set("resizedCallback", js.undefined)
    @scala.inline
    def setScrollCallback(value: /* data */ IFrameScrollData => Boolean): Self = this.set("scrollCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScrollCallback: Self = this.set("scrollCallback", js.undefined)
    @scala.inline
    def setScrolling(value: Boolean | auto): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSizeHeight(value: Boolean): Self = this.set("sizeHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeHeight: Self = this.set("sizeHeight", js.undefined)
    @scala.inline
    def setSizeWidth(value: Boolean): Self = this.set("sizeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeWidth: Self = this.set("sizeWidth", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    @scala.inline
    def setWidthCalculationMethod(value: WidthCalculationMethod): Self = this.set("widthCalculationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthCalculationMethod: Self = this.set("widthCalculationMethod", js.undefined)
  }
  
}

