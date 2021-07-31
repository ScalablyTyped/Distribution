package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container Version Header.
  */
trait SchemaContainerVersionHeader extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Number of macros in the container version.
    */
  var numMacros: js.UndefOr[String] = js.undefined
  
  /**
    * Number of rules in the container version.
    */
  var numRules: js.UndefOr[String] = js.undefined
  
  /**
    * Number of tags in the container version.
    */
  var numTags: js.UndefOr[String] = js.undefined
  
  /**
    * Number of triggers in the container version.
    */
  var numTriggers: js.UndefOr[String] = js.undefined
  
  /**
    * Number of variables in the container version.
    */
  var numVariables: js.UndefOr[String] = js.undefined
}
object SchemaContainerVersionHeader {
  
  @scala.inline
  def apply(): SchemaContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersionHeader]
  }
  
  @scala.inline
  implicit class SchemaContainerVersionHeaderMutableBuilder[Self <: SchemaContainerVersionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumMacros(value: String): Self = StObject.set(x, "numMacros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumMacrosUndefined: Self = StObject.set(x, "numMacros", js.undefined)
    
    @scala.inline
    def setNumRules(value: String): Self = StObject.set(x, "numRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRulesUndefined: Self = StObject.set(x, "numRules", js.undefined)
    
    @scala.inline
    def setNumTags(value: String): Self = StObject.set(x, "numTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTagsUndefined: Self = StObject.set(x, "numTags", js.undefined)
    
    @scala.inline
    def setNumTriggers(value: String): Self = StObject.set(x, "numTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTriggersUndefined: Self = StObject.set(x, "numTriggers", js.undefined)
    
    @scala.inline
    def setNumVariables(value: String): Self = StObject.set(x, "numVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumVariablesUndefined: Self = StObject.set(x, "numVariables", js.undefined)
  }
}
