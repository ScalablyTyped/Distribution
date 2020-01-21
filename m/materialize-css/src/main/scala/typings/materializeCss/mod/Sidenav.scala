package typings.materializeCss.mod

import typings.materializeCss.M.SidenavOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Sidenav] = js.native
  def init(els: MElements, options: Partial[SidenavOptions]): js.Array[typings.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeCss.M.Sidenav = js.native
  def init(els: Element, options: Partial[SidenavOptions]): typings.materializeCss.M.Sidenav = js.native
}

