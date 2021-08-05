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

@JSImport("@ionic/angular/directives/proxies", "IonSlides")
@js.native
class IonSlides protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSlides {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  var ionSlideDidChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideDoubleTap: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideDrag: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideNextEnd: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideNextStart: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlidePrevEnd: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlidePrevStart: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideReachEnd: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideReachStart: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideTap: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideTouchEnd: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideTouchStart: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideTransitionEnd: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideTransitionStart: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlideWillChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionSlidesDidLoad: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /* protected */ var z: NgZone = js.native
}
