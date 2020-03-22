package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonSplitPane")
@js.native
class IonSplitPane protected ()
  extends typings.ionicCore.componentsMod.Components.IonSplitPane {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the split pane will be hidden.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionSplitPaneVisible: EventEmitter[CustomEvent[_]] = js.native
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  /* CompleteClass */
  override var when: String | Boolean = js.native
  var z: NgZone = js.native
}

