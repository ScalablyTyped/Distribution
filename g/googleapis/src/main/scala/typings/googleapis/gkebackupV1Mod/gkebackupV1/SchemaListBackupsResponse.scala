package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBackupsResponse extends StObject {
  
  /**
    * The list of Backups matching the given criteria.
    */
  var backups: js.UndefOr[js.Array[SchemaBackup]] = js.undefined
  
  /**
    * A token which may be sent as page_token in a subsequent `ListBackups` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBackupsResponse {
  
  inline def apply(): SchemaListBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBackupsResponse]
  }
  
  extension [Self <: SchemaListBackupsResponse](x: Self) {
    
    inline def setBackups(value: js.Array[SchemaBackup]): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    inline def setBackupsVarargs(value: SchemaBackup*): Self = StObject.set(x, "backups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
