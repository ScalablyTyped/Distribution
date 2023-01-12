package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AptArtifact extends StObject {
  
  /** Output only. Operating system architecture of the artifact. */
  var architecture: js.UndefOr[String] = js.undefined
  
  /** Output only. Repository component of the artifact. */
  var component: js.UndefOr[String] = js.undefined
  
  /** Output only. Contents of the artifact's control metadata file. */
  var controlFile: js.UndefOr[String] = js.undefined
  
  /** Output only. The Artifact Registry resource name of the artifact. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The Apt package name of the artifact. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Output only. An artifact is a binary or source package. */
  var packageType: js.UndefOr[String] = js.undefined
}
object AptArtifact {
  
  inline def apply(): AptArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AptArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AptArtifact] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setControlFile(value: String): Self = StObject.set(x, "controlFile", value.asInstanceOf[js.Any])
    
    inline def setControlFileUndefined: Self = StObject.set(x, "controlFile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
  }
}
