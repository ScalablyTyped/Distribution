package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupsResponse extends StObject {
  
  /** The list of matching backups. */
  var backups: js.UndefOr[js.Array[Backup]] = js.undefined
  
  /** `next_page_token` can be sent in a subsequent ListBackups call to fetch more of the matching backups. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBackupsResponse {
  
  inline def apply(): ListBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsResponse]
  }
  
  extension [Self <: ListBackupsResponse](x: Self) {
    
    inline def setBackups(value: js.Array[Backup]): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    inline def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "backups", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
