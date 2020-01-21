package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Runtime metadata that will be populated in the runtimeMetadata field of the
  * Operation associated with a RunPipeline execution.
  */
@js.native
trait SchemaRuntimeMetadata extends js.Object {
  /**
    * Execution information specific to Google Compute Engine.
    */
  var computeEngine: js.UndefOr[SchemaComputeEngine] = js.native
}

object SchemaRuntimeMetadata {
  @scala.inline
  def apply(computeEngine: SchemaComputeEngine = null): SchemaRuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    if (computeEngine != null) __obj.updateDynamic("computeEngine")(computeEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRuntimeMetadata]
  }
}

