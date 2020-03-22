package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialTabsOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tabs")
@js.native
class Tabs ()
  extends typings.materializeCss.M.Tabs

/* static members */
@JSImport("materialize-css", "Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Tabs] = js.native
  def init(els: MElements, options: PartialTabsOptions): js.Array[typings.materializeCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: Element): typings.materializeCss.M.Tabs = js.native
  def init(els: Element, options: PartialTabsOptions): typings.materializeCss.M.Tabs = js.native
}

