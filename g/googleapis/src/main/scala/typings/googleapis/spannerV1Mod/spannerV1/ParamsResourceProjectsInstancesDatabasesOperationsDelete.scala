package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesOperationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource to be deleted.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesOperationsDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesOperationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesOperationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesOperationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
