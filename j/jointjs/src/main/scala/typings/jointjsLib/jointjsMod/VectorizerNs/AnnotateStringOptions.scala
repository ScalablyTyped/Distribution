package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotateStringOptions extends js.Object {
  var includeAnnotationIndices: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object AnnotateStringOptions {
  @scala.inline
  def apply(
    includeAnnotationIndices: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null
  ): AnnotateStringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAnnotationIndices)) __obj.updateDynamic("includeAnnotationIndices")(includeAnnotationIndices)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotateStringOptions]
  }
}

