package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExport extends StObject {
  
  /**
    * Output only. The sink for export files in Cloud Storage.
    */
  var cloudStorageSink: js.UndefOr[SchemaCloudStorageSink] = js.undefined
  
  /**
    * Output only. The time when the export was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional export options.
    */
  var exportOptions: js.UndefOr[SchemaExportOptions] = js.undefined
  
  /**
    * Output only. The generated export ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The matter ID.
    */
  var matterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The export name. Don't use special characters (~!$'(),;@:/?) in the name, they can prevent you from downloading exports.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The query parameters used to create the export.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
  
  /**
    * Output only. The requester of the export.
    */
  var requester: js.UndefOr[SchemaUserInfo] = js.undefined
  
  /**
    * Output only. Details about the export progress and size.
    */
  var stats: js.UndefOr[SchemaExportStats] = js.undefined
  
  /**
    * Output only. The status of the export.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaExport {
  
  inline def apply(): SchemaExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExport]
  }
  
  extension [Self <: SchemaExport](x: Self) {
    
    inline def setCloudStorageSink(value: SchemaCloudStorageSink): Self = StObject.set(x, "cloudStorageSink", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageSinkUndefined: Self = StObject.set(x, "cloudStorageSink", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExportOptions(value: SchemaExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdNull: Self = StObject.set(x, "matterId", null)
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequester(value: SchemaUserInfo): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setStats(value: SchemaExportStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
