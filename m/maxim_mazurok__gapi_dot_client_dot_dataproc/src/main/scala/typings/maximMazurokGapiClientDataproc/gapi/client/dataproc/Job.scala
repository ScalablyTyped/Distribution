package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    * Output only. Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it
    * was successful, failed, or cancelled.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same
    * location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.undefined
  
  /** Output only. A URI pointing to the location of the stdout of the job's driver program. */
  var driverOutputResourceUri: js.UndefOr[String] = js.undefined
  
  /** Optional. Job is a Hadoop job. */
  var hadoopJob: js.UndefOr[HadoopJob] = js.undefined
  
  /** Optional. Job is a Hive job. */
  var hiveJob: js.UndefOr[HiveJob] = js.undefined
  
  /** Output only. A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time. */
  var jobUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be
    * empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.Job & TopLevel[Any]
  ] = js.undefined
  
  /** Optional. Job is a Pig job. */
  var pigJob: js.UndefOr[PigJob] = js.undefined
  
  /** Required. Job information, including how, when, and where to run the job. */
  var placement: js.UndefOr[JobPlacement] = js.undefined
  
  /** Optional. Job is a Presto job. */
  var prestoJob: js.UndefOr[PrestoJob] = js.undefined
  
  /** Optional. Job is a PySpark job. */
  var pysparkJob: js.UndefOr[PySparkJob] = js.undefined
  
  /**
    * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is
    * created, the server generates a job_id.
    */
  var reference: js.UndefOr[JobReference] = js.undefined
  
  /** Optional. Job scheduling configuration. */
  var scheduling: js.UndefOr[JobScheduling] = js.undefined
  
  /** Optional. Job is a Spark job. */
  var sparkJob: js.UndefOr[SparkJob] = js.undefined
  
  /** Optional. Job is a SparkR job. */
  var sparkRJob: js.UndefOr[SparkRJob] = js.undefined
  
  /** Optional. Job is a SparkSql job. */
  var sparkSqlJob: js.UndefOr[SparkSqlJob] = js.undefined
  
  /** Output only. The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields. */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /** Output only. The previous job status. */
  var statusHistory: js.UndefOr[js.Array[JobStatus]] = js.undefined
  
  /** Output only. The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release. */
  var yarnApplications: js.UndefOr[js.Array[YarnApplication]] = js.undefined
}
object Job {
  
  inline def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setDriverControlFilesUri(value: String): Self = StObject.set(x, "driverControlFilesUri", value.asInstanceOf[js.Any])
    
    inline def setDriverControlFilesUriUndefined: Self = StObject.set(x, "driverControlFilesUri", js.undefined)
    
    inline def setDriverOutputResourceUri(value: String): Self = StObject.set(x, "driverOutputResourceUri", value.asInstanceOf[js.Any])
    
    inline def setDriverOutputResourceUriUndefined: Self = StObject.set(x, "driverOutputResourceUri", js.undefined)
    
    inline def setHadoopJob(value: HadoopJob): Self = StObject.set(x, "hadoopJob", value.asInstanceOf[js.Any])
    
    inline def setHadoopJobUndefined: Self = StObject.set(x, "hadoopJob", js.undefined)
    
    inline def setHiveJob(value: HiveJob): Self = StObject.set(x, "hiveJob", value.asInstanceOf[js.Any])
    
    inline def setHiveJobUndefined: Self = StObject.set(x, "hiveJob", js.undefined)
    
    inline def setJobUuid(value: String): Self = StObject.set(x, "jobUuid", value.asInstanceOf[js.Any])
    
    inline def setJobUuidUndefined: Self = StObject.set(x, "jobUuid", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.Job & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPigJob(value: PigJob): Self = StObject.set(x, "pigJob", value.asInstanceOf[js.Any])
    
    inline def setPigJobUndefined: Self = StObject.set(x, "pigJob", js.undefined)
    
    inline def setPlacement(value: JobPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPrestoJob(value: PrestoJob): Self = StObject.set(x, "prestoJob", value.asInstanceOf[js.Any])
    
    inline def setPrestoJobUndefined: Self = StObject.set(x, "prestoJob", js.undefined)
    
    inline def setPysparkJob(value: PySparkJob): Self = StObject.set(x, "pysparkJob", value.asInstanceOf[js.Any])
    
    inline def setPysparkJobUndefined: Self = StObject.set(x, "pysparkJob", js.undefined)
    
    inline def setReference(value: JobReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setScheduling(value: JobScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setSparkJob(value: SparkJob): Self = StObject.set(x, "sparkJob", value.asInstanceOf[js.Any])
    
    inline def setSparkJobUndefined: Self = StObject.set(x, "sparkJob", js.undefined)
    
    inline def setSparkRJob(value: SparkRJob): Self = StObject.set(x, "sparkRJob", value.asInstanceOf[js.Any])
    
    inline def setSparkRJobUndefined: Self = StObject.set(x, "sparkRJob", js.undefined)
    
    inline def setSparkSqlJob(value: SparkSqlJob): Self = StObject.set(x, "sparkSqlJob", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlJobUndefined: Self = StObject.set(x, "sparkSqlJob", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[JobStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: JobStatus*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setYarnApplications(value: js.Array[YarnApplication]): Self = StObject.set(x, "yarnApplications", value.asInstanceOf[js.Any])
    
    inline def setYarnApplicationsUndefined: Self = StObject.set(x, "yarnApplications", js.undefined)
    
    inline def setYarnApplicationsVarargs(value: YarnApplication*): Self = StObject.set(x, "yarnApplications", js.Array(value*))
  }
}
