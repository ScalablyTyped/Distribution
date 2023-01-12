package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLoading
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var cssClass: js.UndefOr[Any] = js.undefined
  
  var includeVerticalOffset: js.UndefOr[Boolean] = js.undefined
}
object IgLoading {
  
  inline def apply(): IgLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLoading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgLoading] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: Any): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setIncludeVerticalOffset(value: Boolean): Self = StObject.set(x, "includeVerticalOffset", value.asInstanceOf[js.Any])
    
    inline def setIncludeVerticalOffsetUndefined: Self = StObject.set(x, "includeVerticalOffset", js.undefined)
  }
}
