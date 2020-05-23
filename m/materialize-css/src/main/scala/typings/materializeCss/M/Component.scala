package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[TOptions] extends ComponentBase[TOptions] {
  /**
    * Destroy plugin instance and teardown
    */
  def destroy(): Unit
}

object Component {
  @scala.inline
  def apply[TOptions](destroy: () => Unit, el: Element, options: TOptions): Component[TOptions] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[TOptions]]
  }
}

