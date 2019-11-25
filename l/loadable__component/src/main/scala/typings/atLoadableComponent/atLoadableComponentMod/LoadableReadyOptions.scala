package typings.atLoadableComponent.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableReadyOptions extends js.Object {
  var namespace: js.UndefOr[String] = js.undefined
}

object LoadableReadyOptions {
  @scala.inline
  def apply(namespace: String = null): LoadableReadyOptions = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadableReadyOptions]
  }
}

