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

@JSImport("@ionic/angular/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  var ionError: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionImgDidLoad: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionImgWillLoad: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /* protected */ var z: NgZone = js.native
}
