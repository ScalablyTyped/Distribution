package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1Package extends StObject {
  
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
  implicit class GoogleDevtoolsArtifactregistryV1alpha1PackageMutableBuilder[Self <: GoogleDevtoolsArtifactregistryV1alpha1Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
