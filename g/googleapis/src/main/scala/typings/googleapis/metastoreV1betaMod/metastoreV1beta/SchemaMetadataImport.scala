package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataImport extends StObject {
  
  /**
    * Output only. The time when the metadata import was started.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. A database dump from a pre-existing metastore's database.
    */
  var databaseDump: js.UndefOr[SchemaDatabaseDump] = js.undefined
  
  /**
    * The description of the metadata import.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the metadata import finished.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/metadataImports/{metadata_import_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the metadata import.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the metadata import was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadataImport {
  
  inline def apply(): SchemaMetadataImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataImport]
  }
  
  extension [Self <: SchemaMetadataImport](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabaseDump(value: SchemaDatabaseDump): Self = StObject.set(x, "databaseDump", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDumpUndefined: Self = StObject.set(x, "databaseDump", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
