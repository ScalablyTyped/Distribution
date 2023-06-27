package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgIconOptions
  extends StObject
     with IconOptions {
  
  var icon: js.UndefOr[Any] = js.undefined
}
object SvgIconOptions {
  
  inline def apply(): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SvgIconOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
