package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRatingMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit = js.native
  /**
  	 * Destroys igRating widget.
  	 */
  def destroy(): js.Object = js.native
  /**
  	 * Sets focus to igRating. That has effect only when options.focusable is enabled.
  	 */
  def focus(): js.Object = js.native
  /**
  	 * Checks if igRating has focus.
  	 */
  def hasFocus(): scala.Boolean = js.native
  /**
  	 * Triggers validation.
  	 */
  def validate(): scala.Boolean = js.native
  /**
  	 * Gets reference to [igValidator](ui.igvalidator) used by igRating.
  	 *
  	 * @param destroy Request to destroy validator.
  	 */
  def validator(): js.Object = js.native
  /**
  	 * Gets reference to [igValidator](ui.igvalidator) used by igRating.
  	 *
  	 * @param destroy Request to destroy validator.
  	 */
  def validator(destroy: scala.Boolean): js.Object = js.native
  /**
  	 * Gets/Sets (selected) value.
  	 *
  	 * @param val New value which is rendered with selected css.
  	 * @return number|object If parameter is not 'number', then exact value rendered with selected css is returned. Otherwise, reference to igRating is returned.
  	 */
  def value(`val`: scala.Double): scala.Double | js.Object = js.native
  /**
  	 * Gets/Sets hover value.
  	 *
  	 * @param val New value which will be rendered with hover css when rating gets mouse.
  	 * @return number|object If parameter is not "number", then last value which was rendered with hover css is returned. Otherwise, reference to igRating is returned.
  	 */
  def valueHover(): scala.Double | js.Object = js.native
  /**
  	 * Gets/Sets hover value.
  	 *
  	 * @param val New value which will be rendered with hover css when rating gets mouse.
  	 * @return number|object If parameter is not "number", then last value which was rendered with hover css is returned. Otherwise, reference to igRating is returned.
  	 */
  def valueHover(`val`: scala.Double): scala.Double | js.Object = js.native
}

