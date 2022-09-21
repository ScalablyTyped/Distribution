package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageData extends StObject {
  
  /**
    * The package being analysed for vulnerabilities
    */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability may manifest. Examples include distro or storage location for vulnerable jar.
    */
  var cpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dependency chain between this package and the user's artifact. List in order from the customer's package under review first, to the current package last. Inclusive of the original package and the current package.
    */
  var dependencyChain: js.UndefOr[js.Array[SchemaLanguagePackageDependency]] = js.undefined
  
  /**
    * The path to the jar file / go binary file.
    */
  var fileLocation: js.UndefOr[js.Array[SchemaFileLocation]] = js.undefined
  
  /**
    * HashDigest stores the SHA512 hash digest of the jar file if the package is of type Maven. This field will be unset for non Maven packages.
    */
  var hashDigest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OS affected by a vulnerability This field is deprecated and the information is in cpe_uri
    */
  var os: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the OS This field is deprecated and the information is in cpe_uri
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of package: os, maven, go, etc.
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CVEs that this package is no longer vulnerable to go/drydock-dd-custom-binary-scanning
    */
  var patchedCve: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var unused: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the package being analysed
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackageData {
  
  inline def apply(): SchemaPackageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageData]
  }
  
  extension [Self <: SchemaPackageData](x: Self) {
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriNull: Self = StObject.set(x, "cpeUri", null)
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDependencyChain(value: js.Array[SchemaLanguagePackageDependency]): Self = StObject.set(x, "dependencyChain", value.asInstanceOf[js.Any])
    
    inline def setDependencyChainUndefined: Self = StObject.set(x, "dependencyChain", js.undefined)
    
    inline def setDependencyChainVarargs(value: SchemaLanguagePackageDependency*): Self = StObject.set(x, "dependencyChain", js.Array(value*))
    
    inline def setFileLocation(value: js.Array[SchemaFileLocation]): Self = StObject.set(x, "fileLocation", value.asInstanceOf[js.Any])
    
    inline def setFileLocationUndefined: Self = StObject.set(x, "fileLocation", js.undefined)
    
    inline def setFileLocationVarargs(value: SchemaFileLocation*): Self = StObject.set(x, "fileLocation", js.Array(value*))
    
    inline def setHashDigest(value: String): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
    
    inline def setHashDigestNull: Self = StObject.set(x, "hashDigest", null)
    
    inline def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsNull: Self = StObject.set(x, "os", null)
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setPatchedCve(value: js.Array[String]): Self = StObject.set(x, "patchedCve", value.asInstanceOf[js.Any])
    
    inline def setPatchedCveNull: Self = StObject.set(x, "patchedCve", null)
    
    inline def setPatchedCveUndefined: Self = StObject.set(x, "patchedCve", js.undefined)
    
    inline def setPatchedCveVarargs(value: String*): Self = StObject.set(x, "patchedCve", js.Array(value*))
    
    inline def setUnused(value: String): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
    
    inline def setUnusedNull: Self = StObject.set(x, "unused", null)
    
    inline def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
