package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var includeAnnotationIndices: js.UndefOr[scala.Boolean] = js.undefined
  var lineHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textPath: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | scala.Double | java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    annotations: js.Array[TextAnnotation] = null,
    eol: java.lang.String = null,
    includeAnnotationIndices: js.UndefOr[scala.Boolean] = js.undefined,
    lineHeight: scala.Double | java.lang.String = null,
    textPath: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    textVerticalAnchor: TextVerticalAnchor | scala.Double | java.lang.String = null,
    x: scala.Double | java.lang.String = null
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

