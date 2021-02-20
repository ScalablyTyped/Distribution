package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.contentInterfaceMod.ScrollBaseDetail
import typings.ionicCore.contentInterfaceMod.ScrollDetail
import typings.ionicCore.mod.Color
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonContent extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Emitted while scrolling. This event is disabled by default. Look at the property: `scrollEvents`
    */
  var onIonScroll: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollDetail], Unit]] = js.native
  
  /**
    * Emitted when the scroll has ended.
    */
  var onIonScrollEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.native
  
  /**
    * Emitted when the scroll has started.
    */
  var onIonScrollStart: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.native
  
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: js.UndefOr[Boolean] = js.native
}
object IonContent {
  
  @scala.inline
  def apply(): IonContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonContent]
  }
  
  @scala.inline
  implicit class IonContentMutableBuilder[Self <: IonContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setForceOverscroll(value: Boolean): Self = StObject.set(x, "forceOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceOverscrollUndefined: Self = StObject.set(x, "forceOverscroll", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setOnIonScroll(value: /* event */ CustomEvent[ScrollDetail] => Unit): Self = StObject.set(x, "onIonScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonScrollEnd(value: /* event */ CustomEvent[ScrollBaseDetail] => Unit): Self = StObject.set(x, "onIonScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonScrollEndUndefined: Self = StObject.set(x, "onIonScrollEnd", js.undefined)
    
    @scala.inline
    def setOnIonScrollStart(value: /* event */ CustomEvent[ScrollBaseDetail] => Unit): Self = StObject.set(x, "onIonScrollStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonScrollStartUndefined: Self = StObject.set(x, "onIonScrollStart", js.undefined)
    
    @scala.inline
    def setOnIonScrollUndefined: Self = StObject.set(x, "onIonScroll", js.undefined)
    
    @scala.inline
    def setScrollEvents(value: Boolean): Self = StObject.set(x, "scrollEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEventsUndefined: Self = StObject.set(x, "scrollEvents", js.undefined)
    
    @scala.inline
    def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
  }
}
