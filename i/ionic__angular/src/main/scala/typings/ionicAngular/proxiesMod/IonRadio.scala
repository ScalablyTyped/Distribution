package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonRadio")
@js.native
class IonRadio protected ()
  extends typings.ionicCore.componentsMod.Components.IonRadio {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the radio.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  var z: NgZone = js.native
}

