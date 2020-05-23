package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocateOptions extends js.Object {
  var useAliases: js.UndefOr[Boolean] = js.undefined
}

object NamespaceLocateOptions {
  @scala.inline
  def apply(useAliases: js.UndefOr[Boolean] = js.undefined): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useAliases)) __obj.updateDynamic("useAliases")(useAliases.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
}

