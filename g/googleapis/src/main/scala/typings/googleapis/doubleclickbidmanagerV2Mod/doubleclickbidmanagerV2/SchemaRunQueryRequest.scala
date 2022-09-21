package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunQueryRequest extends StObject {
  
  /**
    * Report data range used to generate the report. If unspecified, the original parent query's data range is used.
    */
  var dataRange: js.UndefOr[SchemaDataRange] = js.undefined
}
object SchemaRunQueryRequest {
  
  inline def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  
  extension [Self <: SchemaRunQueryRequest](x: Self) {
    
    inline def setDataRange(value: SchemaDataRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
  }
}
