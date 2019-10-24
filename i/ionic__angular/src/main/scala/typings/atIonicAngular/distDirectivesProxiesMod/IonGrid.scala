package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonGrid")
@js.native
class IonGrid protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonGrid {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  /* CompleteClass */
  override var fixed: Boolean = js.native
  var z: NgZone = js.native
}

