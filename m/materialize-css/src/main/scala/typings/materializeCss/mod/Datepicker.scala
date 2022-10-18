package typings.materializeCss.mod

import typings.materializeCss.M.DatepickerOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialDatepickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Datepicker")
@js.native
open class Datepicker ()
  extends StObject
     with typings.materializeCss.M.Datepicker {
  
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
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: DatepickerOptions = js.native
}
object Datepicker {
  
  @JSImport("materialize-css", "Datepicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Datepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Datepicker]
  
  /**
    * Init Datepickers
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Datepicker] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Datepicker]]
  inline def init(els: MElements, options: PartialDatepickerOptions): js.Array[typings.materializeCss.M.Datepicker] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Datepicker]]
  /**
    * Init Datepicker
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Datepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Datepicker]
  inline def init(els: Element, options: PartialDatepickerOptions): typings.materializeCss.M.Datepicker = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Datepicker]
}
