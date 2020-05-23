package typings.materializeCss.global.M

import typings.materializeCss.M.SidenavOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialSidenavOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeCss.M.Sidenav {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
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
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: SidenavOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Sidenav")
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
  def init(els: MElements, options: PartialSidenavOptions): js.Array[typings.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeCss.M.Sidenav = js.native
  def init(els: Element, options: PartialSidenavOptions): typings.materializeCss.M.Sidenav = js.native
}

