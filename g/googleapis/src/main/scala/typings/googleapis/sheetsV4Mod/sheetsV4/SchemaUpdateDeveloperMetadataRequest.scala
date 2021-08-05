package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to update properties of developer metadata. Updates the
  * properties of the developer metadata selected by the filters to the values
  * provided in the DeveloperMetadata resource.  Callers must specify the
  * properties they wish to update in the fields parameter, as well as specify
  * at least one DataFilter matching the metadata they wish to update.
  */
trait SchemaUpdateDeveloperMetadataRequest extends StObject {
  
  /**
    * The filters matching the developer metadata entries to update.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
  
  /**
    * The value that all metadata matched by the data filters will be updated
    * to.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.undefined
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `developerMetadata` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
}
object SchemaUpdateDeveloperMetadataRequest {
  
  inline def apply(): SchemaUpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeveloperMetadataRequest]
  }
  
  extension [Self <: SchemaUpdateDeveloperMetadataRequest](x: Self) {
    
    inline def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    inline def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
