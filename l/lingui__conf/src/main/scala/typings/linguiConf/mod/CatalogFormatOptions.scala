package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogFormatOptions extends StObject {
  
  var disableSelectWarning: js.UndefOr[Boolean] = js.undefined
  
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  
  var origins: js.UndefOr[Boolean] = js.undefined
}
object CatalogFormatOptions {
  
  inline def apply(): CatalogFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableSelectWarning(value: Boolean): Self = StObject.set(x, "disableSelectWarning", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectWarningUndefined: Self = StObject.set(x, "disableSelectWarning", js.undefined)
    
    inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    inline def setOrigins(value: Boolean): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
  }
}
