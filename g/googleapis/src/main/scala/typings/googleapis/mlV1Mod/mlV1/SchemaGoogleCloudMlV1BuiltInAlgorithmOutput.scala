package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents output related to a built-in algorithm Job.
  */
@js.native
trait SchemaGoogleCloudMlV1BuiltInAlgorithmOutput extends js.Object {
  /**
    * Framework on which the built-in algorithm was trained on.
    */
  var framework: js.UndefOr[String] = js.native
  /**
    * Built-in algorithm&#39;s saved model path. Only set for non-hptuning
    * succeeded jobs.
    */
  var modelPath: js.UndefOr[String] = js.native
  /**
    * Python version on which the built-in algorithm was trained on.
    */
  var pythonVersion: js.UndefOr[String] = js.native
  /**
    * CMLE runtime version on which the built-in algorithm was trained on.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1BuiltInAlgorithmOutput {
  @scala.inline
  def apply(
    framework: String = null,
    modelPath: String = null,
    pythonVersion: String = null,
    runtimeVersion: String = null
  ): SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (modelPath != null) __obj.updateDynamic("modelPath")(modelPath.asInstanceOf[js.Any])
    if (pythonVersion != null) __obj.updateDynamic("pythonVersion")(pythonVersion.asInstanceOf[js.Any])
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput]
  }
}

