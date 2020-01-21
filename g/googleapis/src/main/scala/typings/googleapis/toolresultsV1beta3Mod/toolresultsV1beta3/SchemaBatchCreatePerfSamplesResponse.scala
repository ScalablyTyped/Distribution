package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBatchCreatePerfSamplesResponse extends js.Object {
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}

object SchemaBatchCreatePerfSamplesResponse {
  @scala.inline
  def apply(perfSamples: js.Array[SchemaPerfSample] = null): SchemaBatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesResponse]
  }
}

