package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.TabsOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tabs")
@js.native
class Tabs ()
  extends typings.materializeDashCss.M.Tabs

/* static members */
@JSImport("materialize-css", "Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Tabs] = js.native
  def init(els: MElements, options: Partial[TabsOptions]): js.Array[typings.materializeDashCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: Element): typings.materializeDashCss.M.Tabs = js.native
  def init(els: Element, options: Partial[TabsOptions]): typings.materializeDashCss.M.Tabs = js.native
}

