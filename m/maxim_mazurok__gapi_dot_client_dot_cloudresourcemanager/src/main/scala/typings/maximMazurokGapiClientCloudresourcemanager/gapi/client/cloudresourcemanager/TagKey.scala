package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagKey extends StObject {
  
  /** Output only. Creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagKeyRequest for details. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where `tag_key_id` is the generated numeric id for the TagKey. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. Namespaced name of the TagKey. */
  var namespacedName: js.UndefOr[String] = js.undefined
  
  /** Immutable. The resource name of the new TagKey's parent. Must be of the form `organizations/{org_id}`. */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy engine, and will involve that policy engine in management operations involving this
    * Tag. A purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by other policy engines. A purpose cannot be changed once set.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Purpose data corresponds to the policy system that the tag is intended for. See documentation for `Purpose` for formatting of this field. Purpose data cannot be changed
    * once set.
    */
  var purposeData: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.TagKey & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Required. Immutable. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace. The short name must be 1-63 characters,
    * beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
    */
  var shortName: js.UndefOr[String] = js.undefined
  
  /** Output only. Update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object TagKey {
  
  inline def apply(): TagKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKey]
  }
  
  extension [Self <: TagKey](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespacedName(value: String): Self = StObject.set(x, "namespacedName", value.asInstanceOf[js.Any])
    
    inline def setNamespacedNameUndefined: Self = StObject.set(x, "namespacedName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.TagKey & TopLevel[Any]
    ): Self = StObject.set(x, "purposeData", value.asInstanceOf[js.Any])
    
    inline def setPurposeDataUndefined: Self = StObject.set(x, "purposeData", js.undefined)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
