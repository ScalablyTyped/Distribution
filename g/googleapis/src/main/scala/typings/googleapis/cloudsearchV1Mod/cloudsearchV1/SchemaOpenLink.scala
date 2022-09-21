package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOpenLink extends StObject {
  
  /**
    * Next available ID: 5
    */
  var loadIndicator: js.UndefOr[String | Null] = js.undefined
  
  var onClose: js.UndefOr[String | Null] = js.undefined
  
  var openAs: js.UndefOr[String | Null] = js.undefined
  
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaOpenLink {
  
  inline def apply(): SchemaOpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpenLink]
  }
  
  extension [Self <: SchemaOpenLink](x: Self) {
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorNull: Self = StObject.set(x, "loadIndicator", null)
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setOnClose(value: String): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpenAs(value: String): Self = StObject.set(x, "openAs", value.asInstanceOf[js.Any])
    
    inline def setOpenAsNull: Self = StObject.set(x, "openAs", null)
    
    inline def setOpenAsUndefined: Self = StObject.set(x, "openAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
