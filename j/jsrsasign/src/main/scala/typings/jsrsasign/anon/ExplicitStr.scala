package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasignBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitStr extends StObject {
  
  var explicit: `false`
  
  var str: String
  
  var tag: String
}
object ExplicitStr {
  
  inline def apply(str: String, tag: String): ExplicitStr = {
    val __obj = js.Dynamic.literal(explicit = false, str = str.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitStr]
  }
  
  extension [Self <: ExplicitStr](x: Self) {
    
    inline def setExplicit(value: `false`): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
