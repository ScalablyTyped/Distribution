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

@JSImport("@ionic/angular/directives/proxies", "IonInput")
@js.native
class IonInput protected ()
  extends typings.ionicCore.componentsMod.Components.IonInput {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  var ionInput: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

