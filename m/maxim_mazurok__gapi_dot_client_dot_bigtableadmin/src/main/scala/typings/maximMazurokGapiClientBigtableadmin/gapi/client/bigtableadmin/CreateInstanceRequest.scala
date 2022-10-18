package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceRequest extends StObject {
  
  /**
    * Required. The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
    */
  var clusters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.Cluster} */ js.Any
  ] = js.undefined
  
  /** Required. The instance to create. Fields marked `OutputOnly` must be left blank. */
  var instance: js.UndefOr[Instance] = js.undefined
  
  /** Required. The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** Required. The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`. */
  var parent: js.UndefOr[String] = js.undefined
}
object CreateInstanceRequest {
  
  inline def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  extension [Self <: CreateInstanceRequest](x: Self) {
    
    inline def setClusters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.Cluster} */ js.Any
    ): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
