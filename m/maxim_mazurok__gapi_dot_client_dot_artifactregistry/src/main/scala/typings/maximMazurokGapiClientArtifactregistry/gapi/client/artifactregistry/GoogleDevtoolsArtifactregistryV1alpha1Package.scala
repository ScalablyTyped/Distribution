package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1Package extends js.Object {
  
  /** The time when the package was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The display name of the package. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The name of the package, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1". */
  var name: js.UndefOr[String] = js.native
  
  /** The time when the package was last updated. This includes publishing a new version of the package. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleDevtoolsArtifactregistryV1alpha1Package {
  
  @scala.inline
  def apply(): GoogleDevtoolsArtifactregistryV1alpha1Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1Package]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsArtifactregistryV1alpha1PackageOps[Self <: GoogleDevtoolsArtifactregistryV1alpha1Package] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
