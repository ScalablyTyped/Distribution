package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialCollapsibleOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Collapsible")
@js.native
class Collapsible ()
  extends StObject
     with typings.materializeCss.M.Collapsible {
  
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  /* CompleteClass */
  override def close(n: Double): Unit = js.native
  
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  /* CompleteClass */
  override def open(n: Double): Unit = js.native
}
object Collapsible {
  
  @JSGlobal("M.Collapsible")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  @scala.inline
  def getInstance(elem: Element): typings.materializeCss.M.Collapsible = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Collapsible]
  
  /**
    * Init Collapsibles
    */
  /* static member */
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Collapsible] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Collapsible]]
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialCollapsibleOptions
  ): js.Array[typings.materializeCss.M.Collapsible] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Collapsible]]
  /**
    * Init Collapsible
    */
  /* static member */
  @scala.inline
  def init(els: Element): typings.materializeCss.M.Collapsible = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Collapsible]
  @scala.inline
  def init(els: Element, options: PartialCollapsibleOptions): typings.materializeCss.M.Collapsible = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Collapsible]
}
