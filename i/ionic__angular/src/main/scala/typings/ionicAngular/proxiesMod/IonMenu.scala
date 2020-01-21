package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonMenu")
@js.native
class IonMenu protected ()
  extends typings.ionicCore.componentsMod.Components.IonMenu {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionDidClose: EventEmitter[CustomEvent[_]] = js.native
  var ionDidOpen: EventEmitter[CustomEvent[_]] = js.native
  var ionWillClose: EventEmitter[CustomEvent[_]] = js.native
  var ionWillOpen: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

