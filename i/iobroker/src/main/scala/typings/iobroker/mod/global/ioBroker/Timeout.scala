package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A timeout identifier that can be used to clear the timeout.
  * @remarks Note that this is actually a `number` type, but it
  * is not compatible with `globalThis.clearTimeout`. Provide
  * this to iobroker's `adatper.clearTimeout` instead.
  */
trait Timeout extends StObject {
  
  var __ioBrokerBrand: typings.iobroker.iobrokerStrings.Timeout
}
object Timeout {
  
  inline def apply(): Timeout = {
    val __obj = js.Dynamic.literal(__ioBrokerBrand = "Timeout")
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
    
    inline def set__ioBrokerBrand(value: typings.iobroker.iobrokerStrings.Timeout): Self = StObject.set(x, "__ioBrokerBrand", value.asInstanceOf[js.Any])
  }
}
