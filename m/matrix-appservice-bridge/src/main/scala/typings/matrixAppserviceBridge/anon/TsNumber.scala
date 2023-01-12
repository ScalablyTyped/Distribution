package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsNumber extends StObject {
  
  var ts: Double
}
object TsNumber {
  
  inline def apply(ts: Double): TsNumber = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsNumber] (val x: Self) extends AnyVal {
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
