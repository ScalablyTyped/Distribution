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

@JSImport("@ionic/angular/directives/proxies", "IonSelect")
@js.native
class IonSelect protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSelect {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionCancel: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var z: NgZone = js.native
}
