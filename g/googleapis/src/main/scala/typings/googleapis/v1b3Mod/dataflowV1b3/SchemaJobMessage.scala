package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A particular message pertaining to a Dataflow job.
  */
trait SchemaJobMessage extends StObject {
  
  /**
    * Deprecated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Importance level of the message.
    */
  var messageImportance: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the message.
    */
  var messageText: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the message.
    */
  var time: js.UndefOr[String] = js.undefined
}
object SchemaJobMessage {
  
  inline def apply(): SchemaJobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMessage]
  }
  
  extension [Self <: SchemaJobMessage](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessageImportance(value: String): Self = StObject.set(x, "messageImportance", value.asInstanceOf[js.Any])
    
    inline def setMessageImportanceUndefined: Self = StObject.set(x, "messageImportance", js.undefined)
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
