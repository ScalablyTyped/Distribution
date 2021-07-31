package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A context rule provides information about the context for an individual API
  * element.
  */
trait SchemaContextRule extends StObject {
  
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from client to backend.
    */
  var allowedRequestExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from backend to client.
    */
  var allowedResponseExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of full type names of provided contexts.
    */
  var provided: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of full type names of requested contexts.
    */
  var requested: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object SchemaContextRule {
  
  @scala.inline
  def apply(): SchemaContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextRule]
  }
  
  @scala.inline
  implicit class SchemaContextRuleMutableBuilder[Self <: SchemaContextRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedRequestExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedRequestExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedRequestExtensionsUndefined: Self = StObject.set(x, "allowedRequestExtensions", js.undefined)
    
    @scala.inline
    def setAllowedRequestExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedRequestExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedResponseExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedResponseExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedResponseExtensionsUndefined: Self = StObject.set(x, "allowedResponseExtensions", js.undefined)
    
    @scala.inline
    def setAllowedResponseExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedResponseExtensions", js.Array(value :_*))
    
    @scala.inline
    def setProvided(value: js.Array[String]): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedUndefined: Self = StObject.set(x, "provided", js.undefined)
    
    @scala.inline
    def setProvidedVarargs(value: String*): Self = StObject.set(x, "provided", js.Array(value :_*))
    
    @scala.inline
    def setRequested(value: js.Array[String]): Self = StObject.set(x, "requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUndefined: Self = StObject.set(x, "requested", js.undefined)
    
    @scala.inline
    def setRequestedVarargs(value: String*): Self = StObject.set(x, "requested", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
