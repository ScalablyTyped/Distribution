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
- Dropped any */ @JSImport("@ionic/angular/dist/directives/proxies", "IonRange")
@js.native
class IonRange protected () extends js.Object {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

