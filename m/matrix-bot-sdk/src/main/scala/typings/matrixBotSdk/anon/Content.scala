package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  /**
    * The content of the event.
    */
  var content: Any
  
  /**
    * The state_key of the state event. Defaults to an empty string.
    */
  var state_key: js.UndefOr[String] = js.undefined
  
  /**
    * The type of event to send.
    */
  var `type`: String
}
object Content {
  
  inline def apply(content: Any, `type`: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
    
    inline def setState_keyUndefined: Self = StObject.set(x, "state_key", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
