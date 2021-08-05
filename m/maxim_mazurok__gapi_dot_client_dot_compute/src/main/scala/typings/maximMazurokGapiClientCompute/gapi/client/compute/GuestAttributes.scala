package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestAttributes extends StObject {
  
  /** [Output Only] Type of the resource. Always compute#guestAttributes for guest attributes entry. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The path to be queried. This can be the default namespace ('/') or a nested namespace ('/\/') or a specified key ('/\/\') */
  var queryPath: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The value of the requested queried path. */
  var queryValue: js.UndefOr[GuestAttributesValue] = js.undefined
  
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The key to search for. */
  var variableKey: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The value found for the requested key. */
  var variableValue: js.UndefOr[String] = js.undefined
}
object GuestAttributes {
  
  inline def apply(): GuestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAttributes]
  }
  
  extension [Self <: GuestAttributes](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    inline def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    inline def setQueryValue(value: GuestAttributesValue): Self = StObject.set(x, "queryValue", value.asInstanceOf[js.Any])
    
    inline def setQueryValueUndefined: Self = StObject.set(x, "queryValue", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setVariableKey(value: String): Self = StObject.set(x, "variableKey", value.asInstanceOf[js.Any])
    
    inline def setVariableKeyUndefined: Self = StObject.set(x, "variableKey", js.undefined)
    
    inline def setVariableValue(value: String): Self = StObject.set(x, "variableValue", value.asInstanceOf[js.Any])
    
    inline def setVariableValueUndefined: Self = StObject.set(x, "variableValue", js.undefined)
  }
}
