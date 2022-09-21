package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsVersionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.undefined
  
  /**
    * The version number.
    */
  var versionNumber: js.UndefOr[Double] = js.undefined
}
object ParamsResourceProjectsVersionsGet {
  
  inline def apply(): ParamsResourceProjectsVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsVersionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsVersionsGet](x: Self) {
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
