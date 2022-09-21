package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLimitsGetlabel
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Label revision resource name Must be: "limits/label"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLimitsGetlabel {
  
  inline def apply(): ParamsResourceLimitsGetlabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLimitsGetlabel]
  }
  
  extension [Self <: ParamsResourceLimitsGetlabel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
