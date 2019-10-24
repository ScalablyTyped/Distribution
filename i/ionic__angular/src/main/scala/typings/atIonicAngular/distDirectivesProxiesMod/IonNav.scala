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

@JSImport("@ionic/angular/dist/directives/proxies", "IonNav")
@js.native
class IonNav protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonNav {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionNavDidChange: EventEmitter[CustomEvent[_]] = js.native
  var ionNavWillChange: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

