package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumOrderValueTableStoreCodeSetWithMov extends StObject {
  
  /** A list of unique store codes or empty for the catch all. */
  var storeCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The minimum order value for the given stores. */
  var value: js.UndefOr[Price] = js.undefined
}
object MinimumOrderValueTableStoreCodeSetWithMov {
  
  inline def apply(): MinimumOrderValueTableStoreCodeSetWithMov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumOrderValueTableStoreCodeSetWithMov]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimumOrderValueTableStoreCodeSetWithMov] (val x: Self) extends AnyVal {
    
    inline def setStoreCodes(value: js.Array[String]): Self = StObject.set(x, "storeCodes", value.asInstanceOf[js.Any])
    
    inline def setStoreCodesUndefined: Self = StObject.set(x, "storeCodes", js.undefined)
    
    inline def setStoreCodesVarargs(value: String*): Self = StObject.set(x, "storeCodes", js.Array(value*))
    
    inline def setValue(value: Price): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
