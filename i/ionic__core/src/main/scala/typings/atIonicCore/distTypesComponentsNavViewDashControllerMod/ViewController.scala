package typings.atIonicCore.distTypesComponentsNavViewDashControllerMod

import typings.atIonicCore.distTypesInterfaceMod.ComponentProps
import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav/view-controller", "ViewController")
@js.native
class ViewController protected () extends js.Object {
  def this(component: js.Any) = this()
  def this(component: js.Any, params: ComponentProps[Null]) = this()
  var component: js.Any = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var nav: js.UndefOr[js.Any] = js.native
  var params: js.UndefOr[ComponentProps[Null]] = js.native
  var state: Double = js.native
  /**
    * DOM WRITE
    */
  def _destroy(): Unit = js.native
  def init(container: HTMLElement): js.Promise[Unit] = js.native
}

