package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialSidenavOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Sidenav")
@js.native
open class Sidenav ()
  extends StObject
     with typings.materializeCss.M.Sidenav {
  
  /**
    * Closes Sidenav
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
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
  
  /**
    * Describes open/close state of Sidenav
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Opens Sidenav
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}
object Sidenav {
  
  @JSGlobal("M.Sidenav")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Sidenav]
  
  /**
    * Init Sidenavs
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.Sidenav] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Sidenav]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialSidenavOptions
  ): js.Array[typings.materializeCss.M.Sidenav] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Sidenav]]
  /**
    * Init Sidenav
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Sidenav]
  inline def init(els: Element, options: PartialSidenavOptions): typings.materializeCss.M.Sidenav = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Sidenav]
}
