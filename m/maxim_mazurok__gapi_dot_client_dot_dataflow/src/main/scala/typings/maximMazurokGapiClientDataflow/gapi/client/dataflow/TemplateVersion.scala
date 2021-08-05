package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersion extends StObject {
  
  /** Job graph and metadata if it is a legacy Template. Container image path and metadata if it is flex Template. */
  var artifact: js.UndefOr[Artifact] = js.undefined
  
  /** Creation time of this TemplateVersion. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Template description from the user. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A customized name for Template. Multiple TemplateVersions per Template. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Labels for the Template Version. Labels can be duplicate within Template. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.TemplateVersion & TopLevel[js.Any]
  ] = js.undefined
  
  /** A unique project_id. Multiple Templates per Project. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Alias for version_id, helps locate a TemplateVersion. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Either LEGACY or FLEX. This should match with the type of artifact. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** An auto generated version_id for TemplateVersion. */
  var versionId: js.UndefOr[String] = js.undefined
}
object TemplateVersion {
  
  inline def apply(): TemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersion]
  }
  
  extension [Self <: TemplateVersion](x: Self) {
    
    inline def setArtifact(value: Artifact): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.TemplateVersion & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
