package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageID extends StObject {
  
  var messageID: String
}
object MessageID {
  
  inline def apply(messageID: String): MessageID = {
    val __obj = js.Dynamic.literal(messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageID] (val x: Self) extends AnyVal {
    
    inline def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
  }
}
