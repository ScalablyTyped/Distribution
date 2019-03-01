package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var evalTemplate: js.UndefOr[scala.Boolean] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ ViewEvent, scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ViewEvent, scala.Unit]] = js.undefined
  var model: js.UndefOr[js.Object] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ ViewEvent, scala.Unit]] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    evalTemplate: js.UndefOr[scala.Boolean] = js.undefined,
    hide: js.Function1[/* e */ ViewEvent, scala.Unit] = null,
    init: js.Function1[/* e */ ViewEvent, scala.Unit] = null,
    model: js.Object = null,
    show: js.Function1[/* e */ ViewEvent, scala.Unit] = null,
    tagName: java.lang.String = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(evalTemplate)) __obj.updateDynamic("evalTemplate")(evalTemplate)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (init != null) __obj.updateDynamic("init")(init)
    if (model != null) __obj.updateDynamic("model")(model)
    if (show != null) __obj.updateDynamic("show")(show)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ViewOptions]
  }
}

