package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to create developer metadata.
  */
trait SchemaCreateDeveloperMetadataRequest extends StObject {
  
  /**
    * The developer metadata to create.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.undefined
}
object SchemaCreateDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): SchemaCreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateDeveloperMetadataRequestMutableBuilder[Self <: SchemaCreateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
