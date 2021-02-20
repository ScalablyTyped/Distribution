package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects DeveloperMetadata that matches all of the specified fields.  For
  * example, if only a metadata ID is specified this considers the
  * DeveloperMetadata with that particular unique ID. If a metadata key is
  * specified, this considers all developer metadata with that key.  If a key,
  * visibility, and location type are all specified, this considers all
  * developer metadata with that key and visibility that are associated with a
  * location of that type.  In general, this selects all DeveloperMetadata that
  * matches the intersection of all the specified fields; any field or
  * combination of fields may be specified.
  */
@js.native
trait SchemaDeveloperMetadataLookup extends StObject {
  
  /**
    * Determines how this lookup matches the location.  If this field is
    * specified as EXACT, only developer metadata associated on the exact
    * location specified is matched.  If this field is specified to
    * INTERSECTING, developer metadata associated on intersecting locations is
    * also matched.  If left unspecified, this field assumes a default value of
    * INTERSECTING. If this field is specified, a metadataLocation must also be
    * specified.
    */
  var locationMatchingStrategy: js.UndefOr[String] = js.native
  
  /**
    * Limits the selected developer metadata to those entries which are
    * associated with locations of the specified type.  For example, when this
    * field is specified as ROW this lookup only considers developer metadata
    * associated on rows.  If the field is left unspecified, all location types
    * are considered.  This field cannot be specified as SPREADSHEET when the
    * locationMatchingStrategy is specified as INTERSECTING or when the
    * metadataLocation is specified as a non-spreadsheet location: spreadsheet
    * metadata cannot intersect any other developer metadata location.  This
    * field also must be left unspecified when the locationMatchingStrategy is
    * specified as EXACT.
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_id.
    */
  var metadataId: js.UndefOr[Double] = js.native
  
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_key.
    */
  var metadataKey: js.UndefOr[String] = js.native
  
  /**
    * Limits the selected developer metadata to those entries associated with
    * the specified location.  This field either matches exact locations or all
    * intersecting locations according the specified locationMatchingStrategy.
    */
  var metadataLocation: js.UndefOr[SchemaDeveloperMetadataLocation] = js.native
  
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_value.
    */
  var metadataValue: js.UndefOr[String] = js.native
  
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.visibility.  If left unspecified, all developer
    * metadata visibile to the requesting project is considered.
    */
  var visibility: js.UndefOr[String] = js.native
}
object SchemaDeveloperMetadataLookup {
  
  @scala.inline
  def apply(): SchemaDeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperMetadataLookup]
  }
  
  @scala.inline
  implicit class SchemaDeveloperMetadataLookupMutableBuilder[Self <: SchemaDeveloperMetadataLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationMatchingStrategy(value: String): Self = StObject.set(x, "locationMatchingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationMatchingStrategyUndefined: Self = StObject.set(x, "locationMatchingStrategy", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
    
    @scala.inline
    def setMetadataLocation(value: SchemaDeveloperMetadataLocation): Self = StObject.set(x, "metadataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataLocationUndefined: Self = StObject.set(x, "metadataLocation", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValueUndefined: Self = StObject.set(x, "metadataValue", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
