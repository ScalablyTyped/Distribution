package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter that describes what data should be selected or returned from a
  * request.
  */
@js.native
trait SchemaDataFilter extends StObject {
  
  /**
    * Selects data that matches the specified A1 range.
    */
  var a1Range: js.UndefOr[String] = js.native
  
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[SchemaDeveloperMetadataLookup] = js.native
  
  /**
    * Selects data that matches the range described by the GridRange.
    */
  var gridRange: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaDataFilter {
  
  @scala.inline
  def apply(): SchemaDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilter]
  }
  
  @scala.inline
  implicit class SchemaDataFilterMutableBuilder[Self <: SchemaDataFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA1Range(value: String): Self = StObject.set(x, "a1Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA1RangeUndefined: Self = StObject.set(x, "a1Range", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataLookup(value: SchemaDeveloperMetadataLookup): Self = StObject.set(x, "developerMetadataLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataLookupUndefined: Self = StObject.set(x, "developerMetadataLookup", js.undefined)
    
    @scala.inline
    def setGridRange(value: SchemaGridRange): Self = StObject.set(x, "gridRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRangeUndefined: Self = StObject.set(x, "gridRange", js.undefined)
  }
}
