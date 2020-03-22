package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonToolbar")
@js.native
class IonToolbar protected ()
  extends typings.ionicCore.componentsMod.Components.IonToolbar {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

