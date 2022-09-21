package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtendedCompensationInfoCompensationRange extends StObject {
  
  /**
    * Required. Maximum value.
    */
  var max: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.undefined
  
  /**
    * Required. Minimum value.
    */
  var min: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.undefined
}
object SchemaExtendedCompensationInfoCompensationRange {
  
  inline def apply(): SchemaExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationRange]
  }
  
  extension [Self <: SchemaExtendedCompensationInfoCompensationRange](x: Self) {
    
    inline def setMax(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
