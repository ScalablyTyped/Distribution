package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastchannel {
  
  @JSImport("lib0", "broadcastchannel")
  @js.native
  val ^ : js.Any = js.native
  
  inline def publish(room: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(room.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(room: String, data: Any, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(room.asInstanceOf[js.Any], data.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def subscribe(room: String, f: js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]): js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(room.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]]
  
  inline def unsubscribe(room: String, f: js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(room.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
