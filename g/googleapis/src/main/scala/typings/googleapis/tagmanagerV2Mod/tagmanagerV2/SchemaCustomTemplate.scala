package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomTemplate extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fingerprint of the GTM Custom Template as computed at storage time. This value is recomputed whenever the template is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reference to the Community Template Gallery entry.
    */
  var galleryReference: js.UndefOr[SchemaGalleryReference] = js.undefined
  
  /**
    * Custom Template display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Custom Template's API relative path.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The custom template in text format.
    */
  var templateData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Custom Template ID uniquely identifies the GTM custom template.
    */
  var templateId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomTemplate {
  
  inline def apply(): SchemaCustomTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomTemplate]
  }
  
  extension [Self <: SchemaCustomTemplate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setGalleryReference(value: SchemaGalleryReference): Self = StObject.set(x, "galleryReference", value.asInstanceOf[js.Any])
    
    inline def setGalleryReferenceUndefined: Self = StObject.set(x, "galleryReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlNull: Self = StObject.set(x, "tagManagerUrl", null)
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTemplateData(value: String): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
    
    inline def setTemplateDataNull: Self = StObject.set(x, "templateData", null)
    
    inline def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdNull: Self = StObject.set(x, "workspaceId", null)
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
