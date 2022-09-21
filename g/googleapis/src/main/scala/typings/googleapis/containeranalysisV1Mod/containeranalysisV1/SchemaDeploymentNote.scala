package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentNote extends StObject {
  
  /**
    * Required. Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDeploymentNote {
  
  inline def apply(): SchemaDeploymentNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentNote]
  }
  
  extension [Self <: SchemaDeploymentNote](x: Self) {
    
    inline def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value*))
  }
}
