package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobtriggersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobtriggersGet {
  
  inline def apply(): ParamsResourceProjectsJobtriggersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobtriggersGet]
  }
  
  extension [Self <: ParamsResourceProjectsJobtriggersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
