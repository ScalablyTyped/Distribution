package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Obj extends StObject {
  
  var obj: Any
}
object Obj {
  
  inline def apply(obj: Any): Obj = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Obj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Obj] (val x: Self) extends AnyVal {
    
    inline def setObj(value: Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
  }
}
