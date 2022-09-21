package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedJob extends StObject {
  
  /** Optional. Job is a Hadoop job. */
  var hadoopJob: js.UndefOr[HadoopJob] = js.undefined
  
  /** Optional. Job is a Hive job. */
  var hiveJob: js.UndefOr[HiveJob] = js.undefined
  
  /**
    * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label
    * values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given
    * job.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.OrderedJob & TopLevel[Any]
  ] = js.undefined
  
  /** Optional. Job is a Pig job. */
  var pigJob: js.UndefOr[PigJob] = js.undefined
  
  /** Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow. */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Job is a Presto job. */
  var prestoJob: js.UndefOr[PrestoJob] = js.undefined
  
  /** Optional. Job is a PySpark job. */
  var pysparkJob: js.UndefOr[PySparkJob] = js.undefined
  
  /** Optional. Job scheduling configuration. */
  var scheduling: js.UndefOr[JobScheduling] = js.undefined
  
  /** Optional. Job is a Spark job. */
  var sparkJob: js.UndefOr[SparkJob] = js.undefined
  
  /** Optional. Job is a SparkR job. */
  var sparkRJob: js.UndefOr[SparkRJob] = js.undefined
  
  /** Optional. Job is a SparkSql job. */
  var sparkSqlJob: js.UndefOr[SparkSqlJob] = js.undefined
  
  /**
    * Required. The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in
    * prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or
    * hyphen. Must consist of between 3 and 50 characters.
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object OrderedJob {
  
  inline def apply(): OrderedJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedJob]
  }
  
  extension [Self <: OrderedJob](x: Self) {
    
    inline def setHadoopJob(value: HadoopJob): Self = StObject.set(x, "hadoopJob", value.asInstanceOf[js.Any])
    
    inline def setHadoopJobUndefined: Self = StObject.set(x, "hadoopJob", js.undefined)
    
    inline def setHiveJob(value: HiveJob): Self = StObject.set(x, "hiveJob", value.asInstanceOf[js.Any])
    
    inline def setHiveJobUndefined: Self = StObject.set(x, "hiveJob", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.OrderedJob & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPigJob(value: PigJob): Self = StObject.set(x, "pigJob", value.asInstanceOf[js.Any])
    
    inline def setPigJobUndefined: Self = StObject.set(x, "pigJob", js.undefined)
    
    inline def setPrerequisiteStepIds(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteStepIdsUndefined: Self = StObject.set(x, "prerequisiteStepIds", js.undefined)
    
    inline def setPrerequisiteStepIdsVarargs(value: String*): Self = StObject.set(x, "prerequisiteStepIds", js.Array(value*))
    
    inline def setPrestoJob(value: PrestoJob): Self = StObject.set(x, "prestoJob", value.asInstanceOf[js.Any])
    
    inline def setPrestoJobUndefined: Self = StObject.set(x, "prestoJob", js.undefined)
    
    inline def setPysparkJob(value: PySparkJob): Self = StObject.set(x, "pysparkJob", value.asInstanceOf[js.Any])
    
    inline def setPysparkJobUndefined: Self = StObject.set(x, "pysparkJob", js.undefined)
    
    inline def setScheduling(value: JobScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setSparkJob(value: SparkJob): Self = StObject.set(x, "sparkJob", value.asInstanceOf[js.Any])
    
    inline def setSparkJobUndefined: Self = StObject.set(x, "sparkJob", js.undefined)
    
    inline def setSparkRJob(value: SparkRJob): Self = StObject.set(x, "sparkRJob", value.asInstanceOf[js.Any])
    
    inline def setSparkRJobUndefined: Self = StObject.set(x, "sparkRJob", js.undefined)
    
    inline def setSparkSqlJob(value: SparkSqlJob): Self = StObject.set(x, "sparkSqlJob", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlJobUndefined: Self = StObject.set(x, "sparkSqlJob", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
