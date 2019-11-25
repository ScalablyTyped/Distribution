package typings.listr.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrOptions[Ctx] extends js.Object {
  var concurrent: js.UndefOr[Boolean | Double] = js.undefined
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  var nonTTYRenderer: js.UndefOr[ListrRendererValue[Ctx]] = js.undefined
  var renderer: js.UndefOr[ListrRendererValue[Ctx]] = js.undefined
}

object ListrOptions {
  @scala.inline
  def apply[Ctx](
    concurrent: Boolean | Double = null,
    exitOnError: js.UndefOr[Boolean] = js.undefined,
    nonTTYRenderer: ListrRendererValue[Ctx] = null,
    renderer: ListrRendererValue[Ctx] = null
  ): ListrOptions[Ctx] = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnError)) __obj.updateDynamic("exitOnError")(exitOnError.asInstanceOf[js.Any])
    if (nonTTYRenderer != null) __obj.updateDynamic("nonTTYRenderer")(nonTTYRenderer.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrOptions[Ctx]]
  }
}

