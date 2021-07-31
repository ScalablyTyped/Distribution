package typings.knockoutViewmodel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extend ko global
trait KnockoutStatic extends StObject {
  
  var viewmodel: KnockoutViewModelStatic
}
object KnockoutStatic {
  
  @scala.inline
  def apply(viewmodel: KnockoutViewModelStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(viewmodel = viewmodel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewmodel(value: KnockoutViewModelStatic): Self = StObject.set(x, "viewmodel", value.asInstanceOf[js.Any])
  }
}
