package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Built-in variables are a special category of variables that are pre-created
  * and non-customizable. They provide common functionality like accessing
  * propeties of the gtm data layer, monitoring clicks, or accessing elements
  * of a page URL.
  */
trait SchemaBuiltInVariable extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the built-in variable to be used to refer to the built-in
    * variable.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * GTM BuiltInVariable&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Type of built-in variable.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.undefined
}
object SchemaBuiltInVariable {
  
  @scala.inline
  def apply(): SchemaBuiltInVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuiltInVariable]
  }
  
  @scala.inline
  implicit class SchemaBuiltInVariableMutableBuilder[Self <: SchemaBuiltInVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
