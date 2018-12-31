package typings
package materializeDashCssLib.materializeDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Component")
@js.native
abstract class Component[TOptions] protected ()
  extends materializeDashCssLib.MNs.Component[TOptions] {
  /**
    * Construct component instance and set everything up
    */
  def this(elem: stdLib.Element) = this()
  def this(elem: stdLib.Element, options: stdLib.Partial[TOptions]) = this()
}

