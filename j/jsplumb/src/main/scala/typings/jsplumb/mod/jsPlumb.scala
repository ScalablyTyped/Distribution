package typings.jsplumb.mod

import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPlumb {
  
  @JSImport("jsplumb", "jsPlumb")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(el: NodeListOf[Element], clazz: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend(target: js.Object, source: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getInstance(): jsPlumbInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[jsPlumbInstance]
  inline def getInstance(_defaults: Defaults): jsPlumbInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(_defaults.asInstanceOf[js.Any]).asInstanceOf[jsPlumbInstance]
  
  inline def off(el: js.Any, event: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(el: js.Any, event: String, delegateSelector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], delegateSelector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(el: js.Any, event: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeClass(el: NodeListOf[Element], clazz: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def revalidate(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revalidate")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
