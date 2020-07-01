package typings.libxslt.mod

import typings.libxslt.libxsltStrings.document
import typings.libxslt.libxsltStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyOptions extends js.Object {
  var noWrapParams: js.UndefOr[Boolean] = js.undefined
  var outputFormat: string | document
}

object ApplyOptions {
  @scala.inline
  def apply(outputFormat: string | document, noWrapParams: js.UndefOr[Boolean] = js.undefined): ApplyOptions = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrapParams)) __obj.updateDynamic("noWrapParams")(noWrapParams.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyOptions]
  }
}

