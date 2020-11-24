package typings.googleapis.sheetsV4Mod.sheetsV4

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
trait SchemaDeveloperMetadataLookup extends js.Object {
  
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
  implicit class SchemaDeveloperMetadataLookupOps[Self <: SchemaDeveloperMetadataLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationMatchingStrategy(value: String): Self = this.set("locationMatchingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMatchingStrategy: Self = this.set("locationMatchingStrategy", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setMetadataId(value: Double): Self = this.set("metadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataId: Self = this.set("metadataId", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: String): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataKey: Self = this.set("metadataKey", js.undefined)
    
    @scala.inline
    def setMetadataLocation(value: SchemaDeveloperMetadataLocation): Self = this.set("metadataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataLocation: Self = this.set("metadataLocation", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: String): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataValue: Self = this.set("metadataValue", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
