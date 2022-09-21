package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ListProducerOverridesResponse extends StObject {
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Producer overrides on this limit.
    */
  var overrides: js.UndefOr[js.Array[SchemaV1Beta1QuotaOverride]] = js.undefined
}
object SchemaV1Beta1ListProducerOverridesResponse {
  
  inline def apply(): SchemaV1Beta1ListProducerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ListProducerOverridesResponse]
  }
  
  extension [Self <: SchemaV1Beta1ListProducerOverridesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOverrides(value: js.Array[SchemaV1Beta1QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaV1Beta1QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
