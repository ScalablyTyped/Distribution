package typings
package listrLib.listrMod.ListrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrOptions extends js.Object {
  var concurrent: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var exitOnError: js.UndefOr[scala.Boolean] = js.undefined
  var nonTTYRenderer: js.UndefOr[
    listrLib.listrLibStrings.silent | listrLib.listrLibStrings.default | listrLib.listrLibStrings.verbose | ListrRenderer
  ] = js.undefined
  var renderer: js.UndefOr[
    listrLib.listrLibStrings.silent | listrLib.listrLibStrings.default | listrLib.listrLibStrings.verbose | ListrRenderer
  ] = js.undefined
}

object ListrOptions {
  @scala.inline
  def apply(
    concurrent: scala.Boolean | scala.Double = null,
    exitOnError: js.UndefOr[scala.Boolean] = js.undefined,
    nonTTYRenderer: listrLib.listrLibStrings.silent | listrLib.listrLibStrings.default | listrLib.listrLibStrings.verbose | ListrRenderer = null,
    renderer: listrLib.listrLibStrings.silent | listrLib.listrLibStrings.default | listrLib.listrLibStrings.verbose | ListrRenderer = null
  ): ListrOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnError)) __obj.updateDynamic("exitOnError")(exitOnError)
    if (nonTTYRenderer != null) __obj.updateDynamic("nonTTYRenderer")(nonTTYRenderer.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrOptions]
  }
}

