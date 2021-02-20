package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterMetadata extends StObject {
  
  /** The time at which the operation failed or was completed successfully. */
  var finishTime: js.UndefOr[String] = js.native
  
  /** The request that prompted the initiation of this CreateCluster operation. */
  var originalRequest: js.UndefOr[CreateClusterRequest] = js.native
  
  /** The time at which the original request was received. */
  var requestTime: js.UndefOr[String] = js.native
  
  /**
    * Keys: the full `name` of each table that existed in the instance when CreateCluster was first called, i.e. `projects//instances//tables/`. Any table added to the instance by a later
    * API call will be created in the new cluster by that API call, not this one. Values: information on how much of a table's data has been copied to the newly-created cluster so far.
    */
  var tables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.TableProgress}
    */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.CreateClusterMetadata with TopLevel[js.Any]
  ] = js.native
}
object CreateClusterMetadata {
  
  @scala.inline
  def apply(): CreateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterMetadata]
  }
  
  @scala.inline
  implicit class CreateClusterMetadataMutableBuilder[Self <: CreateClusterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: CreateClusterRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
    
    @scala.inline
    def setTables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.TableProgress}
      */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.CreateClusterMetadata with TopLevel[js.Any]
    ): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
  }
}
