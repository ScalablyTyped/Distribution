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
  
  inline def apply(): MigrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationJob]
  }
  
  extension [Self <: MigrationJob](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatabase(value: DatabaseType): Self = StObject.set(x, "destinationDatabase", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatabaseUndefined: Self = StObject.set(x, "destinationDatabase", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDumpPath(value: String): Self = StObject.set(x, "dumpPath", value.asInstanceOf[js.Any])
    
    inline def setDumpPathUndefined: Self = StObject.set(x, "dumpPath", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.MigrationJob & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setReverseSshConnectivity(value: ReverseSshConnectivity): Self = StObject.set(x, "reverseSshConnectivity", value.asInstanceOf[js.Any])
    
    inline def setReverseSshConnectivityUndefined: Self = StObject.set(x, "reverseSshConnectivity", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabase(value: DatabaseType): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStaticIpConnectivity(value: js.Any): Self = StObject.set(x, "staticIpConnectivity", value.asInstanceOf[js.Any])
    
    inline def setStaticIpConnectivityUndefined: Self = StObject.set(x, "staticIpConnectivity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVpcPeeringConnectivity(value: VpcPeeringConnectivity): Self = StObject.set(x, "vpcPeeringConnectivity", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectivityUndefined: Self = StObject.set(x, "vpcPeeringConnectivity", js.undefined)
  }
}
