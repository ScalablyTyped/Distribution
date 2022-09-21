package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateDeveloperMetadataRequest extends StObject {
  
  /**
    * The developer metadata to create.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.undefined
}
object SchemaCreateDeveloperMetadataRequest {
  
  inline def apply(): SchemaCreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataRequest]
  }
  
  extension [Self <: SchemaCreateDeveloperMetadataRequest](x: Self) {
    
    inline def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
