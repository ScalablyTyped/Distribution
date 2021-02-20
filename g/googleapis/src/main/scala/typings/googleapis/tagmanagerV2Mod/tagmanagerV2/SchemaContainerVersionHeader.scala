package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container Version Header.
  */
@js.native
trait SchemaContainerVersionHeader extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Number of custom templates in the container version.
    */
  var numCustomTemplates: js.UndefOr[String] = js.native
  
  /**
    * Number of macros in the container version.
    */
  var numMacros: js.UndefOr[String] = js.native
  
  /**
    * Number of rules in the container version.
    */
  var numRules: js.UndefOr[String] = js.native
  
  /**
    * Number of tags in the container version.
    */
  var numTags: js.UndefOr[String] = js.native
  
  /**
    * Number of triggers in the container version.
    */
  var numTriggers: js.UndefOr[String] = js.native
  
  /**
    * Number of variables in the container version.
    */
  var numVariables: js.UndefOr[String] = js.native
  
  /**
    * Number of zones in the container version.
    */
  var numZones: js.UndefOr[String] = js.native
  
  /**
    * GTM Container Versions&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
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
    def setNumCustomTemplates(value: String): Self = StObject.set(x, "numCustomTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCustomTemplatesUndefined: Self = StObject.set(x, "numCustomTemplates", js.undefined)
    
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
    
    @scala.inline
    def setNumZones(value: String): Self = StObject.set(x, "numZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumZonesUndefined: Self = StObject.set(x, "numZones", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
