package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterMetadata extends js.Object {
  
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
  implicit class CreateClusterMetadataOps[Self <: CreateClusterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinishTime(value: String): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishTime: Self = this.set("finishTime", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: CreateClusterRequest): Self = this.set("originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRequest: Self = this.set("originalRequest", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTime: Self = this.set("requestTime", js.undefined)
    
    @scala.inline
    def setTables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.TableProgress}
      */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.CreateClusterMetadata with TopLevel[js.Any]
    ): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}
