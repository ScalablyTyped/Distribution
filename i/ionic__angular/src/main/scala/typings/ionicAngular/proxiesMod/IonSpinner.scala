package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSpinner")
@js.native
class IonSpinner protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSpinner {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  /**
    * If `true`, the spinner's animation will be paused.
    */
  /* CompleteClass */
  var paused: Boolean = js.native
  
  var z: NgZone = js.native
}
