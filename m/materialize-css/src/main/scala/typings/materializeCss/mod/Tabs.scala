package typings.materializeCss.mod

import typings.materializeCss.M.TabsOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
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
  def init(els: MElements, options: Partial[TabsOptions]): js.Array[typings.materializeCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: Element): typings.materializeCss.M.Tabs = js.native
  def init(els: Element, options: Partial[TabsOptions]): typings.materializeCss.M.Tabs = js.native
}

