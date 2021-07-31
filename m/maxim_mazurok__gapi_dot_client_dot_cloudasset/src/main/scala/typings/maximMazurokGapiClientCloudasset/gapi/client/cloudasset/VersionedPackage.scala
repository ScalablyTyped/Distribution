package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedPackage extends StObject {
  
  /** The system architecture this package is intended for. */
  var architecture: js.UndefOr[String] = js.undefined
  
  /** The name of the package. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The version of the package. */
  var version: js.UndefOr[String] = js.undefined
}
object VersionedPackage {
  
  @scala.inline
  def apply(): VersionedPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionedPackage]
  }
  
  @scala.inline
  implicit class VersionedPackageMutableBuilder[Self <: VersionedPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
