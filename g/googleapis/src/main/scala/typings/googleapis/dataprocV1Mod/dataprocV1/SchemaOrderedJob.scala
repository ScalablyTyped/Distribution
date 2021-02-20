package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A job executed by the workflow.
  */
@js.native
trait SchemaOrderedJob extends StObject {
  
  /**
    * Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[SchemaHadoopJob] = js.native
  
  /**
    * Job is a Hive job.
    */
  var hiveJob: js.UndefOr[SchemaHiveJob] = js.native
  
  /**
    * Optional. The labels to associate with this job.Label keys must be
    * between 1 and 63 characters long, and must conform to the following
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following regular expression:
    * \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a
    * given job.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Job is a Pig job.
    */
  var pigJob: js.UndefOr[SchemaPigJob] = js.native
  
  /**
    * Optional. The optional list of prerequisite job step_ids. If not
    * specified, the job will start at the beginning of workflow.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Job is a Pyspark job.
    */
  var pysparkJob: js.UndefOr[SchemaPySparkJob] = js.native
  
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[SchemaJobScheduling] = js.native
  
  /**
    * Job is a Spark job.
    */
  var sparkJob: js.UndefOr[SchemaSparkJob] = js.native
  
  /**
    * Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[SchemaSparkSqlJob] = js.native
  
  /**
    * Required. The step id. The id must be unique among all jobs within the
    * template.The step id is used as prefix for job id, as job
    * goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field
    * from other steps.The id must contain only letters (a-z, A-Z), numbers
    * (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var stepId: js.UndefOr[String] = js.native
}
object SchemaOrderedJob {
  
  @scala.inline
  def apply(): SchemaOrderedJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderedJob]
  }
  
  @scala.inline
  implicit class SchemaOrderedJobMutableBuilder[Self <: SchemaOrderedJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHadoopJob(value: SchemaHadoopJob): Self = StObject.set(x, "hadoopJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHadoopJobUndefined: Self = StObject.set(x, "hadoopJob", js.undefined)
    
    @scala.inline
    def setHiveJob(value: SchemaHiveJob): Self = StObject.set(x, "hiveJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiveJobUndefined: Self = StObject.set(x, "hiveJob", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPigJob(value: SchemaPigJob): Self = StObject.set(x, "pigJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPigJobUndefined: Self = StObject.set(x, "pigJob", js.undefined)
    
    @scala.inline
    def setPrerequisiteStepIds(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerequisiteStepIdsUndefined: Self = StObject.set(x, "prerequisiteStepIds", js.undefined)
    
    @scala.inline
    def setPrerequisiteStepIdsVarargs(value: String*): Self = StObject.set(x, "prerequisiteStepIds", js.Array(value :_*))
    
    @scala.inline
    def setPysparkJob(value: SchemaPySparkJob): Self = StObject.set(x, "pysparkJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPysparkJobUndefined: Self = StObject.set(x, "pysparkJob", js.undefined)
    
    @scala.inline
    def setScheduling(value: SchemaJobScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    @scala.inline
    def setSparkJob(value: SchemaSparkJob): Self = StObject.set(x, "sparkJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparkJobUndefined: Self = StObject.set(x, "sparkJob", js.undefined)
    
    @scala.inline
    def setSparkSqlJob(value: SchemaSparkSqlJob): Self = StObject.set(x, "sparkSqlJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparkSqlJobUndefined: Self = StObject.set(x, "sparkSqlJob", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
