package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pushpin extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double
}

object Pushpin {
  @scala.inline
  def apply(destroy: () => Unit, el: Element, options: PushpinOptions, originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
}

