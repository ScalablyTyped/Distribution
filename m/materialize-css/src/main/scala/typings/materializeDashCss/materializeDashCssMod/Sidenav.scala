package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.SidenavOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeDashCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Sidenav] = js.native
  def init(els: MElements, options: Partial[SidenavOptions]): js.Array[typings.materializeDashCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeDashCss.M.Sidenav = js.native
  def init(els: Element, options: Partial[SidenavOptions]): typings.materializeDashCss.M.Sidenav = js.native
}

