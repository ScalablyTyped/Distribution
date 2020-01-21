package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

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
  def apply(
    hadoopJob: SchemaHadoopJob = null,
    hiveJob: SchemaHiveJob = null,
    labels: StringDictionary[String] = null,
    pigJob: SchemaPigJob = null,
    prerequisiteStepIds: js.Array[String] = null,
    pysparkJob: SchemaPySparkJob = null,
    scheduling: SchemaJobScheduling = null,
    sparkJob: SchemaSparkJob = null,
    sparkSqlJob: SchemaSparkSqlJob = null,
    stepId: String = null
  ): SchemaOrderedJob = {
    val __obj = js.Dynamic.literal()
    if (hadoopJob != null) __obj.updateDynamic("hadoopJob")(hadoopJob.asInstanceOf[js.Any])
    if (hiveJob != null) __obj.updateDynamic("hiveJob")(hiveJob.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pigJob != null) __obj.updateDynamic("pigJob")(pigJob.asInstanceOf[js.Any])
    if (prerequisiteStepIds != null) __obj.updateDynamic("prerequisiteStepIds")(prerequisiteStepIds.asInstanceOf[js.Any])
    if (pysparkJob != null) __obj.updateDynamic("pysparkJob")(pysparkJob.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    if (sparkJob != null) __obj.updateDynamic("sparkJob")(sparkJob.asInstanceOf[js.Any])
    if (sparkSqlJob != null) __obj.updateDynamic("sparkSqlJob")(sparkSqlJob.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderedJob]
  }
}

