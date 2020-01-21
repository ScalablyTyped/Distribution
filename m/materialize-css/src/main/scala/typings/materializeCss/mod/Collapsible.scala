package typings.materializeCss.mod

import typings.materializeCss.M.CollapsibleOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typings.materializeCss.M.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: Partial[CollapsibleOptions]): js.Array[typings.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typings.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: Partial[CollapsibleOptions]): typings.materializeCss.M.Collapsible = js.native
}

