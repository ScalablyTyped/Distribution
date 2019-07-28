package typings.jqueryDotJoyride.jqueryDotJoyrideMod.Global

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
  var button: js.UndefOr[String] = js.undefined
  /**
  		 * Exposed Cover template
  		 * @member {string}
  		 */
  var exposeCover: js.UndefOr[String] = js.undefined
  /**
  		 * Link template
  		 * @member {string}
  		 */
  var link: js.UndefOr[String] = js.undefined
  /**
  		 * Modal template
  		 * @member {string}
  		 */
  var modal: js.UndefOr[String] = js.undefined
  /**
  		 * Timer template
  		 * @member {string}
  		 */
  var timer: js.UndefOr[String] = js.undefined
  /**
  		 * Tip template
  		 * @member {string}
  		 */
  var tip: js.UndefOr[String] = js.undefined
  /**
  		 * Wrapper template
  		 * @member {string}
  		 */
  var wrapper: js.UndefOr[String] = js.undefined
}

object JoyrideTemplate {
  @scala.inline
  def apply(
    button: String = null,
    exposeCover: String = null,
    link: String = null,
    modal: String = null,
    timer: String = null,
    tip: String = null,
    wrapper: String = null
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

