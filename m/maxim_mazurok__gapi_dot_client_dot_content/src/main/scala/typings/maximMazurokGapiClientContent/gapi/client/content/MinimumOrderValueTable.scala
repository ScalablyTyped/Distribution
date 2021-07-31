package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumOrderValueTable extends StObject {
  
  var storeCodeSetWithMovs: js.UndefOr[js.Array[MinimumOrderValueTableStoreCodeSetWithMov]] = js.undefined
}
object MinimumOrderValueTable {
  
  @scala.inline
  def apply(): MinimumOrderValueTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumOrderValueTable]
  }
  
  @scala.inline
  implicit class MinimumOrderValueTableMutableBuilder[Self <: MinimumOrderValueTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoreCodeSetWithMovs(value: js.Array[MinimumOrderValueTableStoreCodeSetWithMov]): Self = StObject.set(x, "storeCodeSetWithMovs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeSetWithMovsUndefined: Self = StObject.set(x, "storeCodeSetWithMovs", js.undefined)
    
    @scala.inline
    def setStoreCodeSetWithMovsVarargs(value: MinimumOrderValueTableStoreCodeSetWithMov*): Self = StObject.set(x, "storeCodeSetWithMovs", js.Array(value :_*))
  }
}
