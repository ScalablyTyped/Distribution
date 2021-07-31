package typings.ipfsCli.anon

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateIn extends StObject {
  
  var rateIn: default
  
  var rateOut: default
  
  var totalIn: js.Any
  
  var totalOut: js.Any
}
object RateIn {
  
  @scala.inline
  def apply(rateIn: default, rateOut: default, totalIn: js.Any, totalOut: js.Any): RateIn = {
    val __obj = js.Dynamic.literal(rateIn = rateIn.asInstanceOf[js.Any], rateOut = rateOut.asInstanceOf[js.Any], totalIn = totalIn.asInstanceOf[js.Any], totalOut = totalOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateIn]
  }
  
  @scala.inline
  implicit class RateInMutableBuilder[Self <: RateIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRateIn(value: default): Self = StObject.set(x, "rateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateOut(value: default): Self = StObject.set(x, "rateOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalIn(value: js.Any): Self = StObject.set(x, "totalIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalOut(value: js.Any): Self = StObject.set(x, "totalOut", value.asInstanceOf[js.Any])
  }
}
