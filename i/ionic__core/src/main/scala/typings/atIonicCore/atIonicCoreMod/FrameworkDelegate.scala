package typings.atIonicCore.atIonicCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameworkDelegate extends js.Object {
  def attachViewToDom(container: js.Any, component: js.Any): js.Promise[HTMLElement] = js.native
  def attachViewToDom(container: js.Any, component: js.Any, propsOrDataObj: js.Any): js.Promise[HTMLElement] = js.native
  def attachViewToDom(container: js.Any, component: js.Any, propsOrDataObj: js.Any, cssClasses: js.Array[String]): js.Promise[HTMLElement] = js.native
  def removeViewFromDom(container: js.Any, component: js.Any): js.Promise[Unit] = js.native
}

