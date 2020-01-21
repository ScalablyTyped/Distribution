package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a series of actions to execute, expressed as Docker containers.
  */
@js.native
trait SchemaPipeline extends js.Object {
  /**
    * The list of actions to execute, in the order they are specified.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.native
  /**
    * The environment to pass into every action. Each action can also specify
    * additional environment variables but cannot delete an entry from this map
    * (though they can overwrite it with a different value).
    */
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resources required for execution.
    */
  var resources: js.UndefOr[SchemaResources] = js.native
  /**
    * The maximum amount of time to give the pipeline to complete.  This
    * includes the time spent waiting for a worker to be allocated.  If the
    * pipeline fails to complete before the timeout, it will be cancelled and
    * the error code will be set to DEADLINE_EXCEEDED.  If unspecified, it will
    * default to 7 days.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaPipeline {
  @scala.inline
  def apply(
    actions: js.Array[SchemaAction] = null,
    environment: StringDictionary[String] = null,
    resources: SchemaResources = null,
    timeout: String = null
  ): SchemaPipeline = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPipeline]
  }
}

