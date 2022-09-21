package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  /** The time when the version was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of the version, as specified in its metadata. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Repository-specific Metadata stored against this version. The fields returned are defined by the underlying repository-specific resource. Currently, the only resource
    * in use is DockerImage
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.Version & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The name of the version, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1". If the package or version ID parts contain slashes, the
    * slashes are escaped.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. A list of related tags. Will contain up to 100 tags that reference this version. */
  var relatedTags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /** The time when the version was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Version {
  
  inline def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.Version & TopLevel[Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelatedTags(value: js.Array[Tag]): Self = StObject.set(x, "relatedTags", value.asInstanceOf[js.Any])
    
    inline def setRelatedTagsUndefined: Self = StObject.set(x, "relatedTags", js.undefined)
    
    inline def setRelatedTagsVarargs(value: Tag*): Self = StObject.set(x, "relatedTags", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
