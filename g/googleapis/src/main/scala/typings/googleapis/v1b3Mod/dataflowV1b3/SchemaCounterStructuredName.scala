package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a counter within a per-job namespace. Counters whose structured
  * names are the same get merged into a single value for the job.
  */
@js.native
trait SchemaCounterStructuredName extends js.Object {
  /**
    * Name of the optimized step being executed by the workers.
    */
  var componentStepName: js.UndefOr[String] = js.native
  /**
    * Name of the stage. An execution step contains multiple component steps.
    */
  var executionStepName: js.UndefOr[String] = js.native
  /**
    * Index of an input collection that&#39;s being read from/written to as a
    * side input. The index identifies a step&#39;s side inputs starting by 1
    * (e.g. the first side input has input_index 1, the third has input_index
    * 3). Side inputs are identified by a pair of (original_step_name,
    * input_index). This field helps uniquely identify them.
    */
  var inputIndex: js.UndefOr[Double] = js.native
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * One of the standard Origins defined above.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * A string containing a more specific namespace of the counter&#39;s
    * origin.
    */
  var originNamespace: js.UndefOr[String] = js.native
  /**
    * The step name requesting an operation, such as GBK. I.e. the ParDo
    * causing a read/write from shuffle to occur, or a read from side inputs.
    */
  var originalRequestingStepName: js.UndefOr[String] = js.native
  /**
    * System generated name of the original step in the user&#39;s graph,
    * before optimization.
    */
  var originalStepName: js.UndefOr[String] = js.native
  /**
    * Portion of this counter, either key or value.
    */
  var portion: js.UndefOr[String] = js.native
  /**
    * ID of a particular worker.
    */
  var workerId: js.UndefOr[String] = js.native
}

object SchemaCounterStructuredName {
  @scala.inline
  def apply(
    componentStepName: String = null,
    executionStepName: String = null,
    inputIndex: js.UndefOr[Double] = js.undefined,
    name: String = null,
    origin: String = null,
    originNamespace: String = null,
    originalRequestingStepName: String = null,
    originalStepName: String = null,
    portion: String = null,
    workerId: String = null
  ): SchemaCounterStructuredName = {
    val __obj = js.Dynamic.literal()
    if (componentStepName != null) __obj.updateDynamic("componentStepName")(componentStepName.asInstanceOf[js.Any])
    if (executionStepName != null) __obj.updateDynamic("executionStepName")(executionStepName.asInstanceOf[js.Any])
    if (!js.isUndefined(inputIndex)) __obj.updateDynamic("inputIndex")(inputIndex.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originNamespace != null) __obj.updateDynamic("originNamespace")(originNamespace.asInstanceOf[js.Any])
    if (originalRequestingStepName != null) __obj.updateDynamic("originalRequestingStepName")(originalRequestingStepName.asInstanceOf[js.Any])
    if (originalStepName != null) __obj.updateDynamic("originalStepName")(originalStepName.asInstanceOf[js.Any])
    if (portion != null) __obj.updateDynamic("portion")(portion.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCounterStructuredName]
  }
}

