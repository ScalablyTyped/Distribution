package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPointName extends StObject {
  
  var full: js.UndefOr[js.Array[GeneralName]] = js.undefined
}
object DistributionPointName {
  
  inline def apply(): DistributionPointName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPointName]
  }
  
  extension [Self <: DistributionPointName](x: Self) {
    
    inline def setFull(value: js.Array[GeneralName]): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setFullVarargs(value: GeneralName*): Self = StObject.set(x, "full", js.Array(value*))
  }
}
