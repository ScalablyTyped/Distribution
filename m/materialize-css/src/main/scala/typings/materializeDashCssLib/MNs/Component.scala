package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Component")
@js.native
abstract class Component[TOptions] protected () extends ComponentBase[TOptions] {
  /**
           * Construct component instance and set everything up
           */
  def this(elem: stdLib.Element) = this()
  /**
           * Construct component instance and set everything up
           */
  def this(elem: stdLib.Element, options: stdLib.Partial[TOptions]) = this()
  /**
           * Destroy plugin instance and teardown
           */
  def destroy(): scala.Unit = js.native
}

