package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzePackagesRequestV1 extends StObject {
  
  /**
    * [DEPRECATED] Whether to include OSV data in the scan. For backwards compatibility reasons, this field can be neither removed nor renamed.
    */
  var includeOsvData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The packages to analyze.
    */
  var packages: js.UndefOr[js.Array[SchemaPackageData]] = js.undefined
  
  /**
    * Required. The resource URI of the container image being scanned.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzePackagesRequestV1 {
  
  inline def apply(): SchemaAnalyzePackagesRequestV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzePackagesRequestV1]
  }
  
  extension [Self <: SchemaAnalyzePackagesRequestV1](x: Self) {
    
    inline def setIncludeOsvData(value: Boolean): Self = StObject.set(x, "includeOsvData", value.asInstanceOf[js.Any])
    
    inline def setIncludeOsvDataNull: Self = StObject.set(x, "includeOsvData", null)
    
    inline def setIncludeOsvDataUndefined: Self = StObject.set(x, "includeOsvData", js.undefined)
    
    inline def setPackages(value: js.Array[SchemaPackageData]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: SchemaPackageData*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
