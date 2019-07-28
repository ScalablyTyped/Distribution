package typings.jointjs.jointjsMod.VectorizerNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var includeAnnotationIndices: js.UndefOr[Boolean] = js.undefined
  var lineHeight: js.UndefOr[Double | String] = js.undefined
  var textPath: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | Double | String] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    annotations: js.Array[TextAnnotation] = null,
    eol: String = null,
    includeAnnotationIndices: js.UndefOr[Boolean] = js.undefined,
    lineHeight: Double | String = null,
    textPath: String | StringDictionary[js.Any] = null,
    textVerticalAnchor: TextVerticalAnchor | Double | String = null,
    x: Double | String = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (!js.isUndefined(includeAnnotationIndices)) __obj.updateDynamic("includeAnnotationIndices")(includeAnnotationIndices)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (textVerticalAnchor != null) __obj.updateDynamic("textVerticalAnchor")(textVerticalAnchor.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

