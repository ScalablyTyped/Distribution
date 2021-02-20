package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to a developer metadata search request.
  */
@js.native
trait SchemaSearchDeveloperMetadataResponse extends StObject {
  
  /**
    * The metadata matching the criteria of the search request.
    */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[SchemaMatchedDeveloperMetadata]] = js.native
}
object SchemaSearchDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): SchemaSearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchDeveloperMetadataResponseMutableBuilder[Self <: SchemaSearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchedDeveloperMetadata(value: js.Array[SchemaMatchedDeveloperMetadata]): Self = StObject.set(x, "matchedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedDeveloperMetadataUndefined: Self = StObject.set(x, "matchedDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setMatchedDeveloperMetadataVarargs(value: SchemaMatchedDeveloperMetadata*): Self = StObject.set(x, "matchedDeveloperMetadata", js.Array(value :_*))
  }
}
