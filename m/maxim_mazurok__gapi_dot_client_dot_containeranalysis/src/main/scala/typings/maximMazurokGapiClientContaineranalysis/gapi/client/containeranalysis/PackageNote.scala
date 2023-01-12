package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageNote extends StObject {
  
  /** The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages. */
  var architecture: js.UndefOr[String] = js.undefined
  
  /** The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages. */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /** The description of this package. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Hash value, typically a file digest, that allows unique identification a specific package. */
  var digest: js.UndefOr[js.Array[Digest]] = js.undefined
  
  /** Deprecated. The various channels by which a package is distributed. */
  var distribution: js.UndefOr[js.Array[Distribution]] = js.undefined
  
  /** Licenses that have been declared by the authors of the package. */
  var license: js.UndefOr[License] = js.undefined
  
  /** A freeform text denoting the maintainer of this package. */
  var maintainer: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The name of the package. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.). */
  var packageType: js.UndefOr[String] = js.undefined
  
  /** The homepage for this package. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The version of the package. */
  var version: js.UndefOr[Version] = js.undefined
}
object PackageNote {
  
  inline def apply(): PackageNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageNote] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigest(value: js.Array[Digest]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setDigestVarargs(value: Digest*): Self = StObject.set(x, "digest", js.Array(value*))
    
    inline def setDistribution(value: js.Array[Distribution]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setDistributionVarargs(value: Distribution*): Self = StObject.set(x, "distribution", js.Array(value*))
    
    inline def setLicense(value: License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
    
    inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
