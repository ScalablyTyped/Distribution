package typings.knockoutEditables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// extend ko global
trait KnockoutStatic extends StObject {
  
  def editable(viewModel: js.Any): Unit
  def editable(viewModel: js.Any, autoInit: Boolean): Unit
  @JSName("editable")
  var editable_Original: KnockoutEditableStatic
}
object KnockoutStatic {
  
  @scala.inline
  def apply(editable: KnockoutEditableStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditable(value: KnockoutEditableStatic): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
  }
}
