package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSemanticVersion extends StObject {
  
  var majorNumber: js.UndefOr[Double | Null] = js.undefined
  
  var minorNumber: js.UndefOr[Double | Null] = js.undefined
  
  var patch: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSemanticVersion {
  
  inline def apply(): SchemaSemanticVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSemanticVersion]
  }
  
  extension [Self <: SchemaSemanticVersion](x: Self) {
    
    inline def setMajorNumber(value: Double): Self = StObject.set(x, "majorNumber", value.asInstanceOf[js.Any])
    
    inline def setMajorNumberNull: Self = StObject.set(x, "majorNumber", null)
    
    inline def setMajorNumberUndefined: Self = StObject.set(x, "majorNumber", js.undefined)
    
    inline def setMinorNumber(value: Double): Self = StObject.set(x, "minorNumber", value.asInstanceOf[js.Any])
    
    inline def setMinorNumberNull: Self = StObject.set(x, "minorNumber", null)
    
    inline def setMinorNumberUndefined: Self = StObject.set(x, "minorNumber", js.undefined)
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchNull: Self = StObject.set(x, "patch", null)
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
  }
}
