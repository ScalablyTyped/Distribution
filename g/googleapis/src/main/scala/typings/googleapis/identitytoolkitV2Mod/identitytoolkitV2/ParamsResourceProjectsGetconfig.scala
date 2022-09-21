package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetconfig
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the config, for example: "projects/my-awesome-project/config"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetconfig {
  
  inline def apply(): ParamsResourceProjectsGetconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetconfig]
  }
  
  extension [Self <: ParamsResourceProjectsGetconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
