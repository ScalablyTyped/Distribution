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

@JSImport("@ionic/angular/directives/proxies", "IonSegment")
@js.native
class IonSegment protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSegment {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the segment.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them. In addition, this will disable the gesture to drag the indicator between the buttons in order to swipe to see hidden buttons.
    */
  /* CompleteClass */
  var scrollable: Boolean = js.native
  
  /**
    * If `true`, users will be able to swipe between segment buttons to activate them.
    */
  /* CompleteClass */
  var swipeGesture: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
