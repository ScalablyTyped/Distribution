package typings.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptionsNormalized extends js.Object {
  var aAnnotation: String
  var aColor: DiffOptionsColor
  var aIndicator: String
  var bAnnotation: String
  var bColor: DiffOptionsColor
  var bIndicator: String
  var changeColor: DiffOptionsColor
  var changeLineTrailingSpaceColor: DiffOptionsColor
  var commonColor: DiffOptionsColor
  var commonIndicator: String
  var commonLineTrailingSpaceColor: DiffOptionsColor
  var contextLines: Double
  var emptyFirstOrLastLinePlaceholder: String
  var expand: Boolean
  var includeChangeCounts: Boolean
  var omitAnnotationLines: Boolean
  var patchColor: DiffOptionsColor
}

object DiffOptionsNormalized {
  @scala.inline
  def apply(
    aAnnotation: String,
    aColor: /* arg */ String => String,
    aIndicator: String,
    bAnnotation: String,
    bColor: /* arg */ String => String,
    bIndicator: String,
    changeColor: /* arg */ String => String,
    changeLineTrailingSpaceColor: /* arg */ String => String,
    commonColor: /* arg */ String => String,
    commonIndicator: String,
    commonLineTrailingSpaceColor: /* arg */ String => String,
    contextLines: Double,
    emptyFirstOrLastLinePlaceholder: String,
    expand: Boolean,
    includeChangeCounts: Boolean,
    omitAnnotationLines: Boolean,
    patchColor: /* arg */ String => String
  ): DiffOptionsNormalized = {
    val __obj = js.Dynamic.literal(aAnnotation = aAnnotation.asInstanceOf[js.Any], aColor = js.Any.fromFunction1(aColor), aIndicator = aIndicator.asInstanceOf[js.Any], bAnnotation = bAnnotation.asInstanceOf[js.Any], bColor = js.Any.fromFunction1(bColor), bIndicator = bIndicator.asInstanceOf[js.Any], changeColor = js.Any.fromFunction1(changeColor), changeLineTrailingSpaceColor = js.Any.fromFunction1(changeLineTrailingSpaceColor), commonColor = js.Any.fromFunction1(commonColor), commonIndicator = commonIndicator.asInstanceOf[js.Any], commonLineTrailingSpaceColor = js.Any.fromFunction1(commonLineTrailingSpaceColor), contextLines = contextLines.asInstanceOf[js.Any], emptyFirstOrLastLinePlaceholder = emptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], includeChangeCounts = includeChangeCounts.asInstanceOf[js.Any], omitAnnotationLines = omitAnnotationLines.asInstanceOf[js.Any], patchColor = js.Any.fromFunction1(patchColor))
  
    __obj.asInstanceOf[DiffOptionsNormalized]
  }
}

