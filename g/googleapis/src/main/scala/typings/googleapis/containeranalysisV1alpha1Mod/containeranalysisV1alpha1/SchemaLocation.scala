package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An occurrence of a particular package installation found within a
  * system&#39;s filesystem. e.g. glibc was found in /var/lib/dpkg/status
  */
trait SchemaLocation extends StObject {
  
  /**
    * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
    * denoting the package manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /**
    * The path from which we gathered that this package/version is installed.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The version installed at this location.
    */
  var version: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaLocation {
  
  inline def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  extension [Self <: SchemaLocation](x: Self) {
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
