package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.CollapsibleOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typings.materializeDashCss.MNs.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Collapsible] = js.native
  def init(els: MElements, options: Partial[CollapsibleOptions]): js.Array[typings.materializeDashCss.MNs.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typings.materializeDashCss.MNs.Collapsible = js.native
  def init(els: Element, options: Partial[CollapsibleOptions]): typings.materializeDashCss.MNs.Collapsible = js.native
}

