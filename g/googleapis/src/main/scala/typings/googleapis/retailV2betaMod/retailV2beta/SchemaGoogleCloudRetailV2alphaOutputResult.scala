package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaOutputResult extends StObject {
  
  /**
    * Export result in BigQuery.
    */
  var bigqueryResult: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaBigQueryOutputResult]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaOutputResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaOutputResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaOutputResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaOutputResult](x: Self) {
    
    inline def setBigqueryResult(value: js.Array[SchemaGoogleCloudRetailV2alphaBigQueryOutputResult]): Self = StObject.set(x, "bigqueryResult", value.asInstanceOf[js.Any])
    
    inline def setBigqueryResultUndefined: Self = StObject.set(x, "bigqueryResult", js.undefined)
    
    inline def setBigqueryResultVarargs(value: SchemaGoogleCloudRetailV2alphaBigQueryOutputResult*): Self = StObject.set(x, "bigqueryResult", js.Array(value*))
  }
}
