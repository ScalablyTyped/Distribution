package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonCardHeader")
@js.native
class IonCardHeader protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonCardHeader {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If `true`, the card header will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  /* CompleteClass */
  var translucent: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
