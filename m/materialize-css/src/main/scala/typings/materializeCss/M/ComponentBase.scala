package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentBase[TOptions] extends js.Object {
  /**
    * The DOM element the plugin was initialized with
    */
  var el: Element
  /**
    * The options the instance was initialized with
    */
  var options: TOptions
}

object ComponentBase {
  @scala.inline
  def apply[TOptions](el: Element, options: TOptions): ComponentBase[TOptions] = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentBase[TOptions]]
  }
}

