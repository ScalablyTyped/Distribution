package typings.graphqlToolsUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaPrintOptions extends js.Object {
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.undefined
}

object SchemaPrintOptions {
  @scala.inline
  def apply(commentDescriptions: js.UndefOr[Boolean] = js.undefined): SchemaPrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commentDescriptions)) __obj.updateDynamic("commentDescriptions")(commentDescriptions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrintOptions]
  }
}

