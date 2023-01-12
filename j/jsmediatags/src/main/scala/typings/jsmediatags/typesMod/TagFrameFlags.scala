package typings.jsmediatags.typesMod

import typings.jsmediatags.anon.Compression
import typings.jsmediatags.anon.Filealterpreservation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFrameFlags extends StObject {
  
  var format: Compression
  
  var message: Filealterpreservation
}
object TagFrameFlags {
  
  inline def apply(format: Compression, message: Filealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagFrameFlags] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: Compression): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Filealterpreservation): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
