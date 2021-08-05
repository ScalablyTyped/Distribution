package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecisionOpt extends StObject {
  
  var precision: js.UndefOr[Double] = js.undefined
}
object PrecisionOpt {
  
  inline def apply(): PrecisionOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOpt]
  }
  
  extension [Self <: PrecisionOpt](x: Self) {
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
