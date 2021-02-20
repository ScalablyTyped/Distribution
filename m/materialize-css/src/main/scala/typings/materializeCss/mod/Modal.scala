package typings.materializeCss.mod

import typings.materializeCss.anon.PartialModalOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Modal")
@js.native
class Modal ()
  extends typings.materializeCss.M.Modal
object Modal {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "Modal.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.Modal = js.native
  
  /**
    * Init Modals
    */
  /* static member */
  @JSImport("materialize-css", "Modal.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Modal] = js.native
  @JSImport("materialize-css", "Modal.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialModalOptions
  ): js.Array[typings.materializeCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  /* static member */
  @JSImport("materialize-css", "Modal.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.Modal = js.native
  @JSImport("materialize-css", "Modal.init")
  @js.native
  def init(els: Element, options: PartialModalOptions): typings.materializeCss.M.Modal = js.native
}
