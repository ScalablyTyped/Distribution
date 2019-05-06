package typings
package atIonicCoreLib.atIonicCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameworkDelegate extends js.Object {
  def attachViewToDom(container: js.Any, component: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  def attachViewToDom(container: js.Any, component: js.Any, propsOrDataObj: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  def attachViewToDom(
    container: js.Any,
    component: js.Any,
    propsOrDataObj: js.Any,
    cssClasses: js.Array[java.lang.String]
  ): js.Promise[stdLib.HTMLElement] = js.native
  def removeViewFromDom(container: js.Any, component: js.Any): js.Promise[scala.Unit] = js.native
}

