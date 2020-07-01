package typings.libxslt.anon

import typings.libxslt.libxsltStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormat extends js.Object {
  var noWrapParams: js.UndefOr[Boolean] = js.undefined
  var outputFormat: document
}

object OutputFormat {
  @scala.inline
  def apply(outputFormat: document, noWrapParams: js.UndefOr[Boolean] = js.undefined): OutputFormat = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrapParams)) __obj.updateDynamic("noWrapParams")(noWrapParams.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormat]
  }
}

