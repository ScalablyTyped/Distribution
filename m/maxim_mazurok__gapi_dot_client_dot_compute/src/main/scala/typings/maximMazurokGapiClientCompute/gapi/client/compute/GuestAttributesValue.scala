package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestAttributesValue extends StObject {
  
  var items: js.UndefOr[js.Array[GuestAttributesEntry]] = js.undefined
}
object GuestAttributesValue {
  
  @scala.inline
  def apply(): GuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAttributesValue]
  }
  
  @scala.inline
  implicit class GuestAttributesValueMutableBuilder[Self <: GuestAttributesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GuestAttributesEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GuestAttributesEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
