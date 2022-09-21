package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.StateQuality
import typings.iobroker.mod.global.ioBroker.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof iobroker.iobroker.<global>.ioBroker.State ]:? iobroker.iobroker.<global>.ioBroker.State[K]} */
trait KinkeyofStateStateKAck extends StObject {
  
  var ack: js.UndefOr[Boolean] = js.undefined
  
  var c: js.UndefOr[String] = js.undefined
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var lc: js.UndefOr[Double] = js.undefined
  
  var q: js.UndefOr[StateQuality] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var `val`: js.UndefOr[StateValue] = js.undefined
}
object KinkeyofStateStateKAck {
  
  inline def apply(): KinkeyofStateStateKAck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinkeyofStateStateKAck]
  }
  
  extension [Self <: KinkeyofStateStateKAck](x: Self) {
    
    inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
    
    inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLc(value: Double): Self = StObject.set(x, "lc", value.asInstanceOf[js.Any])
    
    inline def setLcUndefined: Self = StObject.set(x, "lc", js.undefined)
    
    inline def setQ(value: StateQuality): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVal(value: StateValue): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValNull: Self = StObject.set(x, "val", null)
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
