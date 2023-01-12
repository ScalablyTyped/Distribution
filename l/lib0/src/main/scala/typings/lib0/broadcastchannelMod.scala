package typings.lib0

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastchannelMod {
  
  @JSImport("lib0/broadcastchannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publish(room: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(room.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(room: String, data: Any, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(room.asInstanceOf[js.Any], data.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def subscribe(room: String, f: js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]): Set[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(room.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Set[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]]]
  
  inline def unsubscribe(room: String, f: js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(room.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Channel extends StObject {
    
    var bc: Any
    
    var subs: Set[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]]
  }
  object Channel {
    
    inline def apply(bc: Any, subs: Set[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]]): Channel = {
      val __obj = js.Dynamic.literal(bc = bc.asInstanceOf[js.Any], subs = subs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      inline def setBc(value: Any): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      inline def setSubs(value: Set[js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]]): Self = StObject.set(x, "subs", value.asInstanceOf[js.Any])
    }
  }
}
