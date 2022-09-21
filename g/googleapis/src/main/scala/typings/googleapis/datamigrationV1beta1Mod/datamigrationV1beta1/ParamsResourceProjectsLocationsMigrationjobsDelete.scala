package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMigrationjobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The destination CloudSQL connection profile is always deleted with the migration job. In case of force delete, the destination CloudSQL replica database is also deleted.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Name of the migration job resource to delete.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMigrationjobsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsMigrationjobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMigrationjobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMigrationjobsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
