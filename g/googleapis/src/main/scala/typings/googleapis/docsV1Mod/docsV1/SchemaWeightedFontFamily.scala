package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a font family and weight of text.
  */
@js.native
trait SchemaWeightedFontFamily extends js.Object {
  /**
    * The font family of the text.  The font family can be any font from the
    * Font menu in Docs or from [Google Fonts] (https://fonts.google.com/). If
    * the font name is unrecognized, the text is rendered in `Arial`.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The weight of the font. This field can have any value that is a multiple
    * of `100` between `100` and `900`, inclusive. This range corresponds to
    * the numerical values described in the CSS 2.1 Specification,
    * [section 15.6](https://www.w3.org/TR/CSS21/fonts.html#font-boldness),
    * with non-numerical values disallowed.  The default value is `400`
    * (&quot;normal&quot;).  The font weight makes up just one component of the
    * rendered font weight. The rendered weight is determined by a combination
    * of the `weight` and the text style&#39;s resolved `bold` value, after
    * accounting for inheritance:  * If the text is bold and the weight is less
    * than `400`, the rendered   weight is 400. * If the text is bold and the
    * weight is greater than or equal to `400` but   is less than `700`, the
    * rendered weight is `700`. * If the weight is greater than or equal to
    * `700`, the rendered weight is   equal to the weight. * If the text is not
    * bold, the rendered weight is equal to the weight.
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

