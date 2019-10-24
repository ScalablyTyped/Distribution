package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSkeletonText")
@js.native
class IonSkeletonText protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonSkeletonText {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the skeleton text will animate.
    */
  /* CompleteClass */
  override var animated: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

