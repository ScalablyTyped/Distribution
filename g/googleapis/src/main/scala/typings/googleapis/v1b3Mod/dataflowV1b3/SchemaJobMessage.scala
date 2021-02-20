package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A particular message pertaining to a Dataflow job.
  */
@js.native
trait SchemaJobMessage extends StObject {
  
  /**
    * Deprecated.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Importance level of the message.
    */
  var messageImportance: js.UndefOr[String] = js.native
  
  /**
    * The text of the message.
    */
  var messageText: js.UndefOr[String] = js.native
  
  /**
    * The timestamp of the message.
    */
  var time: js.UndefOr[String] = js.native
}
object SchemaJobMessage {
  
  @scala.inline
  def apply(): SchemaJobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMessage]
  }
  
  @scala.inline
  implicit class SchemaJobMessageMutableBuilder[Self <: SchemaJobMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessageImportance(value: String): Self = StObject.set(x, "messageImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageImportanceUndefined: Self = StObject.set(x, "messageImportance", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
