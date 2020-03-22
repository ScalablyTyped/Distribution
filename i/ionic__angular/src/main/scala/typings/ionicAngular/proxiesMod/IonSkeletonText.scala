package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonSkeletonText")
@js.native
class IonSkeletonText protected ()
  extends typings.ionicCore.componentsMod.Components.IonSkeletonText {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the skeleton text will animate.
    */
  /* CompleteClass */
  override var animated: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

