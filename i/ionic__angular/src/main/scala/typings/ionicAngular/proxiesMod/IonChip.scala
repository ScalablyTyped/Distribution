package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonChip")
@js.native
class IonChip protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonChip {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the chip.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  /**
    * Display an outline style button.
    */
  /* CompleteClass */
  var outline: Boolean = js.native
  
  var z: NgZone = js.native
}
