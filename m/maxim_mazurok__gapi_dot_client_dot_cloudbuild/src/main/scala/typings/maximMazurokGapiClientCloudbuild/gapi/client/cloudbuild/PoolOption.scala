package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolOption extends StObject {
  
  /**
    * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use` on the project hosting the WorkerPool. Format
    * projects/{project}/locations/{location}/workerPools/{workerPoolId}
    */
  var name: js.UndefOr[String] = js.undefined
}
object PoolOption {
  
  inline def apply(): PoolOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOption]
  }
  
  extension [Self <: PoolOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
