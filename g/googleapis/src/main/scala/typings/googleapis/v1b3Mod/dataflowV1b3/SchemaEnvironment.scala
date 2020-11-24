package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the environment in which a Dataflow Job runs.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  
  /**
    * The type of cluster manager API to use.  If unknown or unspecified, the
    * service will attempt to choose a reasonable default.  This should be in
    * the form of the API service name, e.g.
    * &quot;compute.googleapis.com&quot;.
    */
  var clusterManagerApiService: js.UndefOr[String] = js.native
  
  /**
    * The dataset for the current project where various workflow related tables
    * are stored.  The supported resource type is:  Google BigQuery:
    * bigquery.googleapis.com/{dataset}
    */
  var dataset: js.UndefOr[String] = js.native
  
  /**
    * The list of experiments to enable.
    */
  var experiments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Which Flexible Resource Scheduling mode to run in.
    */
  var flexResourceSchedulingGoal: js.UndefOr[String] = js.native
  
  /**
    * Experimental settings.
    */
  var internalExperiments: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These
    * options are passed through the service and are used to recreate the SDK
    * pipeline options on the worker in a language agnostic and platform
    * independent way.
    */
  var sdkPipelineOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Identity to run virtual machines as. Defaults to the default account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * If set, contains the Cloud KMS key identifier used to encrypt data at
    * rest, AKA a Customer Managed Encryption Key (CMEK).  Format:
    * projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
    */
  var serviceKmsKeyName: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the resources the system should use for temporary storage.
    * The system will append the suffix &quot;/temp-{JOBNAME} to this resource
    * prefix, where {JOBNAME} is the value of the job_name field.  The
    * resulting bucket and object prefix is used as the prefix of the resources
    * used to store temporary data needed during the job execution.  NOTE: This
    * will override the value in taskrunner_settings. The supported resource
    * type is:  Google Cloud Storage: storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  
  /**
    * A description of the process that generated the request.
    */
  var userAgent: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * A structure describing which components and their versions of the service
    * are required in order to run the job.
    */
  var version: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The worker pools. At least one &quot;harness&quot; worker pool must be
    * specified in order for the job to have workers.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.native
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
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
    def setClusterManagerApiService(value: String): Self = this.set("clusterManagerApiService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterManagerApiService: Self = this.set("clusterManagerApiService", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setExperimentsVarargs(value: String*): Self = this.set("experiments", js.Array(value :_*))
    
    @scala.inline
    def setExperiments(value: js.Array[String]): Self = this.set("experiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperiments: Self = this.set("experiments", js.undefined)
    
    @scala.inline
    def setFlexResourceSchedulingGoal(value: String): Self = this.set("flexResourceSchedulingGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexResourceSchedulingGoal: Self = this.set("flexResourceSchedulingGoal", js.undefined)
    
    @scala.inline
    def setInternalExperiments(value: StringDictionary[js.Any]): Self = this.set("internalExperiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalExperiments: Self = this.set("internalExperiments", js.undefined)
    
    @scala.inline
    def setSdkPipelineOptions(value: StringDictionary[js.Any]): Self = this.set("sdkPipelineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkPipelineOptions: Self = this.set("sdkPipelineOptions", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setServiceKmsKeyName(value: String): Self = this.set("serviceKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceKmsKeyName: Self = this.set("serviceKmsKeyName", js.undefined)
    
    @scala.inline
    def setTempStoragePrefix(value: String): Self = this.set("tempStoragePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempStoragePrefix: Self = this.set("tempStoragePrefix", js.undefined)
    
    @scala.inline
    def setUserAgent(value: StringDictionary[js.Any]): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setVersion(value: StringDictionary[js.Any]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWorkerPoolsVarargs(value: SchemaWorkerPool*): Self = this.set("workerPools", js.Array(value :_*))
    
    @scala.inline
    def setWorkerPools(value: js.Array[SchemaWorkerPool]): Self = this.set("workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerPools: Self = this.set("workerPools", js.undefined)
  }
}
