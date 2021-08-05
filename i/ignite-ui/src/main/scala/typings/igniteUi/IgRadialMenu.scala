package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialMenu
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  
  inline def apply(): IgRadialMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialMenu]
  }
  
  extension [Self <: IgRadialMenu](x: Self) {
    
    inline def setCenterButtonClosedFill(value: String): Self = StObject.set(x, "centerButtonClosedFill", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonClosedFillUndefined: Self = StObject.set(x, "centerButtonClosedFill", js.undefined)
    
    inline def setCenterButtonClosedStroke(value: String): Self = StObject.set(x, "centerButtonClosedStroke", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonClosedStrokeUndefined: Self = StObject.set(x, "centerButtonClosedStroke", js.undefined)
    
    inline def setCenterButtonContentHeight(value: Double): Self = StObject.set(x, "centerButtonContentHeight", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonContentHeightUndefined: Self = StObject.set(x, "centerButtonContentHeight", js.undefined)
    
    inline def setCenterButtonContentWidth(value: Double): Self = StObject.set(x, "centerButtonContentWidth", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonContentWidthUndefined: Self = StObject.set(x, "centerButtonContentWidth", js.undefined)
    
    inline def setCenterButtonFill(value: String): Self = StObject.set(x, "centerButtonFill", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonFillUndefined: Self = StObject.set(x, "centerButtonFill", js.undefined)
    
    inline def setCenterButtonHotTrackFill(value: String): Self = StObject.set(x, "centerButtonHotTrackFill", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonHotTrackFillUndefined: Self = StObject.set(x, "centerButtonHotTrackFill", js.undefined)
    
    inline def setCenterButtonHotTrackStroke(value: String): Self = StObject.set(x, "centerButtonHotTrackStroke", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonHotTrackStrokeUndefined: Self = StObject.set(x, "centerButtonHotTrackStroke", js.undefined)
    
    inline def setCenterButtonStroke(value: String): Self = StObject.set(x, "centerButtonStroke", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonStrokeThickness(value: Double): Self = StObject.set(x, "centerButtonStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setCenterButtonStrokeThicknessUndefined: Self = StObject.set(x, "centerButtonStrokeThickness", js.undefined)
    
    inline def setCenterButtonStrokeUndefined: Self = StObject.set(x, "centerButtonStroke", js.undefined)
    
    inline def setClosed(value: (/* event */ Event, /* ui */ ClosedEventUIParam) => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction2(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setCurrentOpenMenuItemName(value: String): Self = StObject.set(x, "currentOpenMenuItemName", value.asInstanceOf[js.Any])
    
    inline def setCurrentOpenMenuItemNameUndefined: Self = StObject.set(x, "currentOpenMenuItemName", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setItems(value: js.Array[IgRadialMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: IgRadialMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMenuBackground(value: String): Self = StObject.set(x, "menuBackground", value.asInstanceOf[js.Any])
    
    inline def setMenuBackgroundUndefined: Self = StObject.set(x, "menuBackground", js.undefined)
    
    inline def setMenuItemOpenCloseAnimationDuration(value: Double): Self = StObject.set(x, "menuItemOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setMenuItemOpenCloseAnimationDurationUndefined: Self = StObject.set(x, "menuItemOpenCloseAnimationDuration", js.undefined)
    
    inline def setMenuItemOpenCloseAnimationEasingFunction(value: js.Any): Self = StObject.set(x, "menuItemOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    
    inline def setMenuItemOpenCloseAnimationEasingFunctionUndefined: Self = StObject.set(x, "menuItemOpenCloseAnimationEasingFunction", js.undefined)
    
    inline def setMenuOpenCloseAnimationDuration(value: Double): Self = StObject.set(x, "menuOpenCloseAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setMenuOpenCloseAnimationDurationUndefined: Self = StObject.set(x, "menuOpenCloseAnimationDuration", js.undefined)
    
    inline def setMenuOpenCloseAnimationEasingFunction(value: js.Any): Self = StObject.set(x, "menuOpenCloseAnimationEasingFunction", value.asInstanceOf[js.Any])
    
    inline def setMenuOpenCloseAnimationEasingFunctionUndefined: Self = StObject.set(x, "menuOpenCloseAnimationEasingFunction", js.undefined)
    
    inline def setMinWedgeCount(value: Double): Self = StObject.set(x, "minWedgeCount", value.asInstanceOf[js.Any])
    
    inline def setMinWedgeCountUndefined: Self = StObject.set(x, "minWedgeCount", js.undefined)
    
    inline def setOpened(value: (/* event */ Event, /* ui */ OpenedEventUIParam) => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction2(value))
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setOuterRingFill(value: String): Self = StObject.set(x, "outerRingFill", value.asInstanceOf[js.Any])
    
    inline def setOuterRingFillUndefined: Self = StObject.set(x, "outerRingFill", js.undefined)
    
    inline def setOuterRingStroke(value: String): Self = StObject.set(x, "outerRingStroke", value.asInstanceOf[js.Any])
    
    inline def setOuterRingStrokeThickness(value: Double): Self = StObject.set(x, "outerRingStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setOuterRingStrokeThicknessUndefined: Self = StObject.set(x, "outerRingStrokeThickness", js.undefined)
    
    inline def setOuterRingStrokeUndefined: Self = StObject.set(x, "outerRingStroke", js.undefined)
    
    inline def setOuterRingThickness(value: Double): Self = StObject.set(x, "outerRingThickness", value.asInstanceOf[js.Any])
    
    inline def setOuterRingThicknessUndefined: Self = StObject.set(x, "outerRingThickness", js.undefined)
    
    inline def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRotationAsPercentageOfWedge(value: Double): Self = StObject.set(x, "rotationAsPercentageOfWedge", value.asInstanceOf[js.Any])
    
    inline def setRotationAsPercentageOfWedgeUndefined: Self = StObject.set(x, "rotationAsPercentageOfWedge", js.undefined)
    
    inline def setRotationInDegrees(value: Double): Self = StObject.set(x, "rotationInDegrees", value.asInstanceOf[js.Any])
    
    inline def setRotationInDegreesUndefined: Self = StObject.set(x, "rotationInDegrees", js.undefined)
    
    inline def setWedgePaddingInDegrees(value: Double): Self = StObject.set(x, "wedgePaddingInDegrees", value.asInstanceOf[js.Any])
    
    inline def setWedgePaddingInDegreesUndefined: Self = StObject.set(x, "wedgePaddingInDegrees", js.undefined)
  }
}
