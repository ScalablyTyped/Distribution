package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from deleting developer metadata.
  */
trait SchemaDeleteDeveloperMetadataResponse extends StObject {
  
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.undefined
}
object SchemaDeleteDeveloperMetadataResponse {
  
  inline def apply(): SchemaDeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataResponse]
  }
  
  extension [Self <: SchemaDeleteDeveloperMetadataResponse](x: Self) {
    
    inline def setDeletedDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeletedDeveloperMetadataUndefined: Self = StObject.set(x, "deletedDeveloperMetadata", js.undefined)
    
    inline def setDeletedDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "deletedDeveloperMetadata", js.Array(value :_*))
  }
}
