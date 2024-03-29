package typings.materializeCss.global.M

import typings.materializeCss.M.MaterialboxOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialMaterialboxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Materialbox")
@js.native
open class Materialbox ()
  extends StObject
     with typings.materializeCss.M.Materialbox {
  
  /**
    * Caption if specified
    */
  /* CompleteClass */
  var caption: String = js.native
  
  /**
    * Close materialbox
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * If the materialbox is no longer being animated
    */
  /* CompleteClass */
  var doneAnimating: Boolean = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * Open materialbox
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: MaterialboxOptions = js.native
  
  /**
    * Original height of image
    */
  /* CompleteClass */
  var originalHeight: Double = js.native
  
  /**
    * Original width of image
    */
  /* CompleteClass */
  var originalWidth: Double = js.native
  
  /**
    * If the materialbox overlay is showing
    */
  /* CompleteClass */
  var overlayActive: Boolean = js.native
}
object Materialbox {
  
  @JSGlobal("M.Materialbox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Materialbox = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Materialbox]
  
  /**
    * Init Materialboxes
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Materialbox] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Materialbox]]
  inline def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typings.materializeCss.M.Materialbox] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Materialbox]]
  /**
    * Init Materialbox
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Materialbox = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Materialbox]
  inline def init(els: Element, options: PartialMaterialboxOptions): typings.materializeCss.M.Materialbox = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Materialbox]
}
