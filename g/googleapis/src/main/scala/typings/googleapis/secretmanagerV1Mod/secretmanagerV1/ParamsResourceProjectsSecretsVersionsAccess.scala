package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsVersionsAccess
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`. `projects/x/secrets/x/versions/latest` is an alias to the most recently created SecretVersion.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsVersionsAccess {
  
  inline def apply(): ParamsResourceProjectsSecretsVersionsAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsVersionsAccess]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsVersionsAccess](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
