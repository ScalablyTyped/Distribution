package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerUIParam extends StObject {
  
  var value: Double
}
object SpinnerUIParam {
  
  inline def apply(value: Double): SpinnerUIParam = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpinnerUIParam] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
