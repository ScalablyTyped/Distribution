package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.anon.PartialModalOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Modal")
@js.native
open class Modal ()
  extends StObject
     with typings.materializecssMaterialize.M.Modal {
  
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
  
  @JSImport("@materializecss/materialize", "Modal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Modal]
  
  /**
    * Init Modals
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializecssMaterialize.M.Modal] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Modal]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialModalOptions
  ): js.Array[typings.materializecssMaterialize.M.Modal] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Modal]]
  /**
    * Init Modal
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Modal]
  inline def init(els: Element, options: PartialModalOptions): typings.materializecssMaterialize.M.Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Modal]
}
