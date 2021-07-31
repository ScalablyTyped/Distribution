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

@JSImport("@ionic/angular/directives/proxies", "IonMenuButton")
@js.native
class IonMenuButton protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonMenuButton {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * Automatically hides the menu button when the corresponding menu is not active
    */
  /* CompleteClass */
  var autoHide: Boolean = js.native
  
  /**
    * If `true`, the user cannot interact with the menu button.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  var z: NgZone = js.native
}
