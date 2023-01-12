package typings.kahootJsUpdated.mod

import typings.kahootJsUpdated.anon.Timetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveEventTimetrack extends StObject {
  
  var channel: String
  
  var ext: Timetrack
  
  var id: String
  
  /** Whether the request was successful */
  var successful: Boolean
}
object LiveEventTimetrack {
  
  inline def apply(channel: String, ext: Timetrack, id: String, successful: Boolean): LiveEventTimetrack = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveEventTimetrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveEventTimetrack] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setExt(value: Timetrack): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
  }
}
