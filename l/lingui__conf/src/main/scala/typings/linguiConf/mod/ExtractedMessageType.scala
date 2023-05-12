package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractedMessageType[Extra] extends StObject {
  
  var comments: js.UndefOr[js.Array[String]] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * the generic field where
    * formatters can store additional data
    */
  var extra: js.UndefOr[Extra] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var obsolete: js.UndefOr[Boolean] = js.undefined
  
  var origin: js.UndefOr[js.Array[MessageOrigin]] = js.undefined
}
object ExtractedMessageType {
  
  inline def apply[Extra](): ExtractedMessageType[Extra] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractedMessageType[Extra]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractedMessageType[?], Extra] (val x: Self & ExtractedMessageType[Extra]) extends AnyVal {
    
    inline def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExtra(value: Extra): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setObsolete(value: Boolean): Self = StObject.set(x, "obsolete", value.asInstanceOf[js.Any])
    
    inline def setObsoleteUndefined: Self = StObject.set(x, "obsolete", js.undefined)
    
    inline def setOrigin(value: js.Array[MessageOrigin]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: MessageOrigin*): Self = StObject.set(x, "origin", js.Array(value*))
  }
}
