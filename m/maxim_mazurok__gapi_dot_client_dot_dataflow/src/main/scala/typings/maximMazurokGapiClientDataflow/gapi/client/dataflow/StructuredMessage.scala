package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuredMessage extends js.Object {
  
  /** Identifier for this message type. Used by external systems to internationalize or personalize message. */
  var messageKey: js.UndefOr[String] = js.native
  
  /** Human-readable version of message. */
  var messageText: js.UndefOr[String] = js.native
  
  /** The structured data associated with this message. */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.native
}
object StructuredMessage {
  
  @scala.inline
  def apply(): StructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredMessage]
  }
  
  @scala.inline
  implicit class StructuredMessageOps[Self <: StructuredMessage] (val x: Self) extends AnyVal {
    
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
    def setMessageKey(value: String): Self = this.set("messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageKey: Self = this.set("messageKey", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageText: Self = this.set("messageText", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Parameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
