package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MavenRepositoryConfig extends StObject {
  
  /** The repository with this flag will allow publishing the same snapshot versions. */
  var allowSnapshotOverwrites: js.UndefOr[Boolean] = js.undefined
  
  /** Version policy defines the versions that the registry will accept. */
  var versionPolicy: js.UndefOr[String] = js.undefined
}
object MavenRepositoryConfig {
  
  inline def apply(): MavenRepositoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MavenRepositoryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MavenRepositoryConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowSnapshotOverwrites(value: Boolean): Self = StObject.set(x, "allowSnapshotOverwrites", value.asInstanceOf[js.Any])
    
    inline def setAllowSnapshotOverwritesUndefined: Self = StObject.set(x, "allowSnapshotOverwrites", js.undefined)
    
    inline def setVersionPolicy(value: String): Self = StObject.set(x, "versionPolicy", value.asInstanceOf[js.Any])
    
    inline def setVersionPolicyUndefined: Self = StObject.set(x, "versionPolicy", js.undefined)
  }
}
