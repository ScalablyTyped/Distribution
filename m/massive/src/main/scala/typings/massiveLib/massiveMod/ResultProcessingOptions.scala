package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProcessingOptions extends js.Object {
  var build: js.UndefOr[scala.Boolean] = js.undefined
  var decompose: js.UndefOr[DecomposeOptions] = js.undefined
  var document: js.UndefOr[scala.Boolean] = js.undefined
  var single: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object ResultProcessingOptions {
  @scala.inline
  def apply(
    build: js.UndefOr[scala.Boolean] = js.undefined,
    decompose: DecomposeOptions = null,
    document: js.UndefOr[scala.Boolean] = js.undefined,
    single: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined
  ): ResultProcessingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(build)) __obj.updateDynamic("build")(build)
    if (decompose != null) __obj.updateDynamic("decompose")(decompose)
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[ResultProcessingOptions]
  }
}

