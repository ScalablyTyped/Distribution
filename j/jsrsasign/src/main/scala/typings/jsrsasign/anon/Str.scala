package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Str extends StObject {
  
  var str: String
}
object Str {
  
  inline def apply(str: String): Str = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Str]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Str] (val x: Self) extends AnyVal {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
