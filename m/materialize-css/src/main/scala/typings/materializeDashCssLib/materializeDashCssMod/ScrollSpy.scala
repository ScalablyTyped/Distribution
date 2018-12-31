package typings
package materializeDashCssLib.materializeDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends materializeDashCssLib.MNs.ScrollSpy

@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.ScrollSpy] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.ScrollSpyOptions]
  ): js.Array[materializeDashCssLib.MNs.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.ScrollSpy = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.ScrollSpyOptions]): materializeDashCssLib.MNs.ScrollSpy = js.native
}

