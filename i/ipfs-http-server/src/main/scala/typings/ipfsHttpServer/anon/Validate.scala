package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validate extends StObject {
  
  var validate: Options = js.native
}
object Validate {
  
  @scala.inline
  def apply(validate: Options): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  
  @scala.inline
  implicit class ValidateMutableBuilder[Self <: Validate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Options): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
