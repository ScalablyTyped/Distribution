package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ComponentBase")
@js.native
abstract class ComponentBase[TOptions] () extends js.Object {
  def this(options: stdLib.Partial[TOptions]) = this()
  /**
           * The DOM element the plugin was initialized with
           */
  var el: stdLib.Element = js.native
  /**
           * The options the instance was initialized with
           */
  var options: TOptions = js.native
}

