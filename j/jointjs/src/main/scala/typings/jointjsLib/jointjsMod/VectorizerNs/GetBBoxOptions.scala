package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBBoxOptions extends js.Object {
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.SVGElement | jointjsLib.jointjsMod.Vectorizer] = js.undefined
}

object GetBBoxOptions {
  @scala.inline
  def apply(
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.SVGElement | jointjsLib.jointjsMod.Vectorizer = null
  ): GetBBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBBoxOptions]
  }
}

