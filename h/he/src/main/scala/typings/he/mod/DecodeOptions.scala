package typings.he.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  /**
    * The default value for the isAttributeValue option is false. This means
    * that decode() will decode the string as if it were used in a text
    * context in an HTML document. HTML has different rules for parsing
    * character references in attribute values — set this option to true to
    * treat the input string as if it were used as an attribute value.
    */
  var isAttributeValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The default value for the strict option is false. This means that
    * decode() will decode any HTML text content you feed it, even if it
    * contains any entities that cause parse errors. To throw an error when
    * such invalid HTML is encountered, set the strict option to true. This
    * option makes it possible to use he as part of HTML parsers and HTML
    * validators.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(isAttributeValue: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAttributeValue)) __obj.updateDynamic("isAttributeValue")(isAttributeValue.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptions]
  }
}

