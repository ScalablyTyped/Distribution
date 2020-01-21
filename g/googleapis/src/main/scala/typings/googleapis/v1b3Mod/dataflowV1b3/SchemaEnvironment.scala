package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    clusterManagerApiService: String = null,
    dataset: String = null,
    experiments: js.Array[String] = null,
    flexResourceSchedulingGoal: String = null,
    internalExperiments: StringDictionary[js.Any] = null,
    sdkPipelineOptions: StringDictionary[js.Any] = null,
    serviceAccountEmail: String = null,
    serviceKmsKeyName: String = null,
    tempStoragePrefix: String = null,
    userAgent: StringDictionary[js.Any] = null,
    version: StringDictionary[js.Any] = null,
    workerPools: js.Array[SchemaWorkerPool] = null
  ): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    if (clusterManagerApiService != null) __obj.updateDynamic("clusterManagerApiService")(clusterManagerApiService.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (experiments != null) __obj.updateDynamic("experiments")(experiments.asInstanceOf[js.Any])
    if (flexResourceSchedulingGoal != null) __obj.updateDynamic("flexResourceSchedulingGoal")(flexResourceSchedulingGoal.asInstanceOf[js.Any])
    if (internalExperiments != null) __obj.updateDynamic("internalExperiments")(internalExperiments.asInstanceOf[js.Any])
    if (sdkPipelineOptions != null) __obj.updateDynamic("sdkPipelineOptions")(sdkPipelineOptions.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (serviceKmsKeyName != null) __obj.updateDynamic("serviceKmsKeyName")(serviceKmsKeyName.asInstanceOf[js.Any])
    if (tempStoragePrefix != null) __obj.updateDynamic("tempStoragePrefix")(tempStoragePrefix.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironment]
  }
}

