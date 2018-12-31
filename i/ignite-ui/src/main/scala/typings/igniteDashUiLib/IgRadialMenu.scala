package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenu
  extends /**
	 * Option for igRadialMenu
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is false.
  	 */
  var centerButtonClosedFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen property is false.
  	 */
  var centerButtonClosedStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the height of the center button content.
  	 */
  var centerButtonContentHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the width of the center button content.
  	 */
  var centerButtonContentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is true.
  	 */
  var centerButtonFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the background of the center button of the menu when under the pointer.
  	 */
  var centerButtonHotTrackFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when under the pointer.
  	 */
  var centerButtonHotTrackStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen is true.
  	 */
  var centerButtonStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of the inner rings of the menu.
  	 */
  var centerButtonStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Invoked when the IsOpen property is changed to false.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var closed: js.UndefOr[ClosedEvent] = js.undefined
  /**
  	 * Gets or sets the name of the item within the menu whose children are currently displayed.
  	 */
  var currentOpenMenuItemName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The font for the control
  	 */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the items of the menu are currently displayed. When closed, only the center button is rendered.
  	 */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the items in the menu.
  	 */
  var items: js.UndefOr[js.Array[IgRadialMenuItem]] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush for the backing of the radial menu.
  	 */
  var menuBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the minimum number of wedges displayed by the menu.
  	 */
  var minWedgeCount: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Invoked when the IsOpen property is changed to true.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var opened: js.UndefOr[OpenedEvent] = js.undefined
  /**
  	 * Returns or sets the background of the outer ring of the menu.
  	 */
  var outerRingFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush used for the outline of the outer ring.
  	 */
  var outerRingStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of the outer ring of the menu.
  	 */
  var outerRingStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the thickness of the outer ring of the menu.
  	 */
  var outerRingThickness: js.UndefOr[scala.Double] = js.undefined
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Returns or sets the starting angle of the items expressed as the percentage of the width of a single wedge/slice.
  	 */
  var rotationAsPercentageOfWedge: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the starting angle of the items in degrees.
  	 */
  var rotationInDegrees: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the amount of padding around each wedge in degrees.
  	 */
  var wedgePaddingInDegrees: js.UndefOr[scala.Double] = js.undefined
}

