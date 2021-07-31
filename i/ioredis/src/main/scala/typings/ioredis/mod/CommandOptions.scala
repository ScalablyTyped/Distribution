package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandOptions extends StObject {
  
  var errorStack: js.UndefOr[String] = js.undefined
  
  var keyPrefix: js.UndefOr[String] = js.undefined
  
  var replyEncoding: js.UndefOr[String | Null] = js.undefined
}
object CommandOptions {
  
  @scala.inline
  def apply(): CommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandOptions]
  }
  
  @scala.inline
  implicit class CommandOptionsMutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorStack(value: String): Self = StObject.set(x, "errorStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStackUndefined: Self = StObject.set(x, "errorStack", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    @scala.inline
    def setReplyEncoding(value: String): Self = StObject.set(x, "replyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyEncodingNull: Self = StObject.set(x, "replyEncoding", null)
    
    @scala.inline
    def setReplyEncodingUndefined: Self = StObject.set(x, "replyEncoding", js.undefined)
  }
}
