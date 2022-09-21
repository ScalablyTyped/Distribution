package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackage extends StObject {
  
  /**
    * The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
    */
  var cpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of this package.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hash value, typically a file digest, that allows unique identification a specific package.
    */
  var digest: js.UndefOr[js.Array[SchemaDigest]] = js.undefined
  
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.undefined
  
  /**
    * Licenses that have been declared by the authors of the package.
    */
  var license: js.UndefOr[SchemaLicense] = js.undefined
  
  /**
    * A freeform text denoting the maintainer of this package.
    */
  var maintainer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The homepage for this package.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the package.
    */
  var version: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaPackage {
  
  inline def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  extension [Self <: SchemaPackage](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriNull: Self = StObject.set(x, "cpeUri", null)
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigest(value: js.Array[SchemaDigest]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setDigestVarargs(value: SchemaDigest*): Self = StObject.set(x, "digest", js.Array(value*))
    
    inline def setDistribution(value: js.Array[SchemaDistribution]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setDistributionVarargs(value: SchemaDistribution*): Self = StObject.set(x, "distribution", js.Array(value*))
    
    inline def setLicense(value: SchemaLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
    
    inline def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
    
    inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
