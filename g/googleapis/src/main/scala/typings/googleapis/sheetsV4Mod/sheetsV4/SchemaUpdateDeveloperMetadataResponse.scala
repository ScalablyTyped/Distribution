package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from updating developer metadata.
  */
trait SchemaUpdateDeveloperMetadataResponse extends StObject {
  
  /**
    * The updated developer metadata.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.undefined
}
object SchemaUpdateDeveloperMetadataResponse {
  
  inline def apply(): SchemaUpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeveloperMetadataResponse]
  }
  
  extension [Self <: SchemaUpdateDeveloperMetadataResponse](x: Self) {
    
    inline def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
  }
}
