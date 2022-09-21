package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Entity extends StObject {
  
  /**
    * Required. Immutable. The ID of the asset associated with the storage location containing the entity data. The entity must be with in the same zone with the asset.
    */
  var asset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the associated Data Catalog entry.
    */
  var catalogEntry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Metadata stores that the entity is compatible with.
    */
  var compatibility: js.UndefOr[SchemaGoogleCloudDataplexV1EntityCompatibilityStatus] = js.undefined
  
  /**
    * Output only. The time when the entity was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The storage path of the entity data. For Cloud Storage data, this is the fully-qualified path to the entity, such as gs://bucket/path/to/data. For BigQuery data, this is the name of the table resource, such as projects/project_id/datasets/dataset_id/tables/table_id.
    */
  var dataPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The set of items within the data path constituting the data in the entity, represented as a glob path. Example: gs://bucket/path/to/data/xx/x.csv.
    */
  var dataPathPattern: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User friendly longer description text. Must be shorter than or equal to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Display name must be shorter than or equal to 256 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The etag associated with the entity, which can be retrieved with a GetEntity request. Required for update and delete requests.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Identifies the storage format of the entity data. It does not apply to entities with data stored in BigQuery.
    */
  var format: js.UndefOr[SchemaGoogleCloudDataplexV1StorageFormat] = js.undefined
  
  /**
    * Required. A user-provided entity ID. It is mutable, and will be used as the published table name. Specifying a new ID in an update entity request will override the existing value. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores. Must begin with a letter and consist of 256 or fewer characters.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the entity, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The description of the data structure and layout. The schema is not included in list responses. It is only included in SCHEMA and FULL entity views of a GetEntity response.
    */
  var schema: js.UndefOr[SchemaGoogleCloudDataplexV1Schema] = js.undefined
  
  /**
    * Required. Immutable. Identifies the storage system of the entity data.
    */
  var system: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The type of entity.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the entity was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Entity {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Entity]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Entity](x: Self) {
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetNull: Self = StObject.set(x, "asset", null)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCatalogEntry(value: String): Self = StObject.set(x, "catalogEntry", value.asInstanceOf[js.Any])
    
    inline def setCatalogEntryNull: Self = StObject.set(x, "catalogEntry", null)
    
    inline def setCatalogEntryUndefined: Self = StObject.set(x, "catalogEntry", js.undefined)
    
    inline def setCompatibility(value: SchemaGoogleCloudDataplexV1EntityCompatibilityStatus): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
    
    inline def setDataPathNull: Self = StObject.set(x, "dataPath", null)
    
    inline def setDataPathPattern(value: String): Self = StObject.set(x, "dataPathPattern", value.asInstanceOf[js.Any])
    
    inline def setDataPathPatternNull: Self = StObject.set(x, "dataPathPattern", null)
    
    inline def setDataPathPatternUndefined: Self = StObject.set(x, "dataPathPattern", js.undefined)
    
    inline def setDataPathUndefined: Self = StObject.set(x, "dataPath", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFormat(value: SchemaGoogleCloudDataplexV1StorageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(value: SchemaGoogleCloudDataplexV1Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemNull: Self = StObject.set(x, "system", null)
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
