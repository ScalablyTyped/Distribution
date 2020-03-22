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

@JSImport("@ionic/angular/directives/proxies", "IonRadioGroup")
@js.native
class IonRadioGroup protected ()
  extends typings.ionicCore.componentsMod.Components.IonRadioGroup {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the radios can be deselected.
    */
  /* CompleteClass */
  override var allowEmptySelection: Boolean = js.native
  var el: HTMLElement = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  var z: NgZone = js.native
}

