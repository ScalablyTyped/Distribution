package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingTarget extends StObject {
  
  var options: js.Any
  
  var source: js.Any
  
  var target: js.Any
}
object BindingTarget {
  
  @scala.inline
  def apply(options: js.Any, source: js.Any, target: js.Any): BindingTarget = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingTarget]
  }
  
  @scala.inline
  implicit class BindingTargetMutableBuilder[Self <: BindingTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
