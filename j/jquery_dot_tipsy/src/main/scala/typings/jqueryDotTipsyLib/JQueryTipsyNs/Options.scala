package typings
package jqueryDotTipsyLib.JQueryTipsyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * delay before showing tooltip (ms)
    *
    * default: 0
    */
  var delayIn: js.UndefOr[scala.Double] = js.undefined
  /**
    * delay before hiding  tooltip (ms)
    *
    * default: 0
    */
  var delayOut: js.UndefOr[scala.Double] = js.undefined
  /**
    * fade tooltips in/out?
    *
    * default: false
    */
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * fallback text to use when no tooltip text
    *
    * default: ''
    */
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  /**
    * gravity
    *
    * default: 'n'
    */
  var gravity: js.UndefOr[js.Any] = js.undefined
   // string or () => string
  /**
    * is tooltip content HTML?
    *
    * default: false
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * use live event support?
    *
    * default: false
    */
  var live: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * pixel offset of tooltip from element
    *
    * default: 0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * opacity of tooltip
    *
    * default: 0.8
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * attribute/callback containing tooltip text
    *
    * default: 'title'
    */
  var title: js.UndefOr[js.Any] = js.undefined
   // string or () => string
  /**
    * how tooltip is triggered - hover | focus | manual
    *
    * default: 'hover'
    */
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    delayIn: scala.Int | scala.Double = null,
    delayOut: scala.Int | scala.Double = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    fallback: java.lang.String = null,
    gravity: js.Any = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    live: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    title: js.Any = null,
    trigger: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (delayIn != null) __obj.updateDynamic("delayIn")(delayIn.asInstanceOf[js.Any])
    if (delayOut != null) __obj.updateDynamic("delayOut")(delayOut.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[Options]
  }
}

