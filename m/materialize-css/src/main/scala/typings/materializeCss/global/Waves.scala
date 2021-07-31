package typings.materializeCss.global

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Waves {
  
  @JSGlobal("Waves")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attach Waves to an input element (or any element which doesn't
    * bubble mouseup/mousedown events).
    *   Intended to be used with dynamically loaded forms/inputs, or
    * where the user doesn't want a delegated click handler.
    */
  @scala.inline
  def attach(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
