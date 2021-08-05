package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryInforamtion extends StObject {
  
  var ref: String
  
  var value: ProtectedValue | ArrayBuffer
}
object BinaryInforamtion {
  
  inline def apply(ref: String, value: ProtectedValue | ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryInforamtion]
  }
  
  extension [Self <: BinaryInforamtion](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ProtectedValue | ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
