package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompensationRange extends StObject {
  
  /**
    * The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
    */
  var maxCompensation: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
    */
  var minCompensation: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaCompensationRange {
  
  inline def apply(): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationRange]
  }
  
  extension [Self <: SchemaCompensationRange](x: Self) {
    
    inline def setMaxCompensation(value: SchemaMoney): Self = StObject.set(x, "maxCompensation", value.asInstanceOf[js.Any])
    
    inline def setMaxCompensationUndefined: Self = StObject.set(x, "maxCompensation", js.undefined)
    
    inline def setMinCompensation(value: SchemaMoney): Self = StObject.set(x, "minCompensation", value.asInstanceOf[js.Any])
    
    inline def setMinCompensationUndefined: Self = StObject.set(x, "minCompensation", js.undefined)
  }
}
