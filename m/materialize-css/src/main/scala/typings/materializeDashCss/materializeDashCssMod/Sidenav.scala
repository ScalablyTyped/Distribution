package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.SidenavOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeDashCss.MNs.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Sidenav] = js.native
  def init(els: MElements, options: Partial[SidenavOptions]): js.Array[typings.materializeDashCss.MNs.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeDashCss.MNs.Sidenav = js.native
  def init(els: Element, options: Partial[SidenavOptions]): typings.materializeDashCss.MNs.Sidenav = js.native
}

