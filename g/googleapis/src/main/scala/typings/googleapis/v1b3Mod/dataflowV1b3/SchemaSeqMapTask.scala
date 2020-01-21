package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a particular function to invoke.
  */
@js.native
trait SchemaSeqMapTask extends js.Object {
  /**
    * Information about each of the inputs.
    */
  var inputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The user-provided name of the SeqDo operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Information about each of the outputs.
    */
  var outputInfos: js.UndefOr[js.Array[SchemaSeqMapTaskOutputInfo]] = js.native
  /**
    * System-defined name of the stage containing the SeqDo operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of the SeqDo operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaSeqMapTask {
  @scala.inline
  def apply(
    inputs: js.Array[SchemaSideInputInfo] = null,
    name: String = null,
    outputInfos: js.Array[SchemaSeqMapTaskOutputInfo] = null,
    stageName: String = null,
    systemName: String = null,
    userFn: StringDictionary[js.Any] = null
  ): SchemaSeqMapTask = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputInfos != null) __obj.updateDynamic("outputInfos")(outputInfos.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    if (userFn != null) __obj.updateDynamic("userFn")(userFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeqMapTask]
  }
}

