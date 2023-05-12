package typings.ioredis.anon

import typings.ioredis.ioredisStrings.auth_
import typings.ioredis.ioredisStrings.monitor
import typings.ioredis.ioredisStrings.ping
import typings.ioredis.ioredisStrings.psubscribe
import typings.ioredis.ioredisStrings.punsubscribe
import typings.ioredis.ioredisStrings.quit
import typings.ioredis.ioredisStrings.ssubscribe
import typings.ioredis.ioredisStrings.subscribe
import typings.ioredis.ioredisStrings.sunsubscribe
import typings.ioredis.ioredisStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in keyof ioredis.ioredis/built/Command.CommandNameFlags ]: ioredis.ioredis/built/Command.CommandNameFlags[key]} */
trait keyinkeyofCommandNameFlag extends StObject {
  
  var ENTER_SUBSCRIBER_MODE: js.Tuple3[subscribe, psubscribe, ssubscribe]
  
  var EXIT_SUBSCRIBER_MODE: js.Tuple3[unsubscribe, punsubscribe, sunsubscribe]
  
  var VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_]
  
  var VALID_IN_SUBSCRIBER_MODE: js.Tuple8[subscribe, psubscribe, unsubscribe, punsubscribe, ssubscribe, sunsubscribe, ping, quit]
  
  var WILL_DISCONNECT: js.Array[quit]
}
object keyinkeyofCommandNameFlag {
  
  inline def apply(
    ENTER_SUBSCRIBER_MODE: js.Tuple3[subscribe, psubscribe, ssubscribe],
    EXIT_SUBSCRIBER_MODE: js.Tuple3[unsubscribe, punsubscribe, sunsubscribe],
    VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_],
    VALID_IN_SUBSCRIBER_MODE: js.Tuple8[subscribe, psubscribe, unsubscribe, punsubscribe, ssubscribe, sunsubscribe, ping, quit],
    WILL_DISCONNECT: js.Array[quit]
  ): keyinkeyofCommandNameFlag = {
    val __obj = js.Dynamic.literal(ENTER_SUBSCRIBER_MODE = ENTER_SUBSCRIBER_MODE.asInstanceOf[js.Any], EXIT_SUBSCRIBER_MODE = EXIT_SUBSCRIBER_MODE.asInstanceOf[js.Any], VALID_IN_MONITOR_MODE = VALID_IN_MONITOR_MODE.asInstanceOf[js.Any], VALID_IN_SUBSCRIBER_MODE = VALID_IN_SUBSCRIBER_MODE.asInstanceOf[js.Any], WILL_DISCONNECT = WILL_DISCONNECT.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinkeyofCommandNameFlag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinkeyofCommandNameFlag] (val x: Self) extends AnyVal {
    
    inline def setENTER_SUBSCRIBER_MODE(value: js.Tuple3[subscribe, psubscribe, ssubscribe]): Self = StObject.set(x, "ENTER_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setEXIT_SUBSCRIBER_MODE(value: js.Tuple3[unsubscribe, punsubscribe, sunsubscribe]): Self = StObject.set(x, "EXIT_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setVALID_IN_MONITOR_MODE(value: js.Tuple2[monitor, auth_]): Self = StObject.set(x, "VALID_IN_MONITOR_MODE", value.asInstanceOf[js.Any])
    
    inline def setVALID_IN_SUBSCRIBER_MODE(
      value: js.Tuple8[subscribe, psubscribe, unsubscribe, punsubscribe, ssubscribe, sunsubscribe, ping, quit]
    ): Self = StObject.set(x, "VALID_IN_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setWILL_DISCONNECT(value: js.Array[quit]): Self = StObject.set(x, "WILL_DISCONNECT", value.asInstanceOf[js.Any])
    
    inline def setWILL_DISCONNECTVarargs(value: quit*): Self = StObject.set(x, "WILL_DISCONNECT", js.Array(value*))
  }
}
