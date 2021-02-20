package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Step represents a single operation performed as part of Execution. A step
  * can be used to represent the execution of a tool ( for example a test
  * runner execution or an execution of a compiler).  Steps can overlap (for
  * instance two steps might have the same start time if some operations are
  * done in parallel).  Here is an example, let&#39;s consider that we have a
  * continuous build is executing a test runner for each iteration. The
  * workflow would look like: - user creates a Execution with id 1 - user
  * creates an TestExecutionStep with id 100 for Execution 1 - user update
  * TestExecutionStep with id 100 to add a raw xml log + the service parses the
  * xml logs and returns a TestExecutionStep with updated TestResult(s). - user
  * update the status of TestExecutionStep with id 100 to COMPLETE  A Step can
  * be updated until its state is set to COMPLETE at which points it becomes
  * immutable.
  */
@js.native
trait SchemaStep extends StObject {
  
  /**
    * The time when the step status was set to complete.  This value will be
    * set automatically when state transitions to COMPLETE.  - In response: set
    * if the execution state is COMPLETE. - In create/update request: never set
    */
  var completionTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * The time when the step was created.  - In response: always set - In
    * create/update request: never set
    */
  var creationTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * A description of this tool For example: mvn clean package -D
    * skipTests=true  - In response: present if set by create/update request -
    * In create/update request: optional
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * How much the device resource is used to perform the test.  This is the
    * device usage used for billing purpose, which is different from the
    * run_duration, for example, infrastructure failure won&#39;t be charged
    * for device usage.  PRECONDITION_FAILED will be returned if one attempts
    * to set a device_usage on a step which already has this field set.  - In
    * response: present if previously set. - In create request: optional - In
    * update request: optional
    */
  var deviceUsageDuration: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * If the execution containing this step has any dimension_definition set,
    * then this field allows the child to specify the values of the dimensions.
    * The keys must exactly match the dimension_definition of the execution.
    * For example, if the execution has `dimension_definition =
    * [&#39;attempt&#39;, &#39;device&#39;]` then a step must define values for
    * those dimensions, eg. `dimension_value = [&#39;attempt&#39;: &#39;1&#39;,
    * &#39;device&#39;: &#39;Nexus 6&#39;]`  If a step does not participate in
    * one dimension of the matrix, the value for that dimension should be empty
    * string. For example, if one of the tests is executed by a runner which
    * does not support retries, the step could have `dimension_value =
    * [&#39;attempt&#39;: &#39;&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]`  If
    * the step does not participate in any dimensions of the matrix, it may
    * leave dimension_value unset.  A PRECONDITION_FAILED will be returned if
    * any of the keys do not exist in the dimension_definition of the
    * execution.  A PRECONDITION_FAILED will be returned if another step in
    * this execution already has the same name and dimension_value, but differs
    * on other data fields, for example, step field is different.  A
    * PRECONDITION_FAILED will be returned if dimension_value is set, and there
    * is a dimension_definition in the execution which is not specified as one
    * of the keys.  - In response: present if set by create - In create
    * request: optional - In update request: never set
    */
  var dimensionValue: js.UndefOr[js.Array[SchemaStepDimensionValueEntry]] = js.native
  
  /**
    * Whether any of the outputs of this step are images whose thumbnails can
    * be fetched with ListThumbnails.  - In response: always set - In
    * create/update request: never set
    */
  var hasImages: js.UndefOr[Boolean] = js.native
  
  /**
    * Arbitrary user-supplied key/value pairs that are associated with the
    * step.  Users are responsible for managing the key namespace such that
    * keys don&#39;t accidentally collide.  An INVALID_ARGUMENT will be
    * returned if the number of labels exceeds 100 or if the length of any of
    * the keys or values exceeds 100 characters.  - In response: always set -
    * In create request: optional - In update request: optional; any new
    * key/value pair will be added to the map, and any new value for an
    * existing key will update that key&#39;s value
    */
  var labels: js.UndefOr[js.Array[SchemaStepLabelsEntry]] = js.native
  
  /**
    * Details when multiple steps are run with the same configuration as a
    * group. These details can be used identify which group this step is part
    * of. It also identifies the groups &#39;primary step&#39; which indexes
    * all the group members.  - In response: present if previously set. - In
    * create request: optional, set iff this step was performed more than once.
    * - In update request: optional
    */
  var multiStep: js.UndefOr[SchemaMultiStep] = js.native
  
