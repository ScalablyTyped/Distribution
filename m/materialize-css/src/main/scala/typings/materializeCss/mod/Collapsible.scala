package typings.materializeCss.mod

import typings.materializeCss.M.CollapsibleOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialCollapsibleOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Collapsible")
@js.native
open class Collapsible ()
  extends StObject
     with typings.materializeCss.M.Collapsible {
  
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  /* CompleteClass */
  override def close(n: Double): Unit = js.native
  
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
    * Open collapsible section
    * @param n Nth section to open
    */
  /* CompleteClass */
  override def open(n: Double): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: CollapsibleOptions = js.native
}
object Collapsible {
  
  @JSImport("materialize-css", "Collapsible")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Collapsible = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Collapsible]
  
  /**
    * Init Collapsibles
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Collapsible] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Collapsible]]
  inline def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typings.materializeCss.M.Collapsible] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Collapsible]]
  /**
    * Init Collapsible
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Collapsible = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Collapsible]
  inline def init(els: Element, options: PartialCollapsibleOptions): typings.materializeCss.M.Collapsible = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Collapsible]
}
