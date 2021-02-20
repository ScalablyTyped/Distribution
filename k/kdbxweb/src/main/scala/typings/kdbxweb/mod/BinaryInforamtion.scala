package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryInforamtion extends StObject {
  
  var ref: String = js.native
  
  var value: ProtectedValue | ArrayBuffer = js.native
}
object BinaryInforamtion {
  
  @scala.inline
  def apply(ref: String, value: ProtectedValue | ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryInforamtion]
  }
  
  @scala.inline
  implicit class BinaryInforamtionMutableBuilder[Self <: BinaryInforamtion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ProtectedValue | ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
