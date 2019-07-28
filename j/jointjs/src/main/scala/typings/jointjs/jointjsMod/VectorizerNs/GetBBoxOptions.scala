package typings.jointjs.jointjsMod.VectorizerNs

import typings.jointjs.jointjsMod.Vectorizer
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBBoxOptions extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[SVGElement | Vectorizer] = js.undefined
}

object GetBBoxOptions {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined, target: SVGElement | Vectorizer = null): GetBBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBBoxOptions]
  }
}

