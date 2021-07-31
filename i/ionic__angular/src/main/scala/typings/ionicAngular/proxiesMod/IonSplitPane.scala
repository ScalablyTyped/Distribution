package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSplitPane")
@js.native
class IonSplitPane protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSplitPane {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the split pane will be hidden.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  var ionSplitPaneVisible: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  /* CompleteClass */
  var when: String | Boolean = js.native
  
  var z: NgZone = js.native
}
