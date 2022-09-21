package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerVersionHeader extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of macros in the container version.
    */
  var numMacros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of rules in the container version.
    */
  var numRules: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of tags in the container version.
    */
  var numTags: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of triggers in the container version.
    */
  var numTriggers: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of variables in the container version.
    */
  var numVariables: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainerVersionHeader {
  
  inline def apply(): SchemaContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersionHeader]
  }
  
  extension [Self <: SchemaContainerVersionHeader](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdNull: Self = StObject.set(x, "containerVersionId", null)
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumMacros(value: String): Self = StObject.set(x, "numMacros", value.asInstanceOf[js.Any])
    
    inline def setNumMacrosNull: Self = StObject.set(x, "numMacros", null)
    
    inline def setNumMacrosUndefined: Self = StObject.set(x, "numMacros", js.undefined)
    
    inline def setNumRules(value: String): Self = StObject.set(x, "numRules", value.asInstanceOf[js.Any])
    
    inline def setNumRulesNull: Self = StObject.set(x, "numRules", null)
    
    inline def setNumRulesUndefined: Self = StObject.set(x, "numRules", js.undefined)
    
    inline def setNumTags(value: String): Self = StObject.set(x, "numTags", value.asInstanceOf[js.Any])
    
    inline def setNumTagsNull: Self = StObject.set(x, "numTags", null)
    
    inline def setNumTagsUndefined: Self = StObject.set(x, "numTags", js.undefined)
    
    inline def setNumTriggers(value: String): Self = StObject.set(x, "numTriggers", value.asInstanceOf[js.Any])
    
    inline def setNumTriggersNull: Self = StObject.set(x, "numTriggers", null)
    
    inline def setNumTriggersUndefined: Self = StObject.set(x, "numTriggers", js.undefined)
    
    inline def setNumVariables(value: String): Self = StObject.set(x, "numVariables", value.asInstanceOf[js.Any])
    
    inline def setNumVariablesNull: Self = StObject.set(x, "numVariables", null)
    
    inline def setNumVariablesUndefined: Self = StObject.set(x, "numVariables", js.undefined)
  }
}
