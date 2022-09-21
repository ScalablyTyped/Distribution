package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPackagesResponse extends StObject {
  
  /**
    * The token to retrieve the next page of packages, or empty if there are no more packages to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The packages returned.
    */
  var packages: js.UndefOr[js.Array[SchemaPackage]] = js.undefined
}
object SchemaListPackagesResponse {
  
  inline def apply(): SchemaListPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPackagesResponse]
  }
  
  extension [Self <: SchemaListPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPackages(value: js.Array[SchemaPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: SchemaPackage*): Self = StObject.set(x, "packages", js.Array(value*))
  }
}
