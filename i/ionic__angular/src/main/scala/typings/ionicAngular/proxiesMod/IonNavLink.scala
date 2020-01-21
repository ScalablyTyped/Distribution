package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonNavLink")
@js.native
class IonNavLink protected ()
  extends typings.ionicCore.componentsMod.Components.IonNavLink {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * The transition direction when navigating to another page.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  var z: NgZone = js.native
}

