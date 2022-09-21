package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKeysDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the key to be deleted, in the format "projects/{project\}/keys/{key\}".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKeysDelete {
  
  inline def apply(): ParamsResourceProjectsKeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKeysDelete]
  }
  
  extension [Self <: ParamsResourceProjectsKeysDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
