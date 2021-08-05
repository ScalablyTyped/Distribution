package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSegmentButton")
@js.native
class IonSegmentButton protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSegmentButton {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  /**
    * The value of the segment button.
    */
  /* CompleteClass */
  var value: String = js.native
  
  /* protected */ var z: NgZone = js.native
}
