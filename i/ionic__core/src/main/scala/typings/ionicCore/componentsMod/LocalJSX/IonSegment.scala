package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentChangeEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSegment extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the segment.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted when the value property has changed and any dragging pointer has been released from `ion-segment`.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SegmentChangeEventDetail], Unit]] = js.undefined
  
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them. In addition, this will disable the gesture to drag the indicator between the buttons in order to swipe to see hidden buttons.
    */
  var scrollable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, users will be able to swipe between segment buttons to activate them.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the value of the segment.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object IonSegment {
  
  @scala.inline
  def apply(): IonSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSegment]
  }
  
  @scala.inline
  implicit class IonSegmentMutableBuilder[Self <: IonSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[SegmentChangeEventDetail] => Unit): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeGestureUndefined: Self = StObject.set(x, "swipeGesture", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
