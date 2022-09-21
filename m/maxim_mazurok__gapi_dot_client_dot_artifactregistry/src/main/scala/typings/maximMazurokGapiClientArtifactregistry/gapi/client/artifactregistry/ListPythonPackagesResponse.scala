package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPythonPackagesResponse extends StObject {
  
  /** The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The python packages returned. */
  var pythonPackages: js.UndefOr[js.Array[PythonPackage]] = js.undefined
}
object ListPythonPackagesResponse {
  
  inline def apply(): ListPythonPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPythonPackagesResponse]
  }
  
  extension [Self <: ListPythonPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPythonPackages(value: js.Array[PythonPackage]): Self = StObject.set(x, "pythonPackages", value.asInstanceOf[js.Any])
    
    inline def setPythonPackagesUndefined: Self = StObject.set(x, "pythonPackages", js.undefined)
    
    inline def setPythonPackagesVarargs(value: PythonPackage*): Self = StObject.set(x, "pythonPackages", js.Array(value*))
  }
}
