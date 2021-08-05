package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to retrieve all developer metadata matching the set of specified
  * criteria.
  */
trait SchemaSearchDeveloperMetadataRequest extends StObject {
  
  /**
    * The data filters describing the criteria used to determine which
    * DeveloperMetadata entries to return.  DeveloperMetadata matching any of
    * the specified filters will be included in the response.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
}
object SchemaSearchDeveloperMetadataRequest {
  
  inline def apply(): SchemaSearchDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDeveloperMetadataRequest]
  }
  
  extension [Self <: SchemaSearchDeveloperMetadataRequest](x: Self) {
    
    inline def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
  }
}
