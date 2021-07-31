package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationJob extends StObject {
  
  /** Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name (URI) of the destination connection profile. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** The database engine type and provider of the destination. */
  var destinationDatabase: js.UndefOr[DatabaseType] = js.undefined
  
  /** The migration job display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]). */
  var dumpPath: js.UndefOr[String] = js.undefined
  
  /** Output only. The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s". */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Output only. If the migration job is completed, the time when it was completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The error details in case of state FAILED. */
  var error: js.UndefOr[Status] = js.undefined
  
  /**
    * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example:
    * `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.MigrationJob & TopLevel[js.Any]
  ] = js.undefined
  
  /** The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/instances/{instance}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current migration job phase. */
  var phase: js.UndefOr[String] = js.undefined
  
  /** The details needed to communicate to the source over Reverse SSH tunnel connectivity. */
  var reverseSshConnectivity: js.UndefOr[ReverseSshConnectivity] = js.undefined
  
  /** Required. The resource name (URI) of the source connection profile. */
  var source: js.UndefOr[String] = js.undefined
  
  /** The database engine type and provider of the source. */
  var sourceDatabase: js.UndefOr[DatabaseType] = js.undefined
  
  /** The current migration job state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** static ip connectivity data (default, no additional details needed). */
  var staticIpConnectivity: js.UndefOr[js.Any] = js.undefined
  
  /** Required. The migration job type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
    * "2014-10-02T15:01:23.045123456Z".
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** The details of the VPC network that the source database is located in. */
  var vpcPeeringConnectivity: js.UndefOr[VpcPeeringConnectivity] = js.undefined
}
object MigrationJob {
  
  @scala.inline
  def apply(): MigrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationJob]
  }
  
  @scala.inline
  implicit class MigrationJobMutableBuilder[Self <: MigrationJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatabase(value: DatabaseType): Self = StObject.set(x, "destinationDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatabaseUndefined: Self = StObject.set(x, "destinationDatabase", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDumpPath(value: String): Self = StObject.set(x, "dumpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumpPathUndefined: Self = StObject.set(x, "dumpPath", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.MigrationJob & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    @scala.inline
    def setReverseSshConnectivity(value: ReverseSshConnectivity): Self = StObject.set(x, "reverseSshConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseSshConnectivityUndefined: Self = StObject.set(x, "reverseSshConnectivity", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDatabase(value: DatabaseType): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStaticIpConnectivity(value: js.Any): Self = StObject.set(x, "staticIpConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticIpConnectivityUndefined: Self = StObject.set(x, "staticIpConnectivity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectivity(value: VpcPeeringConnectivity): Self = StObject.set(x, "vpcPeeringConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectivityUndefined: Self = StObject.set(x, "vpcPeeringConnectivity", js.undefined)
  }
}
