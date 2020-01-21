package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyOptions extends js.Object {
  /**
    * Additional classes to be added to the notice. (For custom styling.)
    */
  var addclass: js.UndefOr[String] = js.undefined
  /**
    * Speed at which the notice animates in and out. "slow", "def" or "normal", "fast" or number of milliseconds.
    */
  var animate_speed: js.UndefOr[String] = js.undefined
  /**
    * The animation to use when displaying and hiding the notice. "none" and "fade" are supported through CSS. 
    * Others are supported through the Animate module and Animate.css.
    */ 
  var animation: js.UndefOr[String] = js.undefined
  /**
    * Display the notice when it is created. Turn this off to add notifications to the history without displaying them.
    */
  var auto_display: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[AnonCloserCloserhover] = js.undefined
  /**
    * Support for PNotifyconfirm options
    */
  var confirm: js.UndefOr[PNotifyconfirm] = js.undefined
  /**
    * Class to be added to the notice for corner styling.
    */
  var cornerclass: js.UndefOr[String] = js.undefined
  /**
    * Delay in milliseconds before the notice is removed.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * After a delay, remove the notice, set to false for sticky note.
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  /**
    * Display a pull down menu to redisplay previous notices, and place the notice in the history.
    */
  var history: js.UndefOr[Boolean] = js.undefined
  /**
    * Set icon to true to use the default icon for the selected style/type, false for no icon, or a string for your own icon class.
    */
  var icon: js.UndefOr[js.Any] = js.undefined
  /**
    * Change new lines to br tags.
    */
  var insert_brs: js.UndefOr[Boolean] = js.undefined
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[PNotifyLabel] = js.undefined
  /**
    * Maximum number of notifications to have onscreen.
    */
  var maxonscreen: js.UndefOr[Double] = js.undefined
  /**
    * Minimum height of the notice. It will expand to fit content.
    */
  var min_height: js.UndefOr[String] = js.undefined
  /**
    * Reset the hide timer if the mouse moves over the notice.
    */
  var mouse_reset: js.UndefOr[Boolean] = js.undefined
  var nonblock: js.UndefOr[AnonNonblock] = js.undefined
  /**
    * Opacity of the notice.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Specify a specific duration of position animation
    */
  var position_animate_speed: js.UndefOr[Double] = js.undefined
  /**
    * Remove the notice's elements from the DOM after it is removed.
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
    * Display a drop shadow.
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * The stack on which the notices will be placed. Also controls the direction the notices stack.
    */
  var stack: js.UndefOr[PNotifyStack] = js.undefined
  /**
    * What styling classes to use. (Can be either "brighttheme", "jqueryui", "bootstrap2", "bootstrap3", "fontawesome" or a custom style object)
    */
  var styling: js.UndefOr[StylingOptions] = js.undefined
  /**
    * The notice's text. Either boolean false or string
    */
  var text: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Whether to escape the content of the text. (Not allow HTML.)
    */
  var text_escape: js.UndefOr[Boolean] = js.undefined
  /**
    * The notice's title. Either boolean false or string
    */
  var title: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Whether to escape the content of the title. (Not allow HTML.)
    */
  var title_escape: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of the notice. "notice", "info", "success", or "error".
    */
  var `type`: js.UndefOr[NoticeTypeOptions] = js.undefined
  /**
    * Width of the notice.
    */
  var width: js.UndefOr[String] = js.undefined
}

object PNotifyOptions {
  @scala.inline
  def apply(
    addclass: String = null,
    animate_speed: String = null,
    animation: String = null,
    auto_display: js.UndefOr[Boolean] = js.undefined,
    buttons: AnonCloserCloserhover = null,
    confirm: PNotifyconfirm = null,
    cornerclass: String = null,
    delay: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    insert_brs: js.UndefOr[Boolean] = js.undefined,
    labels: PNotifyLabel = null,
    maxonscreen: Int | Double = null,
    min_height: String = null,
    mouse_reset: js.UndefOr[Boolean] = js.undefined,
    nonblock: AnonNonblock = null,
    opacity: Int | Double = null,
    position_animate_speed: Int | Double = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    stack: PNotifyStack = null,
    styling: StylingOptions = null,
    text: String | Boolean = null,
    text_escape: js.UndefOr[Boolean] = js.undefined,
    title: String | Boolean = null,
    title_escape: js.UndefOr[Boolean] = js.undefined,
    `type`: NoticeTypeOptions = null,
    width: String = null
  ): PNotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (addclass != null) __obj.updateDynamic("addclass")(addclass.asInstanceOf[js.Any])
    if (animate_speed != null) __obj.updateDynamic("animate_speed")(animate_speed.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_display)) __obj.updateDynamic("auto_display")(auto_display.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (confirm != null) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    if (cornerclass != null) __obj.updateDynamic("cornerclass")(cornerclass.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(insert_brs)) __obj.updateDynamic("insert_brs")(insert_brs.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxonscreen != null) __obj.updateDynamic("maxonscreen")(maxonscreen.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (!js.isUndefined(mouse_reset)) __obj.updateDynamic("mouse_reset")(mouse_reset.asInstanceOf[js.Any])
    if (nonblock != null) __obj.updateDynamic("nonblock")(nonblock.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position_animate_speed != null) __obj.updateDynamic("position_animate_speed")(position_animate_speed.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (styling != null) __obj.updateDynamic("styling")(styling.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(text_escape)) __obj.updateDynamic("text_escape")(text_escape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(title_escape)) __obj.updateDynamic("title_escape")(title_escape.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyOptions]
  }
}

