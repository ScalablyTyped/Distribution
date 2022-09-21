package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialModalOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Modal")
@js.native
open class Modal ()
  extends StObject
     with typings.materializeCss.M.Modal {
  
  /**
    * Close modal
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * ID of the modal element
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * If the modal is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open modal
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}
object Modal {
  
  @JSGlobal("M.Modal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Modal]
  
  /**
    * Init Modals
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.Modal] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Modal]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialModalOptions
  ): js.Array[typings.materializeCss.M.Modal] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Modal]]
  /**
    * Init Modal
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Modal]
  inline def init(els: Element, options: PartialModalOptions): typings.materializeCss.M.Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Modal]
}
