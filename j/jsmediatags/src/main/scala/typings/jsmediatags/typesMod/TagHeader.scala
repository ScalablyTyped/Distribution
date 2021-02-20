package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagHeader extends StObject {
  
  var flags: TagHeaderFlags = js.native
  
  var major: Double = js.native
  
  var revision: Double = js.native
  
  var size: Double = js.native
  
  var version: String = js.native
}
object TagHeader {
  
  @scala.inline
  def apply(flags: TagHeaderFlags, major: Double, revision: Double, size: Double, version: String): TagHeader = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeader]
  }
  
  @scala.inline
  implicit class TagHeaderMutableBuilder[Self <: TagHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: TagHeaderFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
