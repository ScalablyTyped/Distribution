package typings.libxslt.anon

import typings.libxslt.libxsltStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoWrapParams extends js.Object {
  var noWrapParams: js.UndefOr[Boolean] = js.undefined
  var outputFormat: string
}

object NoWrapParams {
  @scala.inline
  def apply(outputFormat: string, noWrapParams: js.UndefOr[Boolean] = js.undefined): NoWrapParams = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrapParams)) __obj.updateDynamic("noWrapParams")(noWrapParams.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoWrapParams]
  }
}

