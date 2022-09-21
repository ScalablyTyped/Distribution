package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMinimumOrderValueTableStoreCodeSetWithMov extends StObject {
  
  /**
    * A list of unique store codes or empty for the catch all.
    */
  var storeCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The minimum order value for the given stores.
    */
  var value: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaMinimumOrderValueTableStoreCodeSetWithMov {
  
  inline def apply(): SchemaMinimumOrderValueTableStoreCodeSetWithMov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMinimumOrderValueTableStoreCodeSetWithMov]
  }
  
  extension [Self <: SchemaMinimumOrderValueTableStoreCodeSetWithMov](x: Self) {
    
    inline def setStoreCodes(value: js.Array[String]): Self = StObject.set(x, "storeCodes", value.asInstanceOf[js.Any])
    
    inline def setStoreCodesNull: Self = StObject.set(x, "storeCodes", null)
    
    inline def setStoreCodesUndefined: Self = StObject.set(x, "storeCodes", js.undefined)
    
    inline def setStoreCodesVarargs(value: String*): Self = StObject.set(x, "storeCodes", js.Array(value*))
    
    inline def setValue(value: SchemaPrice): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
