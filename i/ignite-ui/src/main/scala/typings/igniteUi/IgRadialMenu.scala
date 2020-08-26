package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialMenu
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Returns or sets the background of the center button of the menu when the IsOpen property is false.
    */
  var centerButtonClosedFill: js.UndefOr[String] = js.native
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen property is false.
    */
  var centerButtonClosedStroke: js.UndefOr[String] = js.native
  /**
    * Returns or sets the height of the center button content.
    */
  var centerButtonContentHeight: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the width of the center button content.
    */
  var centerButtonContentWidth: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the background of the center button of the menu when the IsOpen property is true.
    */
  var centerButtonFill: js.UndefOr[String] = js.native
  /**
    * Returns or sets the background of the center button of the menu when under the pointer.
    */
  var centerButtonHotTrackFill: js.UndefOr[String] = js.native
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when under the pointer.
    */
  var centerButtonHotTrackStroke: js.UndefOr[String] = js.native
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen is true.
    */
  var centerButtonStroke: js.UndefOr[String] = js.native
  /**
    * Returns or sets the width of the outline of the inner rings of the menu.
    */
  var centerButtonStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Invoked when the IsOpen property is changed to false.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    */
  var closed: js.UndefOr[ClosedEvent] = js.native
  /**
    * Gets or sets the name of the item within the menu whose children are currently displayed.
    */
  var currentOpenMenuItemName: js.UndefOr[String] = js.native
  /**
    * The font for the control
    */
  var font: js.UndefOr[String] = js.native
  /**
    * Returns or sets a boolean indicating whether the items of the menu are currently displayed. When closed, only the center button is rendered.
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the items in the menu.
    */
  var items: js.UndefOr[js.Array[IgRadialMenuItem]] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Returns or sets the brush for the backing of the radial menu.
    */
  var menuBackground: js.UndefOr[String] = js.native
  /**
    * Returns or sets the duration of the animation performed when the IsOpen property is changed.
    */
  var menuItemOpenCloseAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
    */
  var menuItemOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.native
  /**
    * Returns or sets the duration of the animation performed when the IsOpen property is changed.
    */
  var menuOpenCloseAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
    */
  var menuOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.native
  /**
    * Returns or sets the minimum number of wedges displayed by the menu.
    */
  var minWedgeCount: js.UndefOr[Double] = js.native
  /**
    * Invoked when the IsOpen property is changed to true.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    */
  var opened: js.UndefOr[OpenedEvent] = js.native
  /**
    * Returns or sets the background of the outer ring of the menu.
    */
  var outerRingFill: js.UndefOr[String] = js.native
  /**
    * Returns or sets the brush used for the outline of the outer ring.
    */
  var outerRingStroke: js.UndefOr[String] = js.native
  /**
    * Returns or sets the width of the outline of the outer ring of the menu.
    */
  var outerRingStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the thickness of the outer ring of the menu.
    */
  var outerRingThickness: js.UndefOr[Double] = js.native
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Returns or sets the starting angle of the items expressed as the percentage of the width of a single wedge/slice.
    */
  var rotationAsPercentageOfWedge: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the starting angle of the items in degrees.
    */
  var rotationInDegrees: js.UndefOr[Double] = js.native
  /**
    * Returns or sets the amount of padding around each wedge in degrees.
    */
  var wedgePaddingInDegrees: js.UndefOr[Double] = js.native
}

