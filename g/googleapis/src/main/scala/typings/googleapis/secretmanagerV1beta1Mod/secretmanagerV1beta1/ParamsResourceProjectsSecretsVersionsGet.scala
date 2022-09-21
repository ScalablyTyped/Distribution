package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsVersionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`. `projects/x/secrets/x/versions/latest` is an alias to the `latest` SecretVersion.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsVersionsGet {
  
  inline def apply(): ParamsResourceProjectsSecretsVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsVersionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsVersionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
