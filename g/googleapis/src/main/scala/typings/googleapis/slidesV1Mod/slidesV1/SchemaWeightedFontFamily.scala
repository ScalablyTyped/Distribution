package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a font family and weight used to style a TextRun.
  */
@js.native
trait SchemaWeightedFontFamily extends js.Object {
  /**
    * The font family of the text.  The font family can be any font from the
    * Font menu in Slides or from [Google Fonts] (https://fonts.google.com/).
    * If the font name is unrecognized, the text is rendered in `Arial`.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The rendered weight of the text. This field can have any value that is a
    * multiple of `100` between `100` and `900`, inclusive. This range
    * corresponds to the numerical values described in the CSS 2.1
    * Specification,
    * [section 15.6](https://www.w3.org/TR/CSS21/fonts.html#font-boldness),
    * with non-numerical values disallowed. Weights greater than or equal to
    * `700` are considered bold, and weights less than `700`are not bold. The
    * default value is `400` (&quot;normal&quot;).
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaWeightedFontFamily {
  @scala.inline
  def apply(fontFamily: String = null, weight: js.UndefOr[Double] = js.undefined): SchemaWeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWeightedFontFamily]
  }
}

