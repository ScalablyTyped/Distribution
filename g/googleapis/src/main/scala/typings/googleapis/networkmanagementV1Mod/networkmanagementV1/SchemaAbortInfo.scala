package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbortInfo extends StObject {
  
  /**
    * Causes that the analysis is aborted.
    */
  var cause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of project IDs that the user has specified in the request but does not have permission to access network configs. Analysis is aborted in this case with the PERMISSION_DENIED cause.
    */
  var projectsMissingPermission: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URI of the resource that caused the abort.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAbortInfo {
  
  inline def apply(): SchemaAbortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbortInfo]
  }
  
  extension [Self <: SchemaAbortInfo](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseNull: Self = StObject.set(x, "cause", null)
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setProjectsMissingPermission(value: js.Array[String]): Self = StObject.set(x, "projectsMissingPermission", value.asInstanceOf[js.Any])
    
    inline def setProjectsMissingPermissionNull: Self = StObject.set(x, "projectsMissingPermission", null)
    
    inline def setProjectsMissingPermissionUndefined: Self = StObject.set(x, "projectsMissingPermission", js.undefined)
    
    inline def setProjectsMissingPermissionVarargs(value: String*): Self = StObject.set(x, "projectsMissingPermission", js.Array(value*))
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
