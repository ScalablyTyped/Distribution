package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonNavLink")
@js.native
class IonNavLink protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonNavLink {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * The transition direction when navigating to another page.
    */
  /* CompleteClass */
  var routerDirection: RouterDirection = js.native
  
  /* protected */ var z: NgZone = js.native
}
