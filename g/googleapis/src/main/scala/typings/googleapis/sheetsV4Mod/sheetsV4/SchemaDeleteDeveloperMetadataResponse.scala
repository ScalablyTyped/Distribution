package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from deleting developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataResponse extends StObject {
  
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}
object SchemaDeleteDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): SchemaDeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class SchemaDeleteDeveloperMetadataResponseMutableBuilder[Self <: SchemaDeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDeveloperMetadataUndefined: Self = StObject.set(x, "deletedDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeletedDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "deletedDeveloperMetadata", js.Array(value :_*))
  }
}
