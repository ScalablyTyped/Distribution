package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Range")
@js.native
open class Range ()
  extends StObject
     with typings.materializeCss.M.Component[Unit] {
  
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
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: Unit = js.native
}
object Range {
  
  @JSImport("materialize-css", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Range]
  
  /**
    * Init Ranges
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Range]]
  inline def init(els: MElements, options: Partial[Unit]): js.Array[typings.materializeCss.M.Range] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Range]]
  /**
    * Init Range
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Range]
  inline def init(els: Element, options: Partial[Unit]): typings.materializeCss.M.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Range]
}
