package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegmentButton")
@js.native
class IonSegmentButton protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonSegmentButton {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, the segment button is selected.
    */
  /* CompleteClass */
  override var checked: scala.Boolean = js.native
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionSelect: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button = js.native
  /**
    * The value of the segment button.
    */
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

