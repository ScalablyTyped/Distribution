package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job resource.
  */
trait SchemaJob extends StObject {
  
  /**
    * Output only. If present, the location of miscellaneous control files
    * which may be used as part of job setup and handling. If not present,
    * control files may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A URI pointing to the location of the stdout of the
    * job&#39;s driver program.
    */
  var driverOutputResourceUri: js.UndefOr[String] = js.undefined
  
  /**
    * Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[SchemaHadoopJob] = js.undefined
  
  /**
    * Job is a Hive job.
    */
  var hiveJob: js.UndefOr[SchemaHiveJob] = js.undefined
  
  /**
    * Output only. A UUID that uniquely identifies a job within the project
    * over time. This is in contrast to a user-settable reference.job_id that
    * may be reused over time.
    */
  var jobUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The labels to associate with this job. Label keys must contain
    * 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a job.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Job is a Pig job.
    */
  var pigJob: js.UndefOr[SchemaPigJob] = js.undefined
  
  /**
    * Required. Job information, including how, when, and where to run the job.
    */
  var placement: js.UndefOr[SchemaJobPlacement] = js.undefined
  
  /**
    * Job is a Pyspark job.
    */
  var pysparkJob: js.UndefOr[SchemaPySparkJob] = js.undefined
  
  /**
    * Optional. The fully qualified reference to the job, which can be used to
    * obtain the equivalent REST path of the job resource. If this property is
    * not specified when a job is created, the server generates a
    * &lt;code&gt;job_id&lt;/code&gt;.
    */
  var reference: js.UndefOr[SchemaJobReference] = js.undefined
  
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[SchemaJobScheduling] = js.undefined
  
  /**
    * Job is a Spark job.
    */
  var sparkJob: js.UndefOr[SchemaSparkJob] = js.undefined
  
  /**
    * Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[SchemaSparkSqlJob] = js.undefined
  
  /**
    * Output only. The job status. Additional application-specific status
    * information may be contained in the &lt;code&gt;type_job&lt;/code&gt; and
    * &lt;code&gt;yarn_applications&lt;/code&gt; fields.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.undefined
  
  /**
    * Output only. The previous job status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaJobStatus]] = js.undefined
  
  /**
    * Output only. The collection of YARN applications spun up by this job.Beta
    * Feature: This report is available for testing purposes only. It may be
    * changed before final release.
    */
  var yarnApplications: js.UndefOr[js.Array[SchemaYarnApplication]] = js.undefined
}
object SchemaJob {
  
  inline def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  extension [Self <: SchemaJob](x: Self) {
    
    inline def setDriverControlFilesUri(value: String): Self = StObject.set(x, "driverControlFilesUri", value.asInstanceOf[js.Any])
    
    inline def setDriverControlFilesUriUndefined: Self = StObject.set(x, "driverControlFilesUri", js.undefined)
    
    inline def setDriverOutputResourceUri(value: String): Self = StObject.set(x, "driverOutputResourceUri", value.asInstanceOf[js.Any])
    
    inline def setDriverOutputResourceUriUndefined: Self = StObject.set(x, "driverOutputResourceUri", js.undefined)
    
    inline def setHadoopJob(value: SchemaHadoopJob): Self = StObject.set(x, "hadoopJob", value.asInstanceOf[js.Any])
    
    inline def setHadoopJobUndefined: Self = StObject.set(x, "hadoopJob", js.undefined)
    
    inline def setHiveJob(value: SchemaHiveJob): Self = StObject.set(x, "hiveJob", value.asInstanceOf[js.Any])
    
    inline def setHiveJobUndefined: Self = StObject.set(x, "hiveJob", js.undefined)
    
    inline def setJobUuid(value: String): Self = StObject.set(x, "jobUuid", value.asInstanceOf[js.Any])
    
    inline def setJobUuidUndefined: Self = StObject.set(x, "jobUuid", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPigJob(value: SchemaPigJob): Self = StObject.set(x, "pigJob", value.asInstanceOf[js.Any])
    
    inline def setPigJobUndefined: Self = StObject.set(x, "pigJob", js.undefined)
    
    inline def setPlacement(value: SchemaJobPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPysparkJob(value: SchemaPySparkJob): Self = StObject.set(x, "pysparkJob", value.asInstanceOf[js.Any])
    
    inline def setPysparkJobUndefined: Self = StObject.set(x, "pysparkJob", js.undefined)
    
    inline def setReference(value: SchemaJobReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setScheduling(value: SchemaJobScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setSparkJob(value: SchemaSparkJob): Self = StObject.set(x, "sparkJob", value.asInstanceOf[js.Any])
    
    inline def setSparkJobUndefined: Self = StObject.set(x, "sparkJob", js.undefined)
    
    inline def setSparkSqlJob(value: SchemaSparkSqlJob): Self = StObject.set(x, "sparkSqlJob", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlJobUndefined: Self = StObject.set(x, "sparkSqlJob", js.undefined)
    
    inline def setStatus(value: SchemaJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[SchemaJobStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: SchemaJobStatus*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setYarnApplications(value: js.Array[SchemaYarnApplication]): Self = StObject.set(x, "yarnApplications", value.asInstanceOf[js.Any])
    
    inline def setYarnApplicationsUndefined: Self = StObject.set(x, "yarnApplications", js.undefined)
    
    inline def setYarnApplicationsVarargs(value: SchemaYarnApplication*): Self = StObject.set(x, "yarnApplications", js.Array(value :_*))
  }
}