object IgRadialMenu {
  @scala.inline
  def apply(): IgRadialMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialMenu]
  }
  @scala.inline
  implicit class IgRadialMenuOps[Self <: IgRadialMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenterButtonClosedFill(value: String): Self = this.set("centerButtonClosedFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonClosedFill: Self = this.set("centerButtonClosedFill", js.undefined)
    @scala.inline
    def setCenterButtonClosedStroke(value: String): Self = this.set("centerButtonClosedStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonClosedStroke: Self = this.set("centerButtonClosedStroke", js.undefined)
    @scala.inline
    def setCenterButtonContentHeight(value: Double): Self = this.set("centerButtonContentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonContentHeight: Self = this.set("centerButtonContentHeight", js.undefined)
    @scala.inline
    def setCenterButtonContentWidth(value: Double): Self = this.set("centerButtonContentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonContentWidth: Self = this.set("centerButtonContentWidth", js.undefined)
    @scala.inline
    def setCenterButtonFill(value: String): Self = this.set("centerButtonFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonFill: Self = this.set("centerButtonFill", js.undefined)
    @scala.inline
    def setCenterButtonHotTrackFill(value: String): Self = this.set("centerButtonHotTrackFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonHotTrackFill: Self = this.set("centerButtonHotTrackFill", js.undefined)
    @scala.inline
    def setCenterButtonHotTrackStroke(value: String): Self = this.set("centerButtonHotTrackStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonHotTrackStroke: Self = this.set("centerButtonHotTrackStroke", js.undefined)
    @scala.inline
    def setCenterButtonStroke(value: String): Self = this.set("centerButtonStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonStroke: Self = this.set("centerButtonStroke", js.undefined)
    @scala.inline
    def setCenterButtonStrokeThickness(value: Double): Self = this.set("centerButtonStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonStrokeThickness: Self = this.set("centerButtonStrokeThickness", js.undefined)
    @scala.inline
    def setClosed(value: (/* event */ Event, /* ui */ ClosedEventUIParam) => Unit): Self = this.set("closed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setCurrentOpenMenuItemName(value: String): Self = this.set("currentOpenMenuItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentOpenMenuItemName: Self = this.set("currentOpenMenuItemName", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setItemsVarargs(value: IgRadialMenuItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IgRadialMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMenuBackground(value: String): Self = this.set("menuBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuBackground: Self = this.set("menuBackground", js.undefined)
    @scala.inline
    def setMenuItemOpenCloseAnimationDuration(value: Double): Self = this.set("menuItemOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemOpenCloseAnimationDuration: Self = this.set("menuItemOpenCloseAnimationDuration", js.undefined)
    @scala.inline
    def setMenuItemOpenCloseAnimationEasingFunction(value: js.Any): Self = this.set("menuItemOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemOpenCloseAnimationEasingFunction: Self = this.set("menuItemOpenCloseAnimationEasingFunction", js.undefined)
    @scala.inline
    def setMenuOpenCloseAnimationDuration(value: Double): Self = this.set("menuOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuOpenCloseAnimationDuration: Self = this.set("menuOpenCloseAnimationDuration", js.undefined)
    @scala.inline
    def setMenuOpenCloseAnimationEasingFunction(value: js.Any): Self = this.set("menuOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuOpenCloseAnimationEasingFunction: Self = this.set("menuOpenCloseAnimationEasingFunction", js.undefined)
    @scala.inline
    def setMinWedgeCount(value: Double): Self = this.set("minWedgeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWedgeCount: Self = this.set("minWedgeCount", js.undefined)
    @scala.inline
    def setOpened(value: (/* event */ Event, /* ui */ OpenedEventUIParam) => Unit): Self = this.set("opened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setOuterRingFill(value: String): Self = this.set("outerRingFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRingFill: Self = this.set("outerRingFill", js.undefined)
    @scala.inline
    def setOuterRingStroke(value: String): Self = this.set("outerRingStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRingStroke: Self = this.set("outerRingStroke", js.undefined)
    @scala.inline
    def setOuterRingStrokeThickness(value: Double): Self = this.set("outerRingStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRingStrokeThickness: Self = this.set("outerRingStrokeThickness", js.undefined)
    @scala.inline
    def setOuterRingThickness(value: Double): Self = this.set("outerRingThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRingThickness: Self = this.set("outerRingThickness", js.undefined)
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRotationAsPercentageOfWedge(value: Double): Self = this.set("rotationAsPercentageOfWedge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAsPercentageOfWedge: Self = this.set("rotationAsPercentageOfWedge", js.undefined)
    @scala.inline
    def setRotationInDegrees(value: Double): Self = this.set("rotationInDegrees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationInDegrees: Self = this.set("rotationInDegrees", js.undefined)
    @scala.inline
    def setWedgePaddingInDegrees(value: Double): Self = this.set("wedgePaddingInDegrees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWedgePaddingInDegrees: Self = this.set("wedgePaddingInDegrees", js.undefined)
  }
  
}

