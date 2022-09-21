package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageOccurrence extends StObject {
  
  /**
    * Output only. The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
    */
  var cpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Licenses that have been declared by the authors of the package.
    */
  var license: js.UndefOr[SchemaLicense] = js.undefined
  
  /**
    * All of the places within the filesystem versions of this package have been found.
    */
  var location: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * Required. Output only. The name of the installed package.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The version of the package.
    */
  var version: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaPackageOccurrence {
  
  inline def apply(): SchemaPackageOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageOccurrence]
  }
  
  extension [Self <: SchemaPackageOccurrence](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriNull: Self = StObject.set(x, "cpeUri", null)
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setLicense(value: SchemaLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setLocation(value: js.Array[SchemaLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: SchemaLocation*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
