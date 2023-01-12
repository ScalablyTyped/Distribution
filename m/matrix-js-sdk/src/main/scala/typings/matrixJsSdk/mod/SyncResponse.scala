package typings.matrixJsSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResponse extends StObject {
  
  var account_data: Record[String, Any]
  
  var groups: Record[String, Any]
  
  var next_batch: String | Null
  
  var rooms: Record[String, Any]
}
object SyncResponse {
  
  inline def apply(account_data: Record[String, Any], groups: Record[String, Any], rooms: Record[String, Any]): SyncResponse = {
    val __obj = js.Dynamic.literal(account_data = account_data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], next_batch = null)
    __obj.asInstanceOf[SyncResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResponse] (val x: Self) extends AnyVal {
    
    inline def setAccount_data(value: Record[String, Any]): Self = StObject.set(x, "account_data", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: Record[String, Any]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setNext_batch(value: String): Self = StObject.set(x, "next_batch", value.asInstanceOf[js.Any])
    
    inline def setNext_batchNull: Self = StObject.set(x, "next_batch", null)
    
    inline def setRooms(value: Record[String, Any]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
  }
}
