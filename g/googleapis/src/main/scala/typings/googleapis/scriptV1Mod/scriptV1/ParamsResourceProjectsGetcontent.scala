package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetcontent
  extends StObject
     with StandardParameters {
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the project to retrieve. If not provided, the project's HEAD version is returned.
    */
  var versionNumber: js.UndefOr[Double] = js.undefined
}
object ParamsResourceProjectsGetcontent {
  
  inline def apply(): ParamsResourceProjectsGetcontent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetcontent]
  }
  
  extension [Self <: ParamsResourceProjectsGetcontent](x: Self) {
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
