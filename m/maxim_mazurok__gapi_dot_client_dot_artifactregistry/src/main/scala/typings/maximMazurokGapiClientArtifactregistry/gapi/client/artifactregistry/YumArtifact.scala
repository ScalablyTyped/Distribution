package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YumArtifact extends StObject {
  
  /** Output only. Operating system architecture of the artifact. */
  var architecture: js.UndefOr[String] = js.undefined
  
  /** Output only. The Artifact Registry resource name of the artifact. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The yum package name of the artifact. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Output only. An artifact is a binary or source package. */
  var packageType: js.UndefOr[String] = js.undefined
}
object YumArtifact {
  
  inline def apply(): YumArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YumArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YumArtifact] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
  }
}
