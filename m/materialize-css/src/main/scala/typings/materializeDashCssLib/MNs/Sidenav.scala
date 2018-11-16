package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Sidenav")
@js.native
class Sidenav ()
  extends Component[SidenavOptions]
     with Openable {
  /**
           * Describes if Sidenav is being dragged
           */
  var isDragged: scala.Boolean = js.native
  /**
           * Describes if sidenav is fixed
           */
  var isFixed: scala.Boolean = js.native
  /* CompleteClass */
  override var isOpen: scala.Boolean = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def open(): scala.Unit = js.native
}

@JSGlobal("M.Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
           * Get Instance
           */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Sidenav = js.native
  /**
           * Init Sidenavs
           */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Sidenav] = js.native
  /**
           * Init Sidenavs
           */
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.SidenavOptions]
  ): js.Array[materializeDashCssLib.MNs.Sidenav] = js.native
  /**
           * Init Sidenav
           */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Sidenav = js.native
  /**
           * Init Sidenav
           */
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.SidenavOptions]): materializeDashCssLib.MNs.Sidenav = js.native
}

