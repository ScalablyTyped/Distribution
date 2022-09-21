package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPoint extends StObject {
  
  var dpname: js.UndefOr[DistributionPointName] = js.undefined
}
object DistributionPoint {
  
  inline def apply(): DistributionPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPoint]
  }
  
  extension [Self <: DistributionPoint](x: Self) {
    
    inline def setDpname(value: DistributionPointName): Self = StObject.set(x, "dpname", value.asInstanceOf[js.Any])
    
    inline def setDpnameUndefined: Self = StObject.set(x, "dpname", js.undefined)
  }
}
