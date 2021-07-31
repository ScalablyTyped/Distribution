package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Custom Template&#39;s contents.
  */
trait SchemaCustomTemplate extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM Custom Template as computed at storage time.
    * This value is recomputed whenever the template is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Custom Template display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Custom Template&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The custom template in text format.
    */
  var templateData: js.UndefOr[String] = js.undefined
  
  /**
    * The Custom Template ID uniquely identifies the GTM custom template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.undefined
}
object SchemaCustomTemplate {
  
  @scala.inline
  def apply(): SchemaCustomTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomTemplate]
  }
  
  @scala.inline
  implicit class SchemaCustomTemplateMutableBuilder[Self <: SchemaCustomTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTemplateData(value: String): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
