package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontIconOptions
  extends StObject
     with IconOptions {
  
  var icon: js.UndefOr[String] = js.undefined
}
object FontIconOptions {
  
  inline def apply(): FontIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontIconOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
