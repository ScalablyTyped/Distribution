package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invalid extends StObject {
  
  var invalid: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[String] = js.native
}
object Invalid {
  
  @scala.inline
  def apply(): Invalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalid]
  }
  
  @scala.inline
  implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
