package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MavenArtifact extends StObject {
  
  /** Artifact ID for the artifact. */
  var artifactId: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the artifact was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Group ID for the artifact. Example: com.google.guava */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. registry_location, project_id, repository_name and maven_artifact forms a unique artifact For example,
    * "projects/test-project/locations/us-west4/repositories/test-repo/mavenArtifacts/ com.google.guava:guava:31.0-jre", where "us-west4" is the registry_location, "test-project" is the
    * project_id, "test-repo" is the repository_name and "com.google.guava:guava:31.0-jre" is the maven artifact.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. URL to access the pom file of the artifact. Example: us-west4-maven.pkg.dev/test-project/test-repo/com/google/guava/guava/31.0/guava-31.0.pom */
  var pomUri: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the artifact was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Version of this artifact. */
  var version: js.UndefOr[String] = js.undefined
}
object MavenArtifact {
  
  inline def apply(): MavenArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MavenArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MavenArtifact] (val x: Self) extends AnyVal {
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPomUri(value: String): Self = StObject.set(x, "pomUri", value.asInstanceOf[js.Any])
    
    inline def setPomUriUndefined: Self = StObject.set(x, "pomUri", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
