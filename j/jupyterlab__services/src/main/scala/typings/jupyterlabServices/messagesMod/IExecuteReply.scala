package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
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
  implicit class IExecuteReplyOps[Self <: IExecuteReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUser_expressions(value: JSONObject): Self = this.set("user_expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVarargs(value: JSONObject*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: js.Array[JSONObject]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
