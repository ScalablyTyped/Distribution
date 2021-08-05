package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter that describes what data should be selected or returned from a
  * request.
  */
trait SchemaDataFilter extends StObject {
  
  /**
    * Selects data that matches the specified A1 range.
    */
  var a1Range: js.UndefOr[String] = js.undefined
  
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[SchemaDeveloperMetadataLookup] = js.undefined
  
  /**
    * Selects data that matches the range described by the GridRange.
    */
  var gridRange: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaDataFilter {
  
  inline def apply(): SchemaDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilter]
  }
  
  extension [Self <: SchemaDataFilter](x: Self) {
    
    inline def setA1Range(value: String): Self = StObject.set(x, "a1Range", value.asInstanceOf[js.Any])
    
    inline def setA1RangeUndefined: Self = StObject.set(x, "a1Range", js.undefined)
    
    inline def setDeveloperMetadataLookup(value: SchemaDeveloperMetadataLookup): Self = StObject.set(x, "developerMetadataLookup", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataLookupUndefined: Self = StObject.set(x, "developerMetadataLookup", js.undefined)
    
    inline def setGridRange(value: SchemaGridRange): Self = StObject.set(x, "gridRange", value.asInstanceOf[js.Any])
    
    inline def setGridRangeUndefined: Self = StObject.set(x, "gridRange", js.undefined)
  }
}
