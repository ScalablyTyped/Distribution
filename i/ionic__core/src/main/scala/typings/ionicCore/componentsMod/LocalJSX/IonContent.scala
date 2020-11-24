package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.contentInterfaceMod.ScrollBaseDetail
import typings.ionicCore.contentInterfaceMod.ScrollDetail
import typings.ionicCore.mod.Color
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonContent extends js.Object {
  
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
  implicit class IonContentOps[Self <: IonContent] (val x: Self) extends AnyVal {
    
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
    def setForceOverscroll(value: Boolean): Self = this.set("forceOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceOverscroll: Self = this.set("forceOverscroll", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setOnIonScroll(value: /* event */ CustomEvent[ScrollDetail] => Unit): Self = this.set("onIonScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonScroll: Self = this.set("onIonScroll", js.undefined)
    
    @scala.inline
    def setOnIonScrollEnd(value: /* event */ CustomEvent[ScrollBaseDetail] => Unit): Self = this.set("onIonScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonScrollEnd: Self = this.set("onIonScrollEnd", js.undefined)
    
    @scala.inline
    def setOnIonScrollStart(value: /* event */ CustomEvent[ScrollBaseDetail] => Unit): Self = this.set("onIonScrollStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonScrollStart: Self = this.set("onIonScrollStart", js.undefined)
    
    @scala.inline
    def setScrollEvents(value: Boolean): Self = this.set("scrollEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEvents: Self = this.set("scrollEvents", js.undefined)
    
    @scala.inline
    def setScrollX(value: Boolean): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: Boolean): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
  }
}
