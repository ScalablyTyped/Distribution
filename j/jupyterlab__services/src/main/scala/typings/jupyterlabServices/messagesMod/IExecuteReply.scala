package typings.jupyterlabServices.messagesMod

import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteReply
  extends StObject
     with IExecuteReplyBase {
  
  /**
    * A list of payload objects.
    * Payloads are considered deprecated.
    * The only requirement of each payload object is that it have a 'source'
    * key, which is a string classifying the payload (e.g. 'page').
    */
  var payload: js.UndefOr[js.Array[JSONObject]] = js.undefined
  
  /**
    * Results for the user_expressions.
    */
  var user_expressions: JSONObject
}
object IExecuteReply {
  
  inline def apply(user_expressions: JSONObject): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = "ok", user_expressions = user_expressions.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[IExecuteReply]
  }
  
  extension [Self <: IExecuteReply](x: Self) {
    
    inline def setPayload(value: js.Array[JSONObject]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: JSONObject*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setUser_expressions(value: JSONObject): Self = StObject.set(x, "user_expressions", value.asInstanceOf[js.Any])
  }
}
