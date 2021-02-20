package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteReply
  extends IExecuteCount
     with IReplyOkContent {
  
  /**
    * A list of payload objects.
    * Payloads are considered deprecated.
    * The only requirement of each payload object is that it have a 'source'
    * key, which is a string classifying the payload (e.g. 'page').
    */
  var payload: js.UndefOr[js.Array[JSONObject]] = js.native
  
  /**
    * Results for the user_expressions.
    */
  var user_expressions: JSONObject = js.native
}
object IExecuteReply {
  
  @scala.inline
  def apply(status: ok, user_expressions: JSONObject): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_expressions = user_expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
  
  @scala.inline
  implicit class IExecuteReplyMutableBuilder[Self <: IExecuteReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Array[JSONObject]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: JSONObject*): Self = StObject.set(x, "payload", js.Array(value :_*))
    
    @scala.inline
    def setUser_expressions(value: JSONObject): Self = StObject.set(x, "user_expressions", value.asInstanceOf[js.Any])
  }
}
