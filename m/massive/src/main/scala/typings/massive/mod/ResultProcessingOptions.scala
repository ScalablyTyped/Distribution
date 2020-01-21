package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProcessingOptions extends js.Object {
  var build: js.UndefOr[Boolean] = js.undefined
  var decompose: js.UndefOr[DecomposeOptions] = js.undefined
  var document: js.UndefOr[Boolean] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
}

object ResultProcessingOptions {
  @scala.inline
  def apply(
    build: js.UndefOr[Boolean] = js.undefined,
    decompose: DecomposeOptions = null,
    document: js.UndefOr[Boolean] = js.undefined,
    single: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined
  ): ResultProcessingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(build)) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (decompose != null) __obj.updateDynamic("decompose")(decompose.asInstanceOf[js.Any])
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProcessingOptions]
  }
}

