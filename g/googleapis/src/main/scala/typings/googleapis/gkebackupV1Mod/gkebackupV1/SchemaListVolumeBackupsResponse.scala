package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVolumeBackupsResponse extends StObject {
  
  /**
    * A token which may be sent as page_token in a subsequent `ListVolumeBackups` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of VolumeBackups matching the given criteria.
    */
  var volumeBackups: js.UndefOr[js.Array[SchemaVolumeBackup]] = js.undefined
}
object SchemaListVolumeBackupsResponse {
  
  inline def apply(): SchemaListVolumeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVolumeBackupsResponse]
  }
  
  extension [Self <: SchemaListVolumeBackupsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVolumeBackups(value: js.Array[SchemaVolumeBackup]): Self = StObject.set(x, "volumeBackups", value.asInstanceOf[js.Any])
    
    inline def setVolumeBackupsUndefined: Self = StObject.set(x, "volumeBackups", js.undefined)
    
    inline def setVolumeBackupsVarargs(value: SchemaVolumeBackup*): Self = StObject.set(x, "volumeBackups", js.Array(value*))
  }
}
