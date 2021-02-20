package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validate extends StObject {
  
  var validate: Boolean = js.native
}
object Validate {
  
  @scala.inline
  def apply(validate: Boolean): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  
  @scala.inline
  implicit class ValidateMutableBuilder[Self <: Validate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
