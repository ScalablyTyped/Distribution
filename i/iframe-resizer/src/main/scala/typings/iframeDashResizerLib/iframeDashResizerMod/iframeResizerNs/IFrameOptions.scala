package typings
package iframeDashResizerLib.iframeDashResizerMod.iframeResizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameOptions extends js.Object {
  /**
    * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
    * Disable if using size method with custom dimensions.
    */
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override the body background style in the iFrame.
    */
  var bodyBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the default body margin style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyMargin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Override the default body padding style in the iFrame. A string can be any valid value for the
    * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
    */
  var bodyPadding: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
    * If your iFrame navigates between different domains, ports or protocols; then you will need to
    * provide an array of URLs or disable this option.
    */
  var checkOrigin: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
    */
  var closedCallback: js.UndefOr[js.Function1[/* iframeId */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Height calculation method.
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.undefined
  /**
    * Set iFrame Id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
    */
  var inPageLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initial setup callback function.
    */
  var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, scala.Unit]] = js.undefined
  /**
    * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
    * setInterval, to check for changes to the page size.
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting the log option to true will make the scripts in both the host page and the iFrame output
    * everything they do to the JavaScript console so you can see the communication between the two scripts.
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set maximum height of iFrame.
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set maximum width of iFrame.
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, scala.Unit]] = js.undefined
  /**
    * Set minimum height of iFrame.
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set minimum width of iFrame.
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
    * can be resized independently of the browser window. Selecting this value can cause issues with some
    * height calculation methods on mobile devices.
    */
  var resizeFrom: js.UndefOr[
    iframeDashResizerLib.iframeDashResizerLibStrings.parent | iframeDashResizerLib.iframeDashResizerLibStrings.child
  ] = js.undefined
  /**
    * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
    * and the type of event that triggered the iFrame to resize.
    */
  var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, scala.Unit]] = js.undefined
  /**
    * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
    * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
    * If this callback function returns false, it will stop the library from repositioning the page, so that
    * you can implement your own animated page scrolling instead.
    */
  var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, scala.Boolean]] = js.undefined
  /**
    * Enable scroll bars in iFrame.
    */
  var scrolling: js.UndefOr[scala.Boolean | iframeDashResizerLib.iframeDashResizerLibStrings.auto] = js.undefined
  /**
    * Resize iFrame to content height.
    */
  var sizeHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Resize iFrame to content width.
    */
  var sizeWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width calculation method.
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.undefined
}

object IFrameOptions {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    bodyBackground: java.lang.String = null,
    bodyMargin: scala.Double | java.lang.String = null,
    bodyPadding: scala.Double | java.lang.String = null,
    checkOrigin: scala.Boolean | js.Array[java.lang.String] = null,
    closedCallback: js.Function1[/* iframeId */ java.lang.String, scala.Unit] = null,
    heightCalculationMethod: HeightCalculationMethod = null,
    id: java.lang.String = null,
    inPageLinks: js.UndefOr[scala.Boolean] = js.undefined,
    initCallback: js.Function1[/* iframe */ IFrameComponent, scala.Unit] = null,
    interval: scala.Int | scala.Double = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    messageCallback: js.Function1[/* data */ IFrameMessageData, scala.Unit] = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    resizeFrom: iframeDashResizerLib.iframeDashResizerLibStrings.parent | iframeDashResizerLib.iframeDashResizerLibStrings.child = null,
    resizedCallback: js.Function1[/* data */ IFrameResizedData, scala.Unit] = null,
    scrollCallback: js.Function1[/* data */ IFrameScrollData, scala.Boolean] = null,
    scrolling: scala.Boolean | iframeDashResizerLib.iframeDashResizerLibStrings.auto = null,
    sizeHeight: js.UndefOr[scala.Boolean] = js.undefined,
    sizeWidth: js.UndefOr[scala.Boolean] = js.undefined,
    tolerance: scala.Int | scala.Double = null,
    widthCalculationMethod: WidthCalculationMethod = null
  ): IFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (bodyBackground != null) __obj.updateDynamic("bodyBackground")(bodyBackground)
    if (bodyMargin != null) __obj.updateDynamic("bodyMargin")(bodyMargin.asInstanceOf[js.Any])
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding.asInstanceOf[js.Any])
    if (checkOrigin != null) __obj.updateDynamic("checkOrigin")(checkOrigin.asInstanceOf[js.Any])
    if (closedCallback != null) __obj.updateDynamic("closedCallback")(closedCallback)
    if (heightCalculationMethod != null) __obj.updateDynamic("heightCalculationMethod")(heightCalculationMethod)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inPageLinks)) __obj.updateDynamic("inPageLinks")(inPageLinks)
    if (initCallback != null) __obj.updateDynamic("initCallback")(initCallback)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (messageCallback != null) __obj.updateDynamic("messageCallback")(messageCallback)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (resizeFrom != null) __obj.updateDynamic("resizeFrom")(resizeFrom.asInstanceOf[js.Any])
    if (resizedCallback != null) __obj.updateDynamic("resizedCallback")(resizedCallback)
    if (scrollCallback != null) __obj.updateDynamic("scrollCallback")(scrollCallback)
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeHeight)) __obj.updateDynamic("sizeHeight")(sizeHeight)
    if (!js.isUndefined(sizeWidth)) __obj.updateDynamic("sizeWidth")(sizeWidth)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (widthCalculationMethod != null) __obj.updateDynamic("widthCalculationMethod")(widthCalculationMethod)
    __obj.asInstanceOf[IFrameOptions]
  }
}

