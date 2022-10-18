package typings.inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomEventsAttachEventMod {
  
  @JSImport("inferno/dist/DOM/events/attachEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachEvent(dom: Any, eventName: Any, handler: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
