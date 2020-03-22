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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonButton")
@js.native
class IonButton protected ()
  extends typings.ionicCore.componentsMod.Components.IonButton {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * The type of button.
    */
  /* CompleteClass */
  override var buttonType: String = js.native
  /**
    * If `true`, the user cannot interact with the button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  /* CompleteClass */
  override var strong: Boolean = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  var z: NgZone = js.native
}

