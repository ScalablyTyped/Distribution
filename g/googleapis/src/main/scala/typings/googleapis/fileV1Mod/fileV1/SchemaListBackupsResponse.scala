package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBackupsResponse extends StObject {
  
  /**
    * A list of backups in the project for the specified location. If the `{location\}` value in the request is "-", the response contains a list of backups from all locations. If any location is unreachable, the response will only return backups in reachable locations and the "unreachable" field will be populated with a list of unreachable locations.
    */
  var backups: js.UndefOr[js.Array[SchemaBackup]] = js.undefined
  
  /**
    * The token you can use to retrieve the next page of results. Not returned if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
