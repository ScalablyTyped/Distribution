package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaOutputResult extends StObject {
  
  /**
    * Export result in BigQuery.
    */
  var bigqueryResult: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaBigQueryOutputResult]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaOutputResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaOutputResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaOutputResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaOutputResult](x: Self) {
    
    inline def setBigqueryResult(value: js.Array[SchemaGoogleCloudRetailV2betaBigQueryOutputResult]): Self = StObject.set(x, "bigqueryResult", value.asInstanceOf[js.Any])
    
    inline def setBigqueryResultUndefined: Self = StObject.set(x, "bigqueryResult", js.undefined)
    
    inline def setBigqueryResultVarargs(value: SchemaGoogleCloudRetailV2betaBigQueryOutputResult*): Self = StObject.set(x, "bigqueryResult", js.Array(value*))
  }
}
