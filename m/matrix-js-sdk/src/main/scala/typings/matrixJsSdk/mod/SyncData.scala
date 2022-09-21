package typings.matrixJsSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncData extends StObject {
  
  var accountData: Record[String, Any]
  
  var catchingUp: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var fromCache: js.UndefOr[Boolean] = js.undefined
  
  var groupsData: Record[String, Any]
  
  var nextBatch: String | Null
  
  /**
    * The 'next_batch' result from /sync, which will become the 'since' token for the next call to /sync. Only present if state=PREPARED or state=SYNCING.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  /**
    * The 'since' token passed to /sync. null for the first successful sync since this client was started. Only present if state=PREPARED or state=SYNCING.
    */
  var oldSyncToken: js.UndefOr[String | Null] = js.undefined
  
  var roomData: Record[String, Any]
}
object SyncData {
  
  inline def apply(accountData: Record[String, Any], groupsData: Record[String, Any], roomData: Record[String, Any]): SyncData = {
    val __obj = js.Dynamic.literal(accountData = accountData.asInstanceOf[js.Any], groupsData = groupsData.asInstanceOf[js.Any], roomData = roomData.asInstanceOf[js.Any], nextBatch = null)
    __obj.asInstanceOf[SyncData]
  }
  
  extension [Self <: SyncData](x: Self) {
    
    inline def setAccountData(value: Record[String, Any]): Self = StObject.set(x, "accountData", value.asInstanceOf[js.Any])
    
    inline def setCatchingUp(value: Boolean): Self = StObject.set(x, "catchingUp", value.asInstanceOf[js.Any])
    
    inline def setCatchingUpUndefined: Self = StObject.set(x, "catchingUp", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
    
    inline def setGroupsData(value: Record[String, Any]): Self = StObject.set(x, "groupsData", value.asInstanceOf[js.Any])
    
    inline def setNextBatch(value: String): Self = StObject.set(x, "nextBatch", value.asInstanceOf[js.Any])
    
    inline def setNextBatchNull: Self = StObject.set(x, "nextBatch", null)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setOldSyncToken(value: String): Self = StObject.set(x, "oldSyncToken", value.asInstanceOf[js.Any])
    
    inline def setOldSyncTokenNull: Self = StObject.set(x, "oldSyncToken", null)
    
    inline def setOldSyncTokenUndefined: Self = StObject.set(x, "oldSyncToken", js.undefined)
    
    inline def setRoomData(value: Record[String, Any]): Self = StObject.set(x, "roomData", value.asInstanceOf[js.Any])
  }
}
