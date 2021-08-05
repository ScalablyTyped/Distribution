package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An artifact that can be deployed in some runtime.
  */
trait SchemaDeployable extends StObject {
  
  /**
    * Required. Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDeployable {
  
  inline def apply(): SchemaDeployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployable]
  }
  
  extension [Self <: SchemaDeployable](x: Self) {
    
    inline def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value :_*))
  }
}
