package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@ionic/angular/dist/directives/proxies", "IonMenu")
@js.native
class IonMenu protected () extends js.Object {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionDidClose: EventEmitter[CustomEvent[_]] = js.native
  var ionDidOpen: EventEmitter[CustomEvent[_]] = js.native
  var ionWillClose: EventEmitter[CustomEvent[_]] = js.native
  var ionWillOpen: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

