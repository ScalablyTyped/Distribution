package typings
package iframeDashResizerLib.iframeDashResizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFramePageOptions extends js.Object {
  /**
    * These option can be used to override the option set in the parent page
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[scala.Double]] = js.undefined
  /**
    * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* message */ js.Any, scala.Unit]] = js.undefined
  /**
    * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
    */
  var readyCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * This option allows you to restrict the domain of the parent page,
    * to prevent other sites mimicking your parent page.
    */
  var targetOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * These option can be used to override the option set in the parent page
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[scala.Double]] = js.undefined
}

object IFramePageOptions {
  @scala.inline
  def apply(
    heightCalculationMethod: HeightCalculationMethod | js.Function0[scala.Double] = null,
    messageCallback: /* message */ js.Any => scala.Unit = null,
    readyCallback: () => scala.Unit = null,
    targetOrigin: java.lang.String = null,
    widthCalculationMethod: WidthCalculationMethod | js.Function0[scala.Double] = null
  ): IFramePageOptions = {
    val __obj = js.Dynamic.literal()
    if (heightCalculationMethod != null) __obj.updateDynamic("heightCalculationMethod")(heightCalculationMethod.asInstanceOf[js.Any])
    if (messageCallback != null) __obj.updateDynamic("messageCallback")(js.Any.fromFunction1(messageCallback))
    if (readyCallback != null) __obj.updateDynamic("readyCallback")(js.Any.fromFunction0(readyCallback))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (widthCalculationMethod != null) __obj.updateDynamic("widthCalculationMethod")(widthCalculationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFramePageOptions]
  }
}

