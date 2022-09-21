package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPatchJobInstanceDetailsResponse extends StObject {
  
  /**
    * A pagination token that can be used to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of instance status.
    */
  var patchJobInstanceDetails: js.UndefOr[js.Array[SchemaPatchJobInstanceDetails]] = js.undefined
}
object SchemaListPatchJobInstanceDetailsResponse {
  
  inline def apply(): SchemaListPatchJobInstanceDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPatchJobInstanceDetailsResponse]
  }
  
  extension [Self <: SchemaListPatchJobInstanceDetailsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchJobInstanceDetails(value: js.Array[SchemaPatchJobInstanceDetails]): Self = StObject.set(x, "patchJobInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setPatchJobInstanceDetailsUndefined: Self = StObject.set(x, "patchJobInstanceDetails", js.undefined)
    
    inline def setPatchJobInstanceDetailsVarargs(value: SchemaPatchJobInstanceDetails*): Self = StObject.set(x, "patchJobInstanceDetails", js.Array(value*))
  }
}
