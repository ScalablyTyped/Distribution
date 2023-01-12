package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.StateQuality
import typings.iobroker.mod.global.ioBroker.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof iobroker.iobroker.<global>.ioBroker.State ]: -? iobroker.iobroker.<global>.ioBroker.State[K]} */
trait KinkeyofStateStateK extends StObject {
  
  var ack: Boolean
  
  var c: String
  
  var expire: Double
  
  var from: String
  
  var lc: Double
  
  var q: StateQuality
  
  var ts: Double
  
  var user: String
  
  var `val`: StateValue
}
object KinkeyofStateStateK {
  
  inline def apply(
    ack: Boolean,
    c: String,
    expire: Double,
    from: String,
    lc: Double,
    q: StateQuality,
    ts: Double,
    user: String
  ): KinkeyofStateStateK = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(null)
    __obj.asInstanceOf[KinkeyofStateStateK]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinkeyofStateStateK] (val x: Self) extends AnyVal {
    
    inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLc(value: Double): Self = StObject.set(x, "lc", value.asInstanceOf[js.Any])
    
    inline def setQ(value: StateQuality): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVal(value: StateValue): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValNull: Self = StObject.set(x, "val", null)
  }
}
