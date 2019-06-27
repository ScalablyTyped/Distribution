package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonProgressBar")
@js.native
class IonProgressBar protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonProgressBar {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  override var buffer: scala.Double = js.native
  var el: stdLib.HTMLElement = js.native
  /**
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  override var reversed: scala.Boolean = js.native
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.determinate | atIonicCoreLib.atIonicCoreLibStrings.indeterminate = js.native
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  override var value: scala.Double = js.native
}

