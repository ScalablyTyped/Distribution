package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentNote extends StObject {
  
  /** Required. Resource URI for the artifact being deployed. */
  var resourceUri: js.UndefOr[js.Array[String]] = js.undefined
}
object DeploymentNote {
  
  inline def apply(): DeploymentNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentNote]
  }
  
  extension [Self <: DeploymentNote](x: Self) {
    
    inline def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value*))
  }
}
