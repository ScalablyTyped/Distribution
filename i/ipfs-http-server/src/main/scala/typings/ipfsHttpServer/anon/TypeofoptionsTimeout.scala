package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsTimeout extends StObject {
  
  val timeout: Typeoftimeout = js.native
  
  val validate: Typeofvalidate = js.native
}
object TypeofoptionsTimeout {
  
  @scala.inline
  def apply(timeout: Typeoftimeout, validate: Typeofvalidate): TypeofoptionsTimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsTimeout]
  }
  
  @scala.inline
  implicit class TypeofoptionsTimeoutMutableBuilder[Self <: TypeofoptionsTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Typeoftimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
