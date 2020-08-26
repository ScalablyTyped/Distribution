package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A job executed by the workflow.
  */
@js.native
trait SchemaOrderedJob extends js.Object {
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
  implicit class SchemaOrderedJobOps[Self <: SchemaOrderedJob] (val x: Self) extends AnyVal {
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
    def setHadoopJob(value: SchemaHadoopJob): Self = this.set("hadoopJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHadoopJob: Self = this.set("hadoopJob", js.undefined)
    @scala.inline
    def setHiveJob(value: SchemaHiveJob): Self = this.set("hiveJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiveJob: Self = this.set("hiveJob", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPigJob(value: SchemaPigJob): Self = this.set("pigJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePigJob: Self = this.set("pigJob", js.undefined)
    @scala.inline
    def setPrerequisiteStepIdsVarargs(value: String*): Self = this.set("prerequisiteStepIds", js.Array(value :_*))
    @scala.inline
    def setPrerequisiteStepIds(value: js.Array[String]): Self = this.set("prerequisiteStepIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerequisiteStepIds: Self = this.set("prerequisiteStepIds", js.undefined)
    @scala.inline
    def setPysparkJob(value: SchemaPySparkJob): Self = this.set("pysparkJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePysparkJob: Self = this.set("pysparkJob", js.undefined)
    @scala.inline
    def setScheduling(value: SchemaJobScheduling): Self = this.set("scheduling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduling: Self = this.set("scheduling", js.undefined)
    @scala.inline
    def setSparkJob(value: SchemaSparkJob): Self = this.set("sparkJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparkJob: Self = this.set("sparkJob", js.undefined)
    @scala.inline
    def setSparkSqlJob(value: SchemaSparkSqlJob): Self = this.set("sparkSqlJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparkSqlJob: Self = this.set("sparkSqlJob", js.undefined)
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
  
}

