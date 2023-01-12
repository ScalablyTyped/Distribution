package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsTimeCyclesOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object NavigationBindingsTimeCyclesOptions {
  
  inline def apply(): NavigationBindingsTimeCyclesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsTimeCyclesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBindingsTimeCyclesOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
