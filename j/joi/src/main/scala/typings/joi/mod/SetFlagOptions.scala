package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFlagOptions extends StObject {
  
  @JSName("clone")
  var clone_FSetFlagOptions: Boolean = js.native
}
object SetFlagOptions {
  
  @scala.inline
  def apply(clone_ : Boolean): SetFlagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFlagOptions]
  }
  
  @scala.inline
  implicit class SetFlagOptionsMutableBuilder[Self <: SetFlagOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
  }
}
