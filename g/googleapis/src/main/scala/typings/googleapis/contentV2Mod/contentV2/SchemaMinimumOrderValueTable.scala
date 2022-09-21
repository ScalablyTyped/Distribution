package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMinimumOrderValueTable extends StObject {
  
  var storeCodeSetWithMovs: js.UndefOr[js.Array[SchemaMinimumOrderValueTableStoreCodeSetWithMov]] = js.undefined
}
object SchemaMinimumOrderValueTable {
  
  inline def apply(): SchemaMinimumOrderValueTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMinimumOrderValueTable]
  }
  
  extension [Self <: SchemaMinimumOrderValueTable](x: Self) {
    
    inline def setStoreCodeSetWithMovs(value: js.Array[SchemaMinimumOrderValueTableStoreCodeSetWithMov]): Self = StObject.set(x, "storeCodeSetWithMovs", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeSetWithMovsUndefined: Self = StObject.set(x, "storeCodeSetWithMovs", js.undefined)
    
    inline def setStoreCodeSetWithMovsVarargs(value: SchemaMinimumOrderValueTableStoreCodeSetWithMov*): Self = StObject.set(x, "storeCodeSetWithMovs", js.Array(value*))
  }
}
