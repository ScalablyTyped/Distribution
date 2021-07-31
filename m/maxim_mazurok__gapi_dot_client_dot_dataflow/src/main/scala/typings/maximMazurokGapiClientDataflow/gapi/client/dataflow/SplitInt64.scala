package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitInt64 extends StObject {
  
  /** The high order bits, including the sign: n >> 32. */
  var highBits: js.UndefOr[Double] = js.undefined
  
  /** The low order bits: n & 0xffffffff. */
  var lowBits: js.UndefOr[Double] = js.undefined
}
object SplitInt64 {
  
  @scala.inline
  def apply(): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitInt64]
  }
  
  @scala.inline
  implicit class SplitInt64MutableBuilder[Self <: SplitInt64] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighBits(value: Double): Self = StObject.set(x, "highBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighBitsUndefined: Self = StObject.set(x, "highBits", js.undefined)
    
    @scala.inline
    def setLowBits(value: Double): Self = StObject.set(x, "lowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowBitsUndefined: Self = StObject.set(x, "lowBits", js.undefined)
  }
}
