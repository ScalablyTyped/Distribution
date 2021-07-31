package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonMenu")
@js.native
class IonMenu protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonMenu {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionDidClose: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionDidOpen: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionWillClose: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionWillOpen: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var z: NgZone = js.native
}
