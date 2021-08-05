package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@ionic/core/dist/types/components/popover/popover", "Popover")
  @js.native
  class Popover ()
    extends StObject
       with ComponentInterface
       with OverlayInterface {
    
    /**
      * If `true`, the popover will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    /**
      * The component to display inside of the popover.
      */
    var component: ComponentRef = js.native
    
    /**
      * The data to pass to the popover component.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPopover(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    @JSName("el")
    var el_Popover: HTMLIonPopoverElement = js.native
    
    /**
      * The event to pass to the popover animation.
      */
    var event: js.Any = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var onBackdropTap: js.Any = js.native
    
    /**
      * Returns a promise that resolves when the popover did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /* private */ var onDismiss: js.Any = js.native
    
    /* private */ var onLifecycle: js.Any = js.native
    
    /**
      * Returns a promise that resolves when the popover will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    @JSName("render")
    def render_MPopover(): js.Any = js.native
    
    /**
      * If `true`, a backdrop will be displayed behind the popover.
      */
    var showBackdrop: Boolean = js.native
    
    /**
      * If `true`, the popover will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    
    /* private */ var usersElement: js.Any = js.native
  }
}
