package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.cRLDistributionPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtCRLDistributionPoints
  extends StObject
     with ExtParam {
  
  var array: js.Array[DistributionPoint]
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: cRLDistributionPoints
}
object ExtCRLDistributionPoints {
  
  inline def apply(array: js.Array[DistributionPoint]): ExtCRLDistributionPoints = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "cRLDistributionPoints")
    __obj.asInstanceOf[ExtCRLDistributionPoints]
  }
  
  extension [Self <: ExtCRLDistributionPoints](x: Self) {
    
    inline def setArray(value: js.Array[DistributionPoint]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: DistributionPoint*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: cRLDistributionPoints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
