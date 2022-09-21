package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderedJob extends StObject {
  
  /**
    * Optional. Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[SchemaHadoopJob] = js.undefined
  
  /**
    * Optional. Job is a Hive job.
    */
  var hiveJob: js.UndefOr[SchemaHiveJob] = js.undefined
  
  /**
    * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll\}\p{Lo\}{0,62\}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll\}\p{Lo\}\p{N\}_-{0,63\}No more than 32 labels can be associated with a given job.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Job is a Pig job.
    */
  var pigJob: js.UndefOr[SchemaPigJob] = js.undefined
  
  /**
    * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Job is a Presto job.
    */
  var prestoJob: js.UndefOr[SchemaPrestoJob] = js.undefined
  
  /**
    * Optional. Job is a PySpark job.
    */
  var pysparkJob: js.UndefOr[SchemaPySparkJob] = js.undefined
  
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[SchemaJobScheduling] = js.undefined
  
  /**
    * Optional. Job is a Spark job.
    */
  var sparkJob: js.UndefOr[SchemaSparkJob] = js.undefined
  
  /**
    * Optional. Job is a SparkR job.
    */
  var sparkRJob: js.UndefOr[SchemaSparkRJob] = js.undefined
  
  /**
    * Optional. Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[SchemaSparkSqlJob] = js.undefined
  
  /**
    * Required. The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var stepId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderedJob {
  
  inline def apply(): SchemaOrderedJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderedJob]
  }
  
  extension [Self <: SchemaOrderedJob](x: Self) {
    
    inline def setHadoopJob(value: SchemaHadoopJob): Self = StObject.set(x, "hadoopJob", value.asInstanceOf[js.Any])
    
    inline def setHadoopJobUndefined: Self = StObject.set(x, "hadoopJob", js.undefined)
    
    inline def setHiveJob(value: SchemaHiveJob): Self = StObject.set(x, "hiveJob", value.asInstanceOf[js.Any])
    
    inline def setHiveJobUndefined: Self = StObject.set(x, "hiveJob", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPigJob(value: SchemaPigJob): Self = StObject.set(x, "pigJob", value.asInstanceOf[js.Any])
    
    inline def setPigJobUndefined: Self = StObject.set(x, "pigJob", js.undefined)
    
    inline def setPrerequisiteStepIds(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteStepIdsNull: Self = StObject.set(x, "prerequisiteStepIds", null)
    
    inline def setPrerequisiteStepIdsUndefined: Self = StObject.set(x, "prerequisiteStepIds", js.undefined)
    
    inline def setPrerequisiteStepIdsVarargs(value: String*): Self = StObject.set(x, "prerequisiteStepIds", js.Array(value*))
    
    inline def setPrestoJob(value: SchemaPrestoJob): Self = StObject.set(x, "prestoJob", value.asInstanceOf[js.Any])
    
    inline def setPrestoJobUndefined: Self = StObject.set(x, "prestoJob", js.undefined)
    
    inline def setPysparkJob(value: SchemaPySparkJob): Self = StObject.set(x, "pysparkJob", value.asInstanceOf[js.Any])
    
    inline def setPysparkJobUndefined: Self = StObject.set(x, "pysparkJob", js.undefined)
    
    inline def setScheduling(value: SchemaJobScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setSparkJob(value: SchemaSparkJob): Self = StObject.set(x, "sparkJob", value.asInstanceOf[js.Any])
    
    inline def setSparkJobUndefined: Self = StObject.set(x, "sparkJob", js.undefined)
    
    inline def setSparkRJob(value: SchemaSparkRJob): Self = StObject.set(x, "sparkRJob", value.asInstanceOf[js.Any])
    
    inline def setSparkRJobUndefined: Self = StObject.set(x, "sparkRJob", js.undefined)
    
    inline def setSparkSqlJob(value: SchemaSparkSqlJob): Self = StObject.set(x, "sparkSqlJob", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlJobUndefined: Self = StObject.set(x, "sparkSqlJob", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdNull: Self = StObject.set(x, "stepId", null)
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
