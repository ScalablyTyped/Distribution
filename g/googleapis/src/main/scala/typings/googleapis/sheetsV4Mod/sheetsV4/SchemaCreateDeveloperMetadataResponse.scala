package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from creating developer metadata.
  */
trait SchemaCreateDeveloperMetadataResponse extends StObject {
  
  /**
    * The developer metadata that was created.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.undefined
}
object SchemaCreateDeveloperMetadataResponse {
  
  inline def apply(): SchemaCreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataResponse]
  }
  
  extension [Self <: SchemaCreateDeveloperMetadataResponse](x: Self) {
    
    inline def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
