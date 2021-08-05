package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListFindings` method.
  */
trait SchemaListFindingsResponse extends StObject {
  
  /**
    * The list of Findings returned.
    */
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFindingsResponse {
  
  inline def apply(): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
  
  extension [Self <: SchemaListFindingsResponse](x: Self) {
    
    inline def setFindings(value: js.Array[SchemaFinding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: SchemaFinding*): Self = StObject.set(x, "findings", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