  /**
    * A short human-readable name to display in the UI. Maximum of 100
    * characters. For example: Clean build  A PRECONDITION_FAILED will be
    * returned upon creating a new step if it shares its name and
    * dimension_value with an existing step. If two steps represent a similar
    * action, but have different dimension values, they should share the same
    * name. For instance, if the same set of tests is run on two different
    * platforms, the two steps should have the same name.  - In response:
    * always set - In create request: always set - In update request: never set
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Classification of the result, for example into SUCCESS or FAILURE  - In
    * response: present if set by create/update request - In create/update
    * request: optional
    */
  var outcome: js.UndefOr[SchemaOutcome] = js.native
  
  /**
    * How long it took for this step to run.  If unset, this is set to the
    * difference between creation_time and completion_time when the step is set
    * to the COMPLETE state. In some cases, it is appropriate to set this value
    * separately: For instance, if a step is created, but the operation it
    * represents is queued for a few minutes before it executes, it would be
    * appropriate not to include the time spent queued in its run_duration.
    * PRECONDITION_FAILED will be returned if one attempts to set a
    * run_duration on a step which already has this field set.  - In response:
    * present if previously set; always present on COMPLETE step - In create
    * request: optional - In update request: optional
    */
  var runDuration: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * The initial state is IN_PROGRESS. The only legal state transitions are *
    * IN_PROGRESS -&gt; COMPLETE  A PRECONDITION_FAILED will be returned if an
    * invalid transition is requested.  It is valid to create Step with a state
    * set to COMPLETE. The state can only be set to COMPLETE once. A
    * PRECONDITION_FAILED will be returned if the state is set to COMPLETE
    * multiple times.  - In response: always set - In create/update request:
    * optional
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier within a Execution for this Step.  Returns
    * INVALID_ARGUMENT if this field is set or overwritten by the caller.  - In
    * response: always set - In create/update request: never set
    */
  var stepId: js.UndefOr[String] = js.native
  
  /**
    * An execution of a test runner.
    */
  var testExecutionStep: js.UndefOr[SchemaTestExecutionStep] = js.native
  
  /**
    * An execution of a tool (used for steps we don&#39;t explicitly support).
    */
  var toolExecutionStep: js.UndefOr[SchemaToolExecutionStep] = js.native
}
object SchemaStep {
  
  @scala.inline
  def apply(): SchemaStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStep]
  }
  
  @scala.inline
  implicit class SchemaStepMutableBuilder[Self <: SchemaStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: SchemaTimestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: SchemaTimestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeviceUsageDuration(value: SchemaDuration): Self = StObject.set(x, "deviceUsageDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUsageDurationUndefined: Self = StObject.set(x, "deviceUsageDuration", js.undefined)
    
    @scala.inline
    def setDimensionValue(value: js.Array[SchemaStepDimensionValueEntry]): Self = StObject.set(x, "dimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionValueUndefined: Self = StObject.set(x, "dimensionValue", js.undefined)
    
    @scala.inline
    def setDimensionValueVarargs(value: SchemaStepDimensionValueEntry*): Self = StObject.set(x, "dimensionValue", js.Array(value :_*))
    
    @scala.inline
    def setHasImages(value: Boolean): Self = StObject.set(x, "hasImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasImagesUndefined: Self = StObject.set(x, "hasImages", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaStepLabelsEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaStepLabelsEntry*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setMultiStep(value: SchemaMultiStep): Self = StObject.set(x, "multiStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiStepUndefined: Self = StObject.set(x, "multiStep", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutcome(value: SchemaOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setRunDuration(value: SchemaDuration): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunDurationUndefined: Self = StObject.set(x, "runDuration", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    @scala.inline
    def setTestExecutionStep(value: SchemaTestExecutionStep): Self = StObject.set(x, "testExecutionStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestExecutionStepUndefined: Self = StObject.set(x, "testExecutionStep", js.undefined)
    
    @scala.inline
    def setToolExecutionStep(value: SchemaToolExecutionStep): Self = StObject.set(x, "toolExecutionStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolExecutionStepUndefined: Self = StObject.set(x, "toolExecutionStep", js.undefined)
  }
}
