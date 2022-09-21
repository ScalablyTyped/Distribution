package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interval identifier that can be used to clear the interval.
  * @remarks Note that this is actually a `number` type, but it
  * is not compatible with `globalThis.clearInterval`. Provide
  * this to iobroker's `adapter.clearInterval` instead.
  */
trait Interval extends StObject {
  
  var __ioBrokerBrand: typings.iobroker.iobrokerStrings.Interval
}
object Interval {
  
  inline def apply(): Interval = {
    val __obj = js.Dynamic.literal(__ioBrokerBrand = "Interval")
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def set__ioBrokerBrand(value: typings.iobroker.iobrokerStrings.Interval): Self = StObject.set(x, "__ioBrokerBrand", value.asInstanceOf[js.Any])
  }
}
