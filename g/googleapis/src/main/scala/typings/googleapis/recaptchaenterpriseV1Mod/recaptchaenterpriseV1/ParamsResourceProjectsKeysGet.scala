package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKeysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the requested key, in the format "projects/{project\}/keys/{key\}".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKeysGet {
  
  inline def apply(): ParamsResourceProjectsKeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKeysGet]
  }
  
  extension [Self <: ParamsResourceProjectsKeysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
