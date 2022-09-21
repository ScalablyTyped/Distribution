package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption extends StObject {
  
  /**
    * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use` on the project hosting the WorkerPool. Format
    * projects/{project}/locations/{location}/workerPools/{workerPoolId}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
