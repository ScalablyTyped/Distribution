package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Host of the user in the instance.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Database instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the user in the instance.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersDelete {
  
  inline def apply(): ParamsResourceUsersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDelete]
  }
  
  extension [Self <: ParamsResourceUsersDelete](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
