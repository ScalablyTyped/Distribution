package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.SidenavOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialSidenavOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Sidenav")
@js.native
open class Sidenav ()
  extends StObject
     with typings.materializecssMaterialize.M.Sidenav {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * Describes if Sidenav is being dragged
    */
  /* CompleteClass */
  var isDragged: Boolean = js.native
  
  /**
    * Describes if sidenav is fixed
    */
  /* CompleteClass */
  var isFixed: Boolean = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: SidenavOptions = js.native
}
object Sidenav {
  
  @JSGlobal("M.Sidenav")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Sidenav]
  
  /**
    * Init Sidenavs
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Sidenav] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Sidenav]]
  inline def init(els: MElements, options: PartialSidenavOptions): js.Array[typings.materializecssMaterialize.M.Sidenav] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Sidenav]]
  /**
    * Init Sidenav
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Sidenav]
  inline def init(els: Element, options: PartialSidenavOptions): typings.materializecssMaterialize.M.Sidenav = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Sidenav]
}
