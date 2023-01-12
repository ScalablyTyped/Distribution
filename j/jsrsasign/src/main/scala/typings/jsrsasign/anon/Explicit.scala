package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explicit extends StObject {
  
  var explicit: Boolean
  
  var hex: String
  
  var tag: String
}
object Explicit {
  
  inline def apply(explicit: Boolean, hex: String, tag: String): Explicit = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explicit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Explicit] (val x: Self) extends AnyVal {
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
