package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update Conversions Response.
  */
trait SchemaConversionsBatchUpdateResponse extends StObject {
  
  /**
    * Indicates that some or all conversions failed to update.
    */
  var hasFailures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The update status of each conversion. Statuses are returned in the same
    * order that conversions are updated.
    */
  var status: js.UndefOr[js.Array[SchemaConversionStatus]] = js.undefined
}
object SchemaConversionsBatchUpdateResponse {
  
  inline def apply(): SchemaConversionsBatchUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchUpdateResponse]
  }
  
  extension [Self <: SchemaConversionsBatchUpdateResponse](x: Self) {
    
    inline def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    inline def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStatus(value: js.Array[SchemaConversionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: SchemaConversionStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
