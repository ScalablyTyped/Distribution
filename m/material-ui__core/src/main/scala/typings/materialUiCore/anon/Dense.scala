package typings.materialUiCore.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dense extends StObject {
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var disablePadding: js.UndefOr[Boolean] = js.undefined
  
  var subheader: js.UndefOr[ReactElement] = js.undefined
}
object Dense {
  
  inline def apply(): Dense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dense] (val x: Self) extends AnyVal {
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
    
    inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    
    inline def setSubheader(value: ReactElement): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
