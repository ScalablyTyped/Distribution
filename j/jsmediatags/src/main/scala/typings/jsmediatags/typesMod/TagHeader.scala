package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagHeader extends StObject {
  
  var flags: TagHeaderFlags
  
  var major: Double
  
  var revision: Double
  
  var size: Double
  
  var version: String
}
object TagHeader {
  
  inline def apply(flags: TagHeaderFlags, major: Double, revision: Double, size: Double, version: String): TagHeader = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeader]
  }
  
  extension [Self <: TagHeader](x: Self) {
    
    inline def setFlags(value: TagHeaderFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
