package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanStreamOption extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var `match`: js.UndefOr[String] = js.undefined
}
object ScanStreamOption {
  
  inline def apply(): ScanStreamOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanStreamOption]
  }
  
  extension [Self <: ScanStreamOption](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
