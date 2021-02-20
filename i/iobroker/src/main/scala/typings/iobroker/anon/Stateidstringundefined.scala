package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.StateQuality
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined iobroker.iobroker.<global>.ioBroker.State & {  id :string | undefined} */
@js.native
trait Stateidstringundefined extends StObject {
  
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean = js.native
  
  /** Optional comment */
  var c: js.UndefOr[String] = js.native
  
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.native
  
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /** Unix timestamp of the last time the value changed */
  var lc: Double = js.native
  
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.native
  
  /** Unix timestamp. Default: current time */
  var ts: Double = js.native
  
  /** The user who set this value */
  var user: js.UndefOr[String] = js.native
  
  /** The value of the state. */
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null = js.native
}
object Stateidstringundefined {
  
  @scala.inline
  def apply(ack: Boolean, from: String, lc: Double, ts: Double): Stateidstringundefined = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stateidstringundefined]
  }
  
  @scala.inline
  implicit class StateidstringundefinedMutableBuilder[Self <: Stateidstringundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
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
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLc(value: Double): Self = StObject.set(x, "lc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: StateQuality): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
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
