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

@JSImport("@ionic/angular/directives/proxies", "IonItemOption")
@js.native
class IonItemOption protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonItemOption {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the item option.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If `true`, the option will expand to take up the available width and cover any other options.
    */
  /* CompleteClass */
  var expandable: Boolean = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  /* protected */ var z: NgZone = js.native
}
