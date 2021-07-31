package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonButtons")
@js.native
class IonButtons protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonButtons {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If true, buttons will disappear when its parent toolbar has fully collapsed if the toolbar is not the first toolbar. If the toolbar is the first toolbar, the buttons will be hidden and will only be shown once all toolbars have fully collapsed.  Only applies in `ios` mode with `collapse` set to `true` on `ion-header`.  Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
    */
  /* CompleteClass */
  var collapse: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  var z: NgZone = js.native
}
