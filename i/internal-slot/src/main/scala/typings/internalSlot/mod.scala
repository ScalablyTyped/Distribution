package typings.internalSlot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("internal-slot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(O: js.Object, slot: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(O.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(O: js.Object, slot: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(O.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def has(O: js.Object, slot: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(O.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def set(O: js.Object, slot: String, V: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(O.asInstanceOf[js.Any], slot.asInstanceOf[js.Any], V.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
