package typings
package atIonicCoreLib.distTypesComponentsNavViewDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav/view-controller", "ViewController")
@js.native
class ViewController protected () extends js.Object {
  def this(component: js.Any) = this()
  def this(component: js.Any, params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any) = this()
  var component: js.Any = js.native
  var delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.native
  var element: js.UndefOr[stdLib.HTMLElement] = js.native
  var nav: js.UndefOr[js.Any] = js.native
  var params: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ _
  ] = js.native
  var state: scala.Double = js.native
  /**
    * DOM WRITE
    */
  def _destroy(): scala.Unit = js.native
  def init(container: stdLib.HTMLElement): js.Promise[scala.Unit] = js.native
}

