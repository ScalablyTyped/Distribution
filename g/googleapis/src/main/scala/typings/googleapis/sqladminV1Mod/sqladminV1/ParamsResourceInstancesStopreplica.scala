package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancesStopreplica
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud SQL read replica instance name.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project that contains the read replica.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancesStopreplica {
  
  inline def apply(): ParamsResourceInstancesStopreplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesStopreplica]
  }
  
  extension [Self <: ParamsResourceInstancesStopreplica](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
