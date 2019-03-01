package typings
package jqueryDotJoyrideLib.jqueryDotJoyrideMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * HTML segments for tip layout
	 */
trait JoyrideTemplate extends js.Object {
  /**
  		 * Button template
  		 * @member {string}
  		 */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Exposed Cover template
  		 * @member {string}
  		 */
  var exposeCover: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Link template
  		 * @member {string}
  		 */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Modal template
  		 * @member {string}
  		 */
  var modal: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Timer template
  		 * @member {string}
  		 */
  var timer: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Tip template
  		 * @member {string}
  		 */
  var tip: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Wrapper template
  		 * @member {string}
  		 */
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

object JoyrideTemplate {
  @scala.inline
  def apply(
    button: java.lang.String = null,
    exposeCover: java.lang.String = null,
    link: java.lang.String = null,
    modal: java.lang.String = null,
    timer: java.lang.String = null,
    tip: java.lang.String = null,
    wrapper: java.lang.String = null
  ): JoyrideTemplate = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (exposeCover != null) __obj.updateDynamic("exposeCover")(exposeCover)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modal != null) __obj.updateDynamic("modal")(modal)
    if (timer != null) __obj.updateDynamic("timer")(timer)
    if (tip != null) __obj.updateDynamic("tip")(tip)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[JoyrideTemplate]
  }
}

