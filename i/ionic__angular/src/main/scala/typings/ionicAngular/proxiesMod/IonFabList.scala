package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonFabList")
@js.native
class IonFabList protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonFabList {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  /* CompleteClass */
  var activated: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  /* CompleteClass */
  var side: start | end | top | bottom = js.native
  
  /* protected */ var z: NgZone = js.native
}
