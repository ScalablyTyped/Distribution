package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Throws extends StObject {
  
  var throws: Boolean = js.native
  
  var validate: Boolean = js.native
}
object Throws {
  
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): Throws = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throws]
  }
  
  @scala.inline
  implicit class ThrowsMutableBuilder[Self <: Throws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
