package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractedMessage extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var message: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[
    js.Tuple3[/* filename */ String, /* line */ Double, /* column */ js.UndefOr[Double]]
  ] = js.undefined
}
object ExtractedMessage {
  
  inline def apply(id: String): ExtractedMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractedMessage] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOrigin(value: js.Tuple3[/* filename */ String, /* line */ Double, /* column */ js.UndefOr[Double]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
