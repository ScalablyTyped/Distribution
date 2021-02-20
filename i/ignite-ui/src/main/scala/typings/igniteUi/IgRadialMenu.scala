package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgRadialMenuMutableBuilder[Self <: IgRadialMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterButtonClosedFill(value: String): Self = StObject.set(x, "centerButtonClosedFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonClosedFillUndefined: Self = StObject.set(x, "centerButtonClosedFill", js.undefined)
    
    @scala.inline
    def setCenterButtonClosedStroke(value: String): Self = StObject.set(x, "centerButtonClosedStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonClosedStrokeUndefined: Self = StObject.set(x, "centerButtonClosedStroke", js.undefined)
    
    @scala.inline
    def setCenterButtonContentHeight(value: Double): Self = StObject.set(x, "centerButtonContentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonContentHeightUndefined: Self = StObject.set(x, "centerButtonContentHeight", js.undefined)
    
    @scala.inline
    def setCenterButtonContentWidth(value: Double): Self = StObject.set(x, "centerButtonContentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonContentWidthUndefined: Self = StObject.set(x, "centerButtonContentWidth", js.undefined)
    
    @scala.inline
    def setCenterButtonFill(value: String): Self = StObject.set(x, "centerButtonFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonFillUndefined: Self = StObject.set(x, "centerButtonFill", js.undefined)
    
    @scala.inline
    def setCenterButtonHotTrackFill(value: String): Self = StObject.set(x, "centerButtonHotTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonHotTrackFillUndefined: Self = StObject.set(x, "centerButtonHotTrackFill", js.undefined)
    
    @scala.inline
    def setCenterButtonHotTrackStroke(value: String): Self = StObject.set(x, "centerButtonHotTrackStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonHotTrackStrokeUndefined: Self = StObject.set(x, "centerButtonHotTrackStroke", js.undefined)
    
    @scala.inline
    def setCenterButtonStroke(value: String): Self = StObject.set(x, "centerButtonStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonStrokeThickness(value: Double): Self = StObject.set(x, "centerButtonStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonStrokeThicknessUndefined: Self = StObject.set(x, "centerButtonStrokeThickness", js.undefined)
    
    @scala.inline
    def setCenterButtonStrokeUndefined: Self = StObject.set(x, "centerButtonStroke", js.undefined)
    
    @scala.inline
    def setClosed(value: (/* event */ Event, /* ui */ ClosedEventUIParam) => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setCurrentOpenMenuItemName(value: String): Self = StObject.set(x, "currentOpenMenuItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOpenMenuItemNameUndefined: Self = StObject.set(x, "currentOpenMenuItemName", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[IgRadialMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IgRadialMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMenuBackground(value: String): Self = StObject.set(x, "menuBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuBackgroundUndefined: Self = StObject.set(x, "menuBackground", js.undefined)
    
    @scala.inline
    def setMenuItemOpenCloseAnimationDuration(value: Double): Self = StObject.set(x, "menuItemOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemOpenCloseAnimationDurationUndefined: Self = StObject.set(x, "menuItemOpenCloseAnimationDuration", js.undefined)
    
    @scala.inline
    def setMenuItemOpenCloseAnimationEasingFunction(value: js.Any): Self = StObject.set(x, "menuItemOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemOpenCloseAnimationEasingFunctionUndefined: Self = StObject.set(x, "menuItemOpenCloseAnimationEasingFunction", js.undefined)
    
    @scala.inline
    def setMenuOpenCloseAnimationDuration(value: Double): Self = StObject.set(x, "menuOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuOpenCloseAnimationDurationUndefined: Self = StObject.set(x, "menuOpenCloseAnimationDuration", js.undefined)
    
    @scala.inline
    def setMenuOpenCloseAnimationEasingFunction(value: js.Any): Self = StObject.set(x, "menuOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuOpenCloseAnimationEasingFunctionUndefined: Self = StObject.set(x, "menuOpenCloseAnimationEasingFunction", js.undefined)
    
    @scala.inline
    def setMinWedgeCount(value: Double): Self = StObject.set(x, "minWedgeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWedgeCountUndefined: Self = StObject.set(x, "minWedgeCount", js.undefined)
    
    @scala.inline
    def setOpened(value: (/* event */ Event, /* ui */ OpenedEventUIParam) => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setOuterRingFill(value: String): Self = StObject.set(x, "outerRingFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingFillUndefined: Self = StObject.set(x, "outerRingFill", js.undefined)
    
    @scala.inline
    def setOuterRingStroke(value: String): Self = StObject.set(x, "outerRingStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingStrokeThickness(value: Double): Self = StObject.set(x, "outerRingStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingStrokeThicknessUndefined: Self = StObject.set(x, "outerRingStrokeThickness", js.undefined)
    
    @scala.inline
    def setOuterRingStrokeUndefined: Self = StObject.set(x, "outerRingStroke", js.undefined)
    
    @scala.inline
    def setOuterRingThickness(value: Double): Self = StObject.set(x, "outerRingThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingThicknessUndefined: Self = StObject.set(x, "outerRingThickness", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRotationAsPercentageOfWedge(value: Double): Self = StObject.set(x, "rotationAsPercentageOfWedge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAsPercentageOfWedgeUndefined: Self = StObject.set(x, "rotationAsPercentageOfWedge", js.undefined)
    
    @scala.inline
    def setRotationInDegrees(value: Double): Self = StObject.set(x, "rotationInDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationInDegreesUndefined: Self = StObject.set(x, "rotationInDegrees", js.undefined)
    
    @scala.inline
    def setWedgePaddingInDegrees(value: Double): Self = StObject.set(x, "wedgePaddingInDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWedgePaddingInDegreesUndefined: Self = StObject.set(x, "wedgePaddingInDegrees", js.undefined)
  }
}
