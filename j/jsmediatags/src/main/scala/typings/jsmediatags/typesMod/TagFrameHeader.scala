package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFrameHeader extends StObject {
  
  var flags: js.UndefOr[TagFrameFlags] = js.native
  
  var headerSize: Double = js.native
  
  var id: String = js.native
  
  var size: Double = js.native
}
object TagFrameHeader {
  
  @scala.inline
  def apply(headerSize: Double, id: String, size: Double): TagFrameHeader = {
    val __obj = js.Dynamic.literal(headerSize = headerSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameHeader]
  }
  
  @scala.inline
  implicit class TagFrameHeaderMutableBuilder[Self <: TagFrameHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: TagFrameFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
