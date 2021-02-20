package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceRequest extends StObject {
  
  /**
    * Required. The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank. Currently, at most four clusters can be specified.
    */
  var clusters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.Cluster}
    */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.CreateInstanceRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The instance to create. Fields marked `OutputOnly` must be left blank. */
  var instance: js.UndefOr[Instance] = js.native
  
  /** Required. The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** Required. The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`. */
  var parent: js.UndefOr[String] = js.native
}
object CreateInstanceRequest {
  
  @scala.inline
  def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateInstanceRequestMutableBuilder[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.Cluster}
      */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.CreateInstanceRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
