package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingMod {
  
  @JSImport("@ionic/core/dist/types/components/loading/loading", "Loading")
  @js.native
  class Loading ()
    extends ComponentInterface
       with OverlayInterface {
    
    /**
      * If `true`, the loading indicator will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MLoading(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MLoading(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Number of milliseconds to wait before dismissing the loading indicator.
      */
    var duration: Double = js.native
    
    var durationTimeout: js.Any = js.native
    
    @JSName("el")
    var el_Loading: HTMLIonLoadingElement = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Optional text content to display in the loading indicator.
      */
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    var onBackdropTap: js.Any = js.native
    
    /**
      * Returns a promise that resolves when the loading did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * Returns a promise that resolves when the loading will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    @JSName("render")
    def render_MLoading(): js.Any = js.native
    
    /**
      * If `true`, a backdrop will be displayed behind the loading indicator.
      */
    var showBackdrop: Boolean = js.native
    
    /**
      * The name of the spinner to display.
      */
    var spinner: js.UndefOr[SpinnerTypes | Null] = js.native
    
    /**
      * If `true`, the loading indicator will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
  }
}
