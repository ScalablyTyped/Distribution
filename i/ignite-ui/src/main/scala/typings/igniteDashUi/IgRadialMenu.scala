package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenu
  extends /**
	 * Option for igRadialMenu
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is false.
  	 */
  var centerButtonClosedFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen property is false.
  	 */
  var centerButtonClosedStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the height of the center button content.
  	 */
  var centerButtonContentHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the width of the center button content.
  	 */
  var centerButtonContentWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is true.
  	 */
  var centerButtonFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the background of the center button of the menu when under the pointer.
  	 */
  var centerButtonHotTrackFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when under the pointer.
  	 */
  var centerButtonHotTrackStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen is true.
  	 */
  var centerButtonStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of the inner rings of the menu.
  	 */
  var centerButtonStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Invoked when the IsOpen property is changed to false.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var closed: js.UndefOr[ClosedEvent] = js.undefined
  /**
  	 * Gets or sets the name of the item within the menu whose children are currently displayed.
  	 */
  var currentOpenMenuItemName: js.UndefOr[String] = js.undefined
  /**
  	 * The font for the control
  	 */
  var font: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the items of the menu are currently displayed. When closed, only the center button is rendered.
  	 */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the items in the menu.
  	 */
  var items: js.UndefOr[js.Array[IgRadialMenuItem]] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush for the backing of the radial menu.
  	 */
  var menuBackground: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the minimum number of wedges displayed by the menu.
  	 */
  var minWedgeCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Invoked when the IsOpen property is changed to true.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var opened: js.UndefOr[OpenedEvent] = js.undefined
  /**
  	 * Returns or sets the background of the outer ring of the menu.
  	 */
  var outerRingFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the outer ring.
  	 */
  var outerRingStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of the outer ring of the menu.
  	 */
  var outerRingStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the thickness of the outer ring of the menu.
  	 */
  var outerRingThickness: js.UndefOr[Double] = js.undefined
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Returns or sets the starting angle of the items expressed as the percentage of the width of a single wedge/slice.
  	 */
  var rotationAsPercentageOfWedge: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the starting angle of the items in degrees.
  	 */
  var rotationInDegrees: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the amount of padding around each wedge in degrees.
  	 */
  var wedgePaddingInDegrees: js.UndefOr[Double] = js.undefined
}

object IgRadialMenu {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igRadialMenu
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    centerButtonClosedFill: String = null,
    centerButtonClosedStroke: String = null,
    centerButtonContentHeight: Int | Double = null,
    centerButtonContentWidth: Int | Double = null,
    centerButtonFill: String = null,
    centerButtonHotTrackFill: String = null,
    centerButtonHotTrackStroke: String = null,
    centerButtonStroke: String = null,
    centerButtonStrokeThickness: Int | Double = null,
    closed: ClosedEvent = null,
    currentOpenMenuItemName: String = null,
    font: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[IgRadialMenuItem] = null,
    language: String = null,
    locale: js.Any = null,
    menuBackground: String = null,
    menuItemOpenCloseAnimationDuration: Int | Double = null,
    menuItemOpenCloseAnimationEasingFunction: js.Any = null,
    menuOpenCloseAnimationDuration: Int | Double = null,
    menuOpenCloseAnimationEasingFunction: js.Any = null,
    minWedgeCount: Int | Double = null,
    opened: OpenedEvent = null,
    outerRingFill: String = null,
    outerRingStroke: String = null,
    outerRingStrokeThickness: Int | Double = null,
    outerRingThickness: Int | Double = null,
    pixelScalingRatio: Int | Double = null,
    regional: String | js.Object = null,
    rotationAsPercentageOfWedge: Int | Double = null,
    rotationInDegrees: Int | Double = null,
    wedgePaddingInDegrees: Int | Double = null
  ): IgRadialMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (centerButtonClosedFill != null) __obj.updateDynamic("centerButtonClosedFill")(centerButtonClosedFill)
    if (centerButtonClosedStroke != null) __obj.updateDynamic("centerButtonClosedStroke")(centerButtonClosedStroke)
    if (centerButtonContentHeight != null) __obj.updateDynamic("centerButtonContentHeight")(centerButtonContentHeight.asInstanceOf[js.Any])
    if (centerButtonContentWidth != null) __obj.updateDynamic("centerButtonContentWidth")(centerButtonContentWidth.asInstanceOf[js.Any])
    if (centerButtonFill != null) __obj.updateDynamic("centerButtonFill")(centerButtonFill)
    if (centerButtonHotTrackFill != null) __obj.updateDynamic("centerButtonHotTrackFill")(centerButtonHotTrackFill)
    if (centerButtonHotTrackStroke != null) __obj.updateDynamic("centerButtonHotTrackStroke")(centerButtonHotTrackStroke)
    if (centerButtonStroke != null) __obj.updateDynamic("centerButtonStroke")(centerButtonStroke)
    if (centerButtonStrokeThickness != null) __obj.updateDynamic("centerButtonStrokeThickness")(centerButtonStrokeThickness.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (currentOpenMenuItemName != null) __obj.updateDynamic("currentOpenMenuItemName")(currentOpenMenuItemName)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (items != null) __obj.updateDynamic("items")(items)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (menuBackground != null) __obj.updateDynamic("menuBackground")(menuBackground)
    if (menuItemOpenCloseAnimationDuration != null) __obj.updateDynamic("menuItemOpenCloseAnimationDuration")(menuItemOpenCloseAnimationDuration.asInstanceOf[js.Any])
    if (menuItemOpenCloseAnimationEasingFunction != null) __obj.updateDynamic("menuItemOpenCloseAnimationEasingFunction")(menuItemOpenCloseAnimationEasingFunction)
    if (menuOpenCloseAnimationDuration != null) __obj.updateDynamic("menuOpenCloseAnimationDuration")(menuOpenCloseAnimationDuration.asInstanceOf[js.Any])
    if (menuOpenCloseAnimationEasingFunction != null) __obj.updateDynamic("menuOpenCloseAnimationEasingFunction")(menuOpenCloseAnimationEasingFunction)
    if (minWedgeCount != null) __obj.updateDynamic("minWedgeCount")(minWedgeCount.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (outerRingFill != null) __obj.updateDynamic("outerRingFill")(outerRingFill)
    if (outerRingStroke != null) __obj.updateDynamic("outerRingStroke")(outerRingStroke)
    if (outerRingStrokeThickness != null) __obj.updateDynamic("outerRingStrokeThickness")(outerRingStrokeThickness.asInstanceOf[js.Any])
    if (outerRingThickness != null) __obj.updateDynamic("outerRingThickness")(outerRingThickness.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rotationAsPercentageOfWedge != null) __obj.updateDynamic("rotationAsPercentageOfWedge")(rotationAsPercentageOfWedge.asInstanceOf[js.Any])
    if (rotationInDegrees != null) __obj.updateDynamic("rotationInDegrees")(rotationInDegrees.asInstanceOf[js.Any])
    if (wedgePaddingInDegrees != null) __obj.updateDynamic("wedgePaddingInDegrees")(wedgePaddingInDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialMenu]
  }
}

