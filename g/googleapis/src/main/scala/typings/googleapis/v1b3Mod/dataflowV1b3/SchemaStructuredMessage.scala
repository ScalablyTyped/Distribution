package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rich message format, including a human readable string, a key for
  * identifying the message, and structured data associated with the message
  * for programmatic consumption.
  */
trait SchemaStructuredMessage extends StObject {
  
  /**
    * Identifier for this message type.  Used by external systems to
    * internationalize or personalize message.
    */
  var messageKey: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable version of message.
    */
  var messageText: js.UndefOr[String] = js.undefined
  
  /**
    * The structured data associated with this message.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
}
object SchemaStructuredMessage {
  
  @scala.inline
  def apply(): SchemaStructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredMessage]
  }
  
  @scala.inline
  implicit class SchemaStructuredMessageMutableBuilder[Self <: SchemaStructuredMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
