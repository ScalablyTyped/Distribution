package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleRE2 extends StObject {
  
  /**
    * This field controls the RE2 "program size" which is a rough estimate of how complex a compiled regex is to evaluate. A regex that has a program size greater than the configured value will fail to compile. In this case, the configured max program size can be increased or the regex can be simplified. If not specified, the default is 100. This field is deprecated; regexp validation should be performed on the management server instead of being done by each individual client.
    */
  var maxProgramSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleRE2 {
  
  inline def apply(): SchemaGoogleRE2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleRE2]
  }
  
  extension [Self <: SchemaGoogleRE2](x: Self) {
    
    inline def setMaxProgramSize(value: Double): Self = StObject.set(x, "maxProgramSize", value.asInstanceOf[js.Any])
    
    inline def setMaxProgramSizeNull: Self = StObject.set(x, "maxProgramSize", null)
    
    inline def setMaxProgramSizeUndefined: Self = StObject.set(x, "maxProgramSize", js.undefined)
  }
}
