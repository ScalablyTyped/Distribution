package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonItem")
@js.native
class IonItem protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonItem {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, a button tag will be rendered and the item will be tappable.
    */
  /* CompleteClass */
  var button: Boolean = js.native
  
  /**
    * The icon to use when `detail` is set to `true`.
    */
  /* CompleteClass */
  var detailIcon: String = js.native
  
  /**
    * If `true`, the user cannot interact with the item.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  var routerDirection: RouterDirection = js.native
  
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  var z: NgZone = js.native
}
