package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV2Getcapabilities
  extends StObject
     with StandardParameters {
  
  /**
    * The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceV2Getcapabilities {
  
  inline def apply(): ParamsResourceV2Getcapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV2Getcapabilities]
  }
  
  extension [Self <: ParamsResourceV2Getcapabilities](x: Self) {
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
  }
}
