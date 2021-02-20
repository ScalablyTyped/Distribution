package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutateRegisterOptions extends StObject {
  
  var family: js.UndefOr[js.Any] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
}
object MutateRegisterOptions {
  
  @scala.inline
  def apply(): MutateRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateRegisterOptions]
  }
  
  @scala.inline
  implicit class MutateRegisterOptionsMutableBuilder[Self <: MutateRegisterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: js.Any): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
