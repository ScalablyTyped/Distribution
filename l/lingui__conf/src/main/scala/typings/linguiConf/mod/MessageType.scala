package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageType[Extra]
  extends StObject
     with ExtractedMessageType[Extra] {
  
  var translation: String
}
object MessageType {
  
  inline def apply[Extra](translation: String): MessageType[Extra] = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType[Extra]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageType[?], Extra] (val x: Self & MessageType[Extra]) extends AnyVal {
    
    inline def setTranslation(value: String): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
