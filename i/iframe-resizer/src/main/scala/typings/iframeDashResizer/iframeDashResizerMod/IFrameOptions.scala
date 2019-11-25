package typings.iframeDashResizer.iframeDashResizerMod

import typings.iframeDashResizer.iframeDashResizerStrings.auto
import typings.iframeDashResizer.iframeDashResizerStrings.child
import typings.iframeDashResizer.iframeDashResizerStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameOptions extends js.Object {
  /**
    * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
    * Disable if using size method with custom dimensions.
    */
  var autoResize: js.UndefOr[Boolean] = js.undefined
  /**
    * Override the body background style in the iFrame.
    */
  var bodyBackground: js.UndefOr[String] = js.undefined
  /**
    * Override the default body margin style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyMargin: js.UndefOr[Double | String] = js.undefined
  /**
    * Override the default body padding style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyPadding: js.UndefOr[Double | String] = js.undefined
  /**
    * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
    * If your iFrame navigates between different domains, ports or protocols; then you will need to
    * provide an array of URLs or disable this option.
    */
  var checkOrigin: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
    */
  var closedCallback: js.UndefOr[js.Function1[/* iframeId */ String, Unit]] = js.undefined
  /**
    * Height calculation method.
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.undefined
  /**
    * Set iFrame Id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
    */
  var inPageLinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial setup callback function.
    */
  var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, Unit]] = js.undefined
  /**
    * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
    * setInterval, to check for changes to the page size.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Setting the log option to true will make the scripts in both the host page and the iFrame output
    * everything they do to the JavaScript console so you can see the communication between the two scripts.
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * Set maximum height of iFrame.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Set maximum width of iFrame.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, Unit]] = js.undefined
  /**
    * Set minimum height of iFrame.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * Set minimum width of iFrame.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
    * can be resized independently of the browser window. Selecting this value can cause issues with some
    * height calculation methods on mobile devices.
    */
  var resizeFrom: js.UndefOr[parent | child] = js.undefined
  /**
    * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
    * and the type of event that triggered the iFrame to resize.
    */
  var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, Unit]] = js.undefined
  /**
    * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
    * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
    * If this callback function returns false, it will stop the library from repositioning the page, so that
    * you can implement your own animated page scrolling instead.
    */
  var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, Boolean]] = js.undefined
  /**
    * Enable scroll bars in iFrame.
    */
  var scrolling: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * Resize iFrame to content height.
    */
  var sizeHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Resize iFrame to content width.
    */
  var sizeWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
    */
  var tolerance: js.UndefOr[Double] = js.undefined
  /**
    * Width calculation method.
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.undefined
}

object IFrameOptions {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[Boolean] = js.undefined,
    bodyBackground: String = null,
    bodyMargin: Double | String = null,
    bodyPadding: Double | String = null,
    checkOrigin: Boolean | js.Array[String] = null,
    closedCallback: /* iframeId */ String => Unit = null,
    heightCalculationMethod: HeightCalculationMethod = null,
    id: String = null,
    inPageLinks: js.UndefOr[Boolean] = js.undefined,
    initCallback: /* iframe */ IFrameComponent => Unit = null,
    interval: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    messageCallback: /* data */ IFrameMessageData => Unit = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    resizeFrom: parent | child = null,
    resizedCallback: /* data */ IFrameResizedData => Unit = null,
    scrollCallback: /* data */ IFrameScrollData => Boolean = null,
    scrolling: Boolean | auto = null,
    sizeHeight: js.UndefOr[Boolean] = js.undefined,
    sizeWidth: js.UndefOr[Boolean] = js.undefined,
    tolerance: Int | Double = null,
    widthCalculationMethod: WidthCalculationMethod = null
  ): IFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (bodyBackground != null) __obj.updateDynamic("bodyBackground")(bodyBackground.asInstanceOf[js.Any])
    if (bodyMargin != null) __obj.updateDynamic("bodyMargin")(bodyMargin.asInstanceOf[js.Any])
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding.asInstanceOf[js.Any])
    if (checkOrigin != null) __obj.updateDynamic("checkOrigin")(checkOrigin.asInstanceOf[js.Any])
    if (closedCallback != null) __obj.updateDynamic("closedCallback")(js.Any.fromFunction1(closedCallback))
    if (heightCalculationMethod != null) __obj.updateDynamic("heightCalculationMethod")(heightCalculationMethod.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inPageLinks)) __obj.updateDynamic("inPageLinks")(inPageLinks.asInstanceOf[js.Any])
    if (initCallback != null) __obj.updateDynamic("initCallback")(js.Any.fromFunction1(initCallback))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (messageCallback != null) __obj.updateDynamic("messageCallback")(js.Any.fromFunction1(messageCallback))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (resizeFrom != null) __obj.updateDynamic("resizeFrom")(resizeFrom.asInstanceOf[js.Any])
    if (resizedCallback != null) __obj.updateDynamic("resizedCallback")(js.Any.fromFunction1(resizedCallback))
    if (scrollCallback != null) __obj.updateDynamic("scrollCallback")(js.Any.fromFunction1(scrollCallback))
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeHeight)) __obj.updateDynamic("sizeHeight")(sizeHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeWidth)) __obj.updateDynamic("sizeWidth")(sizeWidth.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (widthCalculationMethod != null) __obj.updateDynamic("widthCalculationMethod")(widthCalculationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameOptions]
  }
}

