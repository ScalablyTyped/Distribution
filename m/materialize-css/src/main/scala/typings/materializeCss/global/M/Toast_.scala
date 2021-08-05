package typings.materializeCss.global.M

import typings.materializeCss.M.Toast
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Toast")
@js.native
class Toast_ ()
  extends StObject
     with Toast {
  
  /**
    * remove a specific toast
    */
  /* CompleteClass */
  override def dismiss(): Unit = js.native
  
  /**
    * Describes the current pan state of the Toast.
    */
  /* CompleteClass */
  var panning: Boolean = js.native
  
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  /* CompleteClass */
  var timeRemaining: Double = js.native
}
object Toast_ {
  
  @JSGlobal("M.Toast")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * dismiss all toasts
    */
  /* static member */
  inline def dismissAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAll")().asInstanceOf[Unit]
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[Toast]
}
