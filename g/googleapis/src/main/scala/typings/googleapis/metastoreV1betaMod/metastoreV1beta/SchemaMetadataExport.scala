package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataExport extends StObject {
  
  /**
    * Output only. The type of the database dump.
    */
  var databaseDumpType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
    */
  var destinationGcsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the export ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the export started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the export.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadataExport {
  
  inline def apply(): SchemaMetadataExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataExport]
  }
  
  extension [Self <: SchemaMetadataExport](x: Self) {
    
    inline def setDatabaseDumpType(value: String): Self = StObject.set(x, "databaseDumpType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDumpTypeNull: Self = StObject.set(x, "databaseDumpType", null)
    
    inline def setDatabaseDumpTypeUndefined: Self = StObject.set(x, "databaseDumpType", js.undefined)
    
    inline def setDestinationGcsUri(value: String): Self = StObject.set(x, "destinationGcsUri", value.asInstanceOf[js.Any])
    
    inline def setDestinationGcsUriNull: Self = StObject.set(x, "destinationGcsUri", null)
    
    inline def setDestinationGcsUriUndefined: Self = StObject.set(x, "destinationGcsUri", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
