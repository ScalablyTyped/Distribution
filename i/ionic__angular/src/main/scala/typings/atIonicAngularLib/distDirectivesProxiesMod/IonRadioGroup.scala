package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonRadioGroup")
@js.native
class IonRadioGroup protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonRadioGroup {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * If `true`, the radios can be deselected.
    */
  /* CompleteClass */
  override var allowEmptySelection: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

