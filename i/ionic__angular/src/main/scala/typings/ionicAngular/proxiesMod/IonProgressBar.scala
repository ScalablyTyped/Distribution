package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.ionicCoreStrings.determinate
import typings.ionicCore.ionicCoreStrings.indeterminate
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonProgressBar")
@js.native
class IonProgressBar protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonProgressBar {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  var buffer: Double = js.native
  
  var el: HTMLElement = js.native
  
  /**
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  var reversed: Boolean = js.native
  
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  var `type`: determinate | indeterminate = js.native
  
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  var value: Double = js.native
  
  var z: NgZone = js.native
}
