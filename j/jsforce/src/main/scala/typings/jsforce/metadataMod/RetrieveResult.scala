package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveResult extends StObject {
  
  var fileProperties: js.Array[FileProperties]
  
  var id: String
  
  var messages: js.Array[RetrieveMessage]
  
  var zipFile: String
}
object RetrieveResult {
  
  inline def apply(
    fileProperties: js.Array[FileProperties],
    id: String,
    messages: js.Array[RetrieveMessage],
    zipFile: String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], zipFile = zipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveResult]
  }
  
  extension [Self <: RetrieveResult](x: Self) {
    
    inline def setFileProperties(value: js.Array[FileProperties]): Self = StObject.set(x, "fileProperties", value.asInstanceOf[js.Any])
    
    inline def setFilePropertiesVarargs(value: FileProperties*): Self = StObject.set(x, "fileProperties", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[RetrieveMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: RetrieveMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setZipFile(value: String): Self = StObject.set(x, "zipFile", value.asInstanceOf[js.Any])
  }
}
