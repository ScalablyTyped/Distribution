package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationJob extends js.Object {
  
  /** Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var createTime: js.UndefOr[String] = js.native
  
  /** Required. The resource name (URI) of the destination connection profile. */
  var destination: js.UndefOr[String] = js.native
  
  /** The database engine type and provider of the destination. */
  var destinationDatabase: js.UndefOr[DatabaseType] = js.native
  
  /** The migration job display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]). */
  var dumpPath: js.UndefOr[String] = js.native
  
  /** Output only. The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s". */
  var duration: js.UndefOr[String] = js.native
  
  /** Output only. If the migration job is completed, the time when it was completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. The error details in case of state FAILED. */
  var error: js.UndefOr[Status] = js.native
  
  /**
    * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example:
    * `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.MigrationJob with TopLevel[js.Any]
  ] = js.native
  
  /** The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/instances/{instance}. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The current migration job phase. */
  var phase: js.UndefOr[String] = js.native
  
  /** The details needed to communicate to the source over Reverse SSH tunnel connectivity. */
  var reverseSshConnectivity: js.UndefOr[ReverseSshConnectivity] = js.native
  
  /** Required. The resource name (URI) of the source connection profile. */
  var source: js.UndefOr[String] = js.native
  
  /** The database engine type and provider of the source. */
  var sourceDatabase: js.UndefOr[DatabaseType] = js.native
  
  /** The current migration job state. */
  var state: js.UndefOr[String] = js.native
  
  /** static ip connectivity data (default, no additional details needed). */
  var staticIpConnectivity: js.UndefOr[js.Any] = js.native
  
  /** Required. The migration job type. */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Output only. The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
    * "2014-10-02T15:01:23.045123456Z".
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /** The details of the VPC network that the source database is located in. */
  var vpcPeeringConnectivity: js.UndefOr[VpcPeeringConnectivity] = js.native
}
object MigrationJob {
  
  @scala.inline
  def apply(): MigrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationJob]
  }
  
  @scala.inline
  implicit class MigrationJobOps[Self <: MigrationJob] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDestinationDatabase(value: DatabaseType): Self = this.set("destinationDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDatabase: Self = this.set("destinationDatabase", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDumpPath(value: String): Self = this.set("dumpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpPath: Self = this.set("dumpPath", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.MigrationJob with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
    
    @scala.inline
    def setReverseSshConnectivity(value: ReverseSshConnectivity): Self = this.set("reverseSshConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseSshConnectivity: Self = this.set("reverseSshConnectivity", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceDatabase(value: DatabaseType): Self = this.set("sourceDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDatabase: Self = this.set("sourceDatabase", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStaticIpConnectivity(value: js.Any): Self = this.set("staticIpConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticIpConnectivity: Self = this.set("staticIpConnectivity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectivity(value: VpcPeeringConnectivity): Self = this.set("vpcPeeringConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectivity: Self = this.set("vpcPeeringConnectivity", js.undefined)
  }
}
