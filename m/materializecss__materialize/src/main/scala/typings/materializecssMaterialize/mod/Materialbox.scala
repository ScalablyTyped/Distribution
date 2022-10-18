package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.MaterialboxOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialMaterialboxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Materialbox")
@js.native
open class Materialbox ()
  extends StObject
     with typings.materializecssMaterialize.M.Materialbox {
  
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
  
  @JSImport("@materializecss/materialize", "Materialbox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Materialbox = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Materialbox]
  
  /**
    * Init Materialboxes
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Materialbox] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Materialbox]]
  inline def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typings.materializecssMaterialize.M.Materialbox] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Materialbox]]
  /**
    * Init Materialbox
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Materialbox = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Materialbox]
  inline def init(els: Element, options: PartialMaterialboxOptions): typings.materializecssMaterialize.M.Materialbox = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Materialbox]
}
