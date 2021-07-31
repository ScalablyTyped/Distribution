package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  /** The time when the version was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of the version, as specified in its metadata. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The name of the version, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. A list of related tags. Will contain up to 100 tags that reference this version. */
  var relatedTags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /** The time when the version was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRelatedTags(value: js.Array[Tag]): Self = StObject.set(x, "relatedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTagsUndefined: Self = StObject.set(x, "relatedTags", js.undefined)
    
    @scala.inline
    def setRelatedTagsVarargs(value: Tag*): Self = StObject.set(x, "relatedTags", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
