package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzePackagesRequest extends StObject {
  
  /**
    * The packages to analyze.
    */
  var packages: js.UndefOr[js.Array[SchemaPackageData]] = js.undefined
  
  /**
    * Required. The resource URI of the container image being scanned.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzePackagesRequest {
  
  inline def apply(): SchemaAnalyzePackagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzePackagesRequest]
  }
  
  extension [Self <: SchemaAnalyzePackagesRequest](x: Self) {
    
    inline def setPackages(value: js.Array[SchemaPackageData]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: SchemaPackageData*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
