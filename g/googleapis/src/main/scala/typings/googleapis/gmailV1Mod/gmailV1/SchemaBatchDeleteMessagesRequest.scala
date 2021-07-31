package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteMessagesRequest extends StObject {
  
  /**
    * The IDs of the messages to delete.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBatchDeleteMessagesRequest {
  
  @scala.inline
  def apply(): SchemaBatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteMessagesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchDeleteMessagesRequestMutableBuilder[Self <: SchemaBatchDeleteMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
