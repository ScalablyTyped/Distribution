package typings.materializeCss.mod

import typings.materializeCss.anon.PartialSidenavOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeCss.M.Sidenav {
  /**
    * Describes if Sidenav is being dragged
    */
  /* CompleteClass */
  override var isDragged: Boolean = js.native
  /**
    * Describes if sidenav is fixed
    */
  /* CompleteClass */
  override var isFixed: Boolean = js.native
  /**
    * Describes open/close state of Sidenav
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Closes Sidenav
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Opens Sidenav
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

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
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Sidenav] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialSidenavOptions
  ): js.Array[typings.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeCss.M.Sidenav = js.native
  def init(els: Element, options: PartialSidenavOptions): typings.materializeCss.M.Sidenav = js.native
}

