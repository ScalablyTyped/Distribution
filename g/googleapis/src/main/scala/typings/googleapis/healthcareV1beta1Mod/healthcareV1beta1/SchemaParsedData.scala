package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParsedData extends StObject {
  
  var segments: js.UndefOr[js.Array[SchemaSegment]] = js.undefined
}
object SchemaParsedData {
  
  inline def apply(): SchemaParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParsedData]
  }
  
  extension [Self <: SchemaParsedData](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaSegment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
