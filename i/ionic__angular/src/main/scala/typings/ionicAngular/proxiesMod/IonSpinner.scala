package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSpinner")
@js.native
class IonSpinner protected ()
  extends typings.ionicCore.componentsMod.Components.IonSpinner {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the spinner's animation will be paused.
    */
  /* CompleteClass */
  override var paused: Boolean = js.native
  var z: NgZone = js.native
}

