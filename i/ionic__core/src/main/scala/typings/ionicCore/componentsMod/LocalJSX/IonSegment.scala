package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentChangeEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSegment extends js.Object {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * If `true`, the user cannot interact with the segment.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Emitted when the value property has changed and any dragging pointer has been released from `ion-segment`.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SegmentChangeEventDetail], Unit]] = js.native
  
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them. In addition, this will disable the gesture to drag the indicator between the buttons in order to swipe to see hidden buttons.
    */
  var scrollable: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, users will be able to swipe between segment buttons to activate them.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
  
  /**
    * the value of the segment.
    */
  var value: js.UndefOr[String | Null] = js.native
}
object IonSegment {
  
  @scala.inline
  def apply(): IonSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSegment]
  }
  
  @scala.inline
  implicit class IonSegmentOps[Self <: IonSegment] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[SegmentChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = this.set("swipeGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeGesture: Self = this.set("swipeGesture", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
