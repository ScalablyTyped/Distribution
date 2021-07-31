package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonGrid")
@js.native
class IonGrid protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonGrid {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  /* CompleteClass */
  var fixed: Boolean = js.native
  
  var z: NgZone = js.native
}
