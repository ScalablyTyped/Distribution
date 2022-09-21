package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Secret to delete in the format `projects/x/secrets/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsDelete {
  
  inline def apply(): ParamsResourceProjectsSecretsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
