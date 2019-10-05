package typings.jqueryDashEasyDashLoading.JQueryEasyLoading

import typings.jqueryDashEasyDashLoading.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Class(es) to be applied to the overlay element when the loading state is stopped
    */
  var hiddenClass: js.UndefOr[String] = js.undefined
  /**
    * Message to be rendered on the overlay content
    * Has no effect if a custom overlay is defined
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Function to be executed when the overlay is clicked
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.click` event
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Function to be executed when the loading state is started
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.start` event
    */
  var onStart: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.undefined
  /**
    * Function to be executed when the loading state is stopped
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.stop` event
    */
  var onStop: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.undefined
  /**
    * jQuery element to be used as overlay
    * If not defined, a default overlay will be created
    */
  var overlay: js.UndefOr[JQuery] = js.undefined
  /**
    * Class(es) to be applied to the overlay element when the loading state is started
    */
  var shownClass: js.UndefOr[String] = js.undefined
  /**
    * Set to false to not start the loading state when initialized
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to stop the loading state if the overlay is clicked
    * This options does NOT override the onClick event
    */
  var stoppable: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme to be applied on the loading element
    *
    * Some default themes are implemented on `jquery.loading.css`, but you can
    *  define your own. Just add a `.loading-theme-my_awesome_theme` selector
    *  somewhere with your custom styles and change this option
    *  to 'my_awesome_theme'. The class is applied to the parent overlay div
    *
    * Has no effect if a custom overlay is defined
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * z-index to be used by the default overlay
    * If not defined, a z-index will be calculated based on the
    * target's z-index
    * Has no effect if a custom overlay is defined
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    hiddenClass: String = null,
    message: String = null,
    onClick: js.Function = null,
    onStart: /* loading */ LoadingObject => Unit = null,
    onStop: /* loading */ LoadingObject => Unit = null,
    overlay: JQuery = null,
    shownClass: String = null,
    start: js.UndefOr[Boolean] = js.undefined,
    stoppable: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (hiddenClass != null) __obj.updateDynamic("hiddenClass")(hiddenClass)
    if (message != null) __obj.updateDynamic("message")(message)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (shownClass != null) __obj.updateDynamic("shownClass")(shownClass)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(stoppable)) __obj.updateDynamic("stoppable")(stoppable)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

