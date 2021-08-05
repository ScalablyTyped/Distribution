package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to a developer metadata search request.
  */
trait SchemaSearchDeveloperMetadataResponse extends StObject {
  
  /**
    * The metadata matching the criteria of the search request.
    */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[SchemaMatchedDeveloperMetadata]] = js.undefined
}
object SchemaSearchDeveloperMetadataResponse {
  
  inline def apply(): SchemaSearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDeveloperMetadataResponse]
  }
  
  extension [Self <: SchemaSearchDeveloperMetadataResponse](x: Self) {
    
    inline def setMatchedDeveloperMetadata(value: js.Array[SchemaMatchedDeveloperMetadata]): Self = StObject.set(x, "matchedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setMatchedDeveloperMetadataUndefined: Self = StObject.set(x, "matchedDeveloperMetadata", js.undefined)
    
    inline def setMatchedDeveloperMetadataVarargs(value: SchemaMatchedDeveloperMetadata*): Self = StObject.set(x, "matchedDeveloperMetadata", js.Array(value :_*))
  }
}
