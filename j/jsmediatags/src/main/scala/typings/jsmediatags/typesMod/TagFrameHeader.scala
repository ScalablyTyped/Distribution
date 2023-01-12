package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFrameHeader extends StObject {
  
  var flags: js.UndefOr[TagFrameFlags] = js.undefined
  
  var headerSize: Double
  
  var id: String
  
  var size: Double
}
object TagFrameHeader {
  
  inline def apply(headerSize: Double, id: String, size: Double): TagFrameHeader = {
    val __obj = js.Dynamic.literal(headerSize = headerSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagFrameHeader] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: TagFrameFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
