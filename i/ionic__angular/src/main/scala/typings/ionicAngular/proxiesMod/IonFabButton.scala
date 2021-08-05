package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonFabButton")
@js.native
class IonFabButton protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonFabButton {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the fab button will be show a close icon.
    */
  /* CompleteClass */
  var activated: Boolean = js.native
  
  /**
    * The icon name to use for the close icon. This will appear when the fab button is pressed. Only applies if it is the main button inside of a fab containing a fab list.
    */
  /* CompleteClass */
  var closeIcon: String = js.native
  
  /**
    * If `true`, the user cannot interact with the fab button.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  var routerDirection: RouterDirection = js.native
  
  /**
    * If `true`, the fab button will show when in a fab-list.
    */
  /* CompleteClass */
  var show: Boolean = js.native
  
  /**
    * If `true`, the fab button will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  /* CompleteClass */
  var translucent: Boolean = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  /* protected */ var z: NgZone = js.native
}
