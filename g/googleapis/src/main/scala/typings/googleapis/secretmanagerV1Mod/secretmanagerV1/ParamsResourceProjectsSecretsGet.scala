package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Secret, in the format `projects/x/secrets/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsGet {
  
  inline def apply(): ParamsResourceProjectsSecretsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsGet]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
