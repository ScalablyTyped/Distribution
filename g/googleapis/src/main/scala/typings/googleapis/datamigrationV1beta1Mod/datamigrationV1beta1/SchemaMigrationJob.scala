package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMigrationJob extends StObject {
  
  /**
    * Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name (URI) of the destination connection profile.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The database engine type and provider of the destination.
    */
  var destinationDatabase: js.UndefOr[SchemaDatabaseType] = js.undefined
  
  /**
    * The migration job display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
    */
  var dumpPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If the migration job is completed, the time when it was completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The error details in case of state FAILED.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" \}`.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The name (URI) of this migration job resource, in the form of: projects/{project\}/locations/{location\}/migrationJobs/{migrationJob\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current migration job phase.
    */
  var phase: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
    */
  var reverseSshConnectivity: js.UndefOr[SchemaReverseSshConnectivity] = js.undefined
  
  /**
    * Required. The resource name (URI) of the source connection profile.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The database engine type and provider of the source.
    */
  var sourceDatabase: js.UndefOr[SchemaDatabaseType] = js.undefined
  
  /**
    * The current migration job state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * static ip connectivity data (default, no additional details needed).
    */
  var staticIpConnectivity: js.UndefOr[SchemaStaticIpConnectivity] = js.undefined
  
  /**
    * Required. The migration job type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The details of the VPC network that the source database is located in.
    */
  var vpcPeeringConnectivity: js.UndefOr[SchemaVpcPeeringConnectivity] = js.undefined
}
object SchemaMigrationJob {
  
  inline def apply(): SchemaMigrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMigrationJob]
  }
  
  extension [Self <: SchemaMigrationJob](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatabase(value: SchemaDatabaseType): Self = StObject.set(x, "destinationDatabase", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatabaseUndefined: Self = StObject.set(x, "destinationDatabase", js.undefined)
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDumpPath(value: String): Self = StObject.set(x, "dumpPath", value.asInstanceOf[js.Any])
    
    inline def setDumpPathNull: Self = StObject.set(x, "dumpPath", null)
    
    inline def setDumpPathUndefined: Self = StObject.set(x, "dumpPath", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseNull: Self = StObject.set(x, "phase", null)
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setReverseSshConnectivity(value: SchemaReverseSshConnectivity): Self = StObject.set(x, "reverseSshConnectivity", value.asInstanceOf[js.Any])
    
    inline def setReverseSshConnectivityUndefined: Self = StObject.set(x, "reverseSshConnectivity", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabase(value: SchemaDatabaseType): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStaticIpConnectivity(value: SchemaStaticIpConnectivity): Self = StObject.set(x, "staticIpConnectivity", value.asInstanceOf[js.Any])
    
    inline def setStaticIpConnectivityUndefined: Self = StObject.set(x, "staticIpConnectivity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVpcPeeringConnectivity(value: SchemaVpcPeeringConnectivity): Self = StObject.set(x, "vpcPeeringConnectivity", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectivityUndefined: Self = StObject.set(x, "vpcPeeringConnectivity", js.undefined)
  }
}
