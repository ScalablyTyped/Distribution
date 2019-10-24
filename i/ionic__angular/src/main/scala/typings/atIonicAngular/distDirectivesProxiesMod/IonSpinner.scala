package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSpinner")
@js.native
class IonSpinner protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonSpinner {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the spinner's animation will be paused.
    */
  /* CompleteClass */
  override var paused: Boolean = js.native
  var z: NgZone = js.native
}

