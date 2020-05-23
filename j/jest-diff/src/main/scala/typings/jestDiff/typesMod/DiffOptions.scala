package typings.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions extends js.Object {
  var aAnnotation: js.UndefOr[String] = js.undefined
  var aColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var aIndicator: js.UndefOr[String] = js.undefined
  var bAnnotation: js.UndefOr[String] = js.undefined
  var bColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var bIndicator: js.UndefOr[String] = js.undefined
  var changeColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var changeLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var commonColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var commonIndicator: js.UndefOr[String] = js.undefined
  var commonLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.undefined
  var contextLines: js.UndefOr[Double] = js.undefined
  var emptyFirstOrLastLinePlaceholder: js.UndefOr[String] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var includeChangeCounts: js.UndefOr[Boolean] = js.undefined
  var omitAnnotationLines: js.UndefOr[Boolean] = js.undefined
  var patchColor: js.UndefOr[DiffOptionsColor] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    aAnnotation: String = null,
    aColor: /* arg */ String => String = null,
    aIndicator: String = null,
    bAnnotation: String = null,
    bColor: /* arg */ String => String = null,
    bIndicator: String = null,
    changeColor: /* arg */ String => String = null,
    changeLineTrailingSpaceColor: /* arg */ String => String = null,
    commonColor: /* arg */ String => String = null,
    commonIndicator: String = null,
    commonLineTrailingSpaceColor: /* arg */ String => String = null,
    contextLines: js.UndefOr[Double] = js.undefined,
    emptyFirstOrLastLinePlaceholder: String = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    includeChangeCounts: js.UndefOr[Boolean] = js.undefined,
    omitAnnotationLines: js.UndefOr[Boolean] = js.undefined,
    patchColor: /* arg */ String => String = null
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (aAnnotation != null) __obj.updateDynamic("aAnnotation")(aAnnotation.asInstanceOf[js.Any])
    if (aColor != null) __obj.updateDynamic("aColor")(js.Any.fromFunction1(aColor))
    if (aIndicator != null) __obj.updateDynamic("aIndicator")(aIndicator.asInstanceOf[js.Any])
    if (bAnnotation != null) __obj.updateDynamic("bAnnotation")(bAnnotation.asInstanceOf[js.Any])
    if (bColor != null) __obj.updateDynamic("bColor")(js.Any.fromFunction1(bColor))
    if (bIndicator != null) __obj.updateDynamic("bIndicator")(bIndicator.asInstanceOf[js.Any])
    if (changeColor != null) __obj.updateDynamic("changeColor")(js.Any.fromFunction1(changeColor))
    if (changeLineTrailingSpaceColor != null) __obj.updateDynamic("changeLineTrailingSpaceColor")(js.Any.fromFunction1(changeLineTrailingSpaceColor))
    if (commonColor != null) __obj.updateDynamic("commonColor")(js.Any.fromFunction1(commonColor))
    if (commonIndicator != null) __obj.updateDynamic("commonIndicator")(commonIndicator.asInstanceOf[js.Any])
    if (commonLineTrailingSpaceColor != null) __obj.updateDynamic("commonLineTrailingSpaceColor")(js.Any.fromFunction1(commonLineTrailingSpaceColor))
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (emptyFirstOrLastLinePlaceholder != null) __obj.updateDynamic("emptyFirstOrLastLinePlaceholder")(emptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeChangeCounts)) __obj.updateDynamic("includeChangeCounts")(includeChangeCounts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitAnnotationLines)) __obj.updateDynamic("omitAnnotationLines")(omitAnnotationLines.get.asInstanceOf[js.Any])
    if (patchColor != null) __obj.updateDynamic("patchColor")(js.Any.fromFunction1(patchColor))
    __obj.asInstanceOf[DiffOptions]
  }
}

