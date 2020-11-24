package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveResult extends js.Object {
  
  var fileProperties: js.Array[FileProperties] = js.native
  
  var id: String = js.native
  
  var messages: js.Array[RetrieveMessage] = js.native
  
  var zipFile: String = js.native
}
object RetrieveResult {
  
  @scala.inline
  def apply(
    fileProperties: js.Array[FileProperties],
    id: String,
    messages: js.Array[RetrieveMessage],
    zipFile: String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], zipFile = zipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveResult]
  }
  
  @scala.inline
  implicit class RetrieveResultOps[Self <: RetrieveResult] (val x: Self) extends AnyVal {
    
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
    def setFilePropertiesVarargs(value: FileProperties*): Self = this.set("fileProperties", js.Array(value :_*))
    
    @scala.inline
    def setFileProperties(value: js.Array[FileProperties]): Self = this.set("fileProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: RetrieveMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[RetrieveMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFile(value: String): Self = this.set("zipFile", value.asInstanceOf[js.Any])
  }
}
