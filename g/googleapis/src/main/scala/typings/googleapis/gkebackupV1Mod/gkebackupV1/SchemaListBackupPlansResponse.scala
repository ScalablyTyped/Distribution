package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBackupPlansResponse extends StObject {
  
  /**
    * The list of BackupPlans matching the given criteria.
    */
  var backupPlans: js.UndefOr[js.Array[SchemaBackupPlan]] = js.undefined
  
  /**
    * A token which may be sent as page_token in a subsequent `ListBackupPlans` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListBackupPlansResponse {
  
  inline def apply(): SchemaListBackupPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBackupPlansResponse]
  }
  
  extension [Self <: SchemaListBackupPlansResponse](x: Self) {
    
    inline def setBackupPlans(value: js.Array[SchemaBackupPlan]): Self = StObject.set(x, "backupPlans", value.asInstanceOf[js.Any])
    
    inline def setBackupPlansUndefined: Self = StObject.set(x, "backupPlans", js.undefined)
    
    inline def setBackupPlansVarargs(value: SchemaBackupPlan*): Self = StObject.set(x, "backupPlans", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
