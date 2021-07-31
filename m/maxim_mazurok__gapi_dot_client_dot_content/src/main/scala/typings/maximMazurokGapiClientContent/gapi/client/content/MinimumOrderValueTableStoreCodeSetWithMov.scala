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
  
  @scala.inline
  def apply(): MinimumOrderValueTableStoreCodeSetWithMov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumOrderValueTableStoreCodeSetWithMov]
  }
  
  @scala.inline
  implicit class MinimumOrderValueTableStoreCodeSetWithMovMutableBuilder[Self <: MinimumOrderValueTableStoreCodeSetWithMov] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoreCodes(value: js.Array[String]): Self = StObject.set(x, "storeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodesUndefined: Self = StObject.set(x, "storeCodes", js.undefined)
    
    @scala.inline
    def setStoreCodesVarargs(value: String*): Self = StObject.set(x, "storeCodes", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Price): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
