package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasignBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitObj extends StObject {
  
  var explicit: `true`
  
  var obj: Any
  
  var tag: String
}
object ExplicitObj {
  
  inline def apply(obj: Any, tag: String): ExplicitObj = {
    val __obj = js.Dynamic.literal(explicit = true, obj = obj.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplicitObj] (val x: Self) extends AnyVal {
    
    inline def setExplicit(value: `true`): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setObj(value: Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
