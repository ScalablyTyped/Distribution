package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestAttributesEntry extends StObject {
  
  /** Key for the guest attribute entry. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Namespace for the guest attribute entry. */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** Value for the guest attribute entry. */
  var value: js.UndefOr[String] = js.undefined
}
object GuestAttributesEntry {
  
  inline def apply(): GuestAttributesEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAttributesEntry]
  }
  
  extension [Self <: GuestAttributesEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
