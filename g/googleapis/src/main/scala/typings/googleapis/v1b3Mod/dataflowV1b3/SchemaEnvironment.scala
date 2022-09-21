package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironment extends StObject {
  
  /**
    * The type of cluster manager API to use. If unknown or unspecified, the service will attempt to choose a reasonable default. This should be in the form of the API service name, e.g. "compute.googleapis.com".
    */
  var clusterManagerApiService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dataset for the current project where various workflow related tables are stored. The supported resource type is: Google BigQuery: bigquery.googleapis.com/{dataset\}
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any debugging options to be supplied to the job.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The list of experiments to enable. This field should be used for SDK related experiments and not for service related experiments. The proper field for service related experiments is service_options.
    */
  var experiments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Which Flexible Resource Scheduling mode to run in.
    */
  var flexResourceSchedulingGoal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Experimental settings.
    */
  var internalExperiments: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through the service and are used to recreate the SDK pipeline options on the worker in a language agnostic and platform independent way.
    */
  var sdkPipelineOptions: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Identity to run virtual machines as. Defaults to the default account.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer Managed Encryption Key (CMEK). Format: projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
    */
  var serviceKmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of service options to enable. This field should be used for service related experiments only. These experiments, when graduating to GA, should be replaced by dedicated fields or become default (i.e. always on).
    */
  var serviceOptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The shuffle mode used for the job.
    */
  var shuffleMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The prefix of the resources the system should use for temporary storage. The system will append the suffix "/temp-{JOBNAME\} to this resource prefix, where {JOBNAME\} is the value of the job_name field. The resulting bucket and object prefix is used as the prefix of the resources used to store temporary data needed during the job execution. NOTE: This will override the value in taskrunner_settings. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket\}/{object\} bucket.storage.googleapis.com/{object\}
    */
  var tempStoragePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the process that generated the request.
    */
  var userAgent: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * A structure describing which components and their versions of the service are required in order to run the job.
    */
  var version: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The worker pools. At least one "harness" worker pool must be specified in order for the job to have workers.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.undefined
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity.
    */
  var workerZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setClusterManagerApiService(value: String): Self = StObject.set(x, "clusterManagerApiService", value.asInstanceOf[js.Any])
    
    inline def setClusterManagerApiServiceNull: Self = StObject.set(x, "clusterManagerApiService", null)
    
    inline def setClusterManagerApiServiceUndefined: Self = StObject.set(x, "clusterManagerApiService", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setExperiments(value: js.Array[String]): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsNull: Self = StObject.set(x, "experiments", null)
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setExperimentsVarargs(value: String*): Self = StObject.set(x, "experiments", js.Array(value*))
    
    inline def setFlexResourceSchedulingGoal(value: String): Self = StObject.set(x, "flexResourceSchedulingGoal", value.asInstanceOf[js.Any])
    
    inline def setFlexResourceSchedulingGoalNull: Self = StObject.set(x, "flexResourceSchedulingGoal", null)
    
    inline def setFlexResourceSchedulingGoalUndefined: Self = StObject.set(x, "flexResourceSchedulingGoal", js.undefined)
    
    inline def setInternalExperiments(value: StringDictionary[Any]): Self = StObject.set(x, "internalExperiments", value.asInstanceOf[js.Any])
    
    inline def setInternalExperimentsNull: Self = StObject.set(x, "internalExperiments", null)
    
    inline def setInternalExperimentsUndefined: Self = StObject.set(x, "internalExperiments", js.undefined)
    
    inline def setSdkPipelineOptions(value: StringDictionary[Any]): Self = StObject.set(x, "sdkPipelineOptions", value.asInstanceOf[js.Any])
    
    inline def setSdkPipelineOptionsNull: Self = StObject.set(x, "sdkPipelineOptions", null)
    
    inline def setSdkPipelineOptionsUndefined: Self = StObject.set(x, "sdkPipelineOptions", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setServiceKmsKeyName(value: String): Self = StObject.set(x, "serviceKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setServiceKmsKeyNameNull: Self = StObject.set(x, "serviceKmsKeyName", null)
    
    inline def setServiceKmsKeyNameUndefined: Self = StObject.set(x, "serviceKmsKeyName", js.undefined)
    
    inline def setServiceOptions(value: js.Array[String]): Self = StObject.set(x, "serviceOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceOptionsNull: Self = StObject.set(x, "serviceOptions", null)
    
    inline def setServiceOptionsUndefined: Self = StObject.set(x, "serviceOptions", js.undefined)
    
    inline def setServiceOptionsVarargs(value: String*): Self = StObject.set(x, "serviceOptions", js.Array(value*))
    
    inline def setShuffleMode(value: String): Self = StObject.set(x, "shuffleMode", value.asInstanceOf[js.Any])
    
    inline def setShuffleModeNull: Self = StObject.set(x, "shuffleMode", null)
    
    inline def setShuffleModeUndefined: Self = StObject.set(x, "shuffleMode", js.undefined)
    
    inline def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    inline def setTempStoragePrefixNull: Self = StObject.set(x, "tempStoragePrefix", null)
    
    inline def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    inline def setUserAgent(value: StringDictionary[Any]): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setVersion(value: StringDictionary[Any]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWorkerPools(value: js.Array[SchemaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    inline def setWorkerPoolsVarargs(value: SchemaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value*))
    
    inline def setWorkerRegion(value: String): Self = StObject.set(x, "workerRegion", value.asInstanceOf[js.Any])
    
    inline def setWorkerRegionNull: Self = StObject.set(x, "workerRegion", null)
    
    inline def setWorkerRegionUndefined: Self = StObject.set(x, "workerRegion", js.undefined)
    
    inline def setWorkerZone(value: String): Self = StObject.set(x, "workerZone", value.asInstanceOf[js.Any])
    
    inline def setWorkerZoneNull: Self = StObject.set(x, "workerZone", null)
    
    inline def setWorkerZoneUndefined: Self = StObject.set(x, "workerZone", js.undefined)
  }
}
