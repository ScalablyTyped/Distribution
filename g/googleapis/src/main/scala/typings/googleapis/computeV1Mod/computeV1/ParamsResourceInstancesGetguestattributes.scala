package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancesGetguestattributes
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the instance scoping this request.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the guest attributes path to be queried.
    */
  var queryPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the key for the guest attributes entry.
    */
  var variableKey: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancesGetguestattributes {
  
  inline def apply(): ParamsResourceInstancesGetguestattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesGetguestattributes]
  }
  
  extension [Self <: ParamsResourceInstancesGetguestattributes](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    inline def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    inline def setVariableKey(value: String): Self = StObject.set(x, "variableKey", value.asInstanceOf[js.Any])
    
    inline def setVariableKeyUndefined: Self = StObject.set(x, "variableKey", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
