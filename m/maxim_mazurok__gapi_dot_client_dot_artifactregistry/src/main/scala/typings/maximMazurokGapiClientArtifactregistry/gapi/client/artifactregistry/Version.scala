package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
  /** The time when the version was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Description of the version, as specified in its metadata. */
  var description: js.UndefOr[String] = js.native
  
  /** The name of the version, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1". */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. A list of related tags. Will contain up to 100 tags that reference this version. */
  var relatedTags: js.UndefOr[js.Array[Tag]] = js.native
  
  /** The time when the version was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRelatedTagsVarargs(value: Tag*): Self = this.set("relatedTags", js.Array(value :_*))
    
    @scala.inline
    def setRelatedTags(value: js.Array[Tag]): Self = this.set("relatedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedTags: Self = this.set("relatedTags", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
