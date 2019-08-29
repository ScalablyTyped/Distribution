package typings.atJupyterlabUiDashComponents

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(container: HTMLElement = null): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    __obj.asInstanceOf[Anon_Container]
  }
}

