package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedInputStatic extends StObject {
  
  var defaults: MaskedInputDefaults = js.native
  
  def format(value: String, options: MaskedInputStaticDefaults): Boolean = js.native
  
  def isValid(value: String, options: MaskedInputStaticDefaults): Boolean = js.native
}
object MaskedInputStatic {
  
  @scala.inline
  def apply(
    defaults: MaskedInputDefaults,
    format: (String, MaskedInputStaticDefaults) => Boolean,
    isValid: (String, MaskedInputStaticDefaults) => Boolean
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], format = js.Any.fromFunction2(format), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[MaskedInputStatic]
  }
  
  @scala.inline
  implicit class MaskedInputStaticMutableBuilder[Self <: MaskedInputStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: MaskedInputDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: (String, MaskedInputStaticDefaults) => Boolean): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsValid(value: (String, MaskedInputStaticDefaults) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
  }
}
