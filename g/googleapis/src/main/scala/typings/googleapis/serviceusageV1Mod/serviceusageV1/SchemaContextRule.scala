package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContextRule extends StObject {
  
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
    */
  var allowedRequestExtensions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
    */
  var allowedResponseExtensions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of full type names of provided contexts.
    */
  var provided: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of full type names of requested contexts.
    */
  var requested: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Selects the methods to which this rule applies. Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String | Null] = js.undefined
}
object SchemaContextRule {
  
  inline def apply(): SchemaContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextRule]
  }
  
  extension [Self <: SchemaContextRule](x: Self) {
    
    inline def setAllowedRequestExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedRequestExtensionsNull: Self = StObject.set(x, "allowedRequestExtensions", null)
    
    inline def setAllowedRequestExtensionsUndefined: Self = StObject.set(x, "allowedRequestExtensions", js.undefined)
    
    inline def setAllowedRequestExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedRequestExtensions", js.Array(value*))
    
    inline def setAllowedResponseExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedResponseExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedResponseExtensionsNull: Self = StObject.set(x, "allowedResponseExtensions", null)
    
    inline def setAllowedResponseExtensionsUndefined: Self = StObject.set(x, "allowedResponseExtensions", js.undefined)
    
    inline def setAllowedResponseExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedResponseExtensions", js.Array(value*))
    
    inline def setProvided(value: js.Array[String]): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
    
    inline def setProvidedNull: Self = StObject.set(x, "provided", null)
    
    inline def setProvidedUndefined: Self = StObject.set(x, "provided", js.undefined)
    
    inline def setProvidedVarargs(value: String*): Self = StObject.set(x, "provided", js.Array(value*))
    
    inline def setRequested(value: js.Array[String]): Self = StObject.set(x, "requested", value.asInstanceOf[js.Any])
    
    inline def setRequestedNull: Self = StObject.set(x, "requested", null)
    
    inline def setRequestedUndefined: Self = StObject.set(x, "requested", js.undefined)
    
    inline def setRequestedVarargs(value: String*): Self = StObject.set(x, "requested", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
