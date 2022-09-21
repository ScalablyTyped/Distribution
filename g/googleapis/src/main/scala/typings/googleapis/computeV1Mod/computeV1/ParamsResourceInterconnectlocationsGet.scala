package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInterconnectlocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the interconnect location to return.
    */
  var interconnectLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceInterconnectlocationsGet {
  
  inline def apply(): ParamsResourceInterconnectlocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectlocationsGet]
  }
  
  extension [Self <: ParamsResourceInterconnectlocationsGet](x: Self) {
    
    inline def setInterconnectLocation(value: String): Self = StObject.set(x, "interconnectLocation", value.asInstanceOf[js.Any])
    
    inline def setInterconnectLocationUndefined: Self = StObject.set(x, "interconnectLocation", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
