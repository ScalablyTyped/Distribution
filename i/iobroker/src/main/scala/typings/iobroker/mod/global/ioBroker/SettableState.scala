package typings.iobroker.mod.global.ioBroker

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.State, 'val'>> & std.Pick<iobroker.iobroker.<global>.ioBroker.State, 'val'> */
@js.native
trait SettableState extends StObject {
  
  var ack: js.UndefOr[Boolean] = js.native
  
  var c: js.UndefOr[String] = js.native
  
  var expire: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var lc: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[StateQuality] = js.native
  
  var ts: js.UndefOr[Double] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null = js.native
}
object SettableState {
  
  @scala.inline
  def apply(): SettableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableState]
  }
  
  @scala.inline
  implicit class SettableStateMutableBuilder[Self <: SettableState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    @scala.inline
    def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setLc(value: Double): Self = StObject.set(x, "lc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcUndefined: Self = StObject.set(x, "lc", js.undefined)
    
    @scala.inline
    def setQ(value: StateQuality): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setVal(value: String | Double | Boolean | js.Array[_] | (Record[String, _])): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValNull: Self = StObject.set(x, "val", null)
    
    @scala.inline
    def setValVarargs(value: js.Any*): Self = StObject.set(x, "val", js.Array(value :_*))
  }
}
