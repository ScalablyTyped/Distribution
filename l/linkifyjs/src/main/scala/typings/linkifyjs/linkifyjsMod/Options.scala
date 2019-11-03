package typings.linkifyjs.linkifyjsMod

import typings.linkifyjs.linkifyjsStrings.ftp
import typings.linkifyjs.linkifyjsStrings.ftps
import typings.linkifyjs.linkifyjsStrings.http
import typings.linkifyjs.linkifyjsStrings.https
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Object of attributes to add to each new link. Note: the class and target
    * attributes have dedicated options.
    *
    * Also accepts a function that takes the unformatted href, the link type
    * (e.g., 'url', 'email', etc.) and returns the object.
    *
    * @default null
    */
  var attributes: js.UndefOr[
    (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) | Null
  ] = js.undefined
  /**
    * class attribute to use for newly created links.
    *
    * Accepts a function that takes the unformatted href value and link type
    * (e.g., 'url', 'email', etc.) and returns the string.
    *
    * Accepts an object where each key is the link type and each value is the
    * string or function to use for that type.
    */
  var className: js.UndefOr[
    String | (Partial[Record[LinkEntityType, String | (js.Function1[/* href */ String, String])]]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
  ] = js.undefined
  /**
    * Protocol that should be used in href attributes for URLs without a
    * protocol (e.g., github.com).
    *
    * @default 'http'
    */
  var defaultProtocol: js.UndefOr[http | https | ftp | ftps | String] = js.undefined
  /**
    * Format the text displayed by a linkified entity. e.g., truncate a long URL.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
    * and each value is the formatting function to use for that type.
    *
    * @default null
    */
  var format: js.UndefOr[
    (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, js.Function1[/* value */ String, String]]]) | Null
  ] = js.undefined
  /**
    * Similar to format, except the result of this function will be used as the
    * href attribute of the new link.
    *
    * This is useful when finding hashtags, where you don’t necessarily
    * want the default to be a link to a named anchor.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
    * and each value is the formatting function to use for that type.
    *
    * @default null
    */
  var formatHref: js.UndefOr[
    (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, js.Function1[/* href */ String, String]]]) | Null
  ] = js.undefined
  /**
    * If `true`, \n line breaks will automatically be converted to `<br>` tags.
    *
    * @default false
    */
  var nl2br: js.UndefOr[Boolean] = js.undefined
  /**
    * The tag name to use for each link.
    * For cases where you can’t use anchor tags.
    *
    * Accepts a function that takes the unformatted href,
    * the link type (e.g., 'url', 'email', etc.) and returns the tag name.
    *
    * Accepts an object where each key is the link type,
    * and each value is the tag name to use for that type.
    *
    * @default a
    */
  var tagName: js.UndefOr[
    String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, String]])
  ] = js.undefined
  /**
    * target attribute for generated link.
    *
    * Accepts a function that takes the unformatted href,
    * the link type (e.g., 'url', 'email', etc.) and returns the target
    *
    * Accepts an object where each key is the link type,
    * and each value is the target to use for that type.
    *
    * @default { url: '_blank' }
    */
  var target: js.UndefOr[
    String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, String | Null]])
  ] = js.undefined
  /**
    * validate
    * - Type: Boolean | Function (String value, String type) | Object
    * - Default: null
    *
    * If option resolves to false, the given value will not show up as a link.
    *
    * Accepts a function that takes a discovered link,
    * and the link type (e.g., 'url', 'email', etc.),
    * and returns true if the link should be converted into an anchor tag,
    * and false otherwise.
    *
    * Accepts an object where each key is the link type and each value is the
    * the validation option to use for that type
    *
    * @default null
    */
  var validate: js.UndefOr[
    Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | (Partial[Record[LinkEntityType, js.Function1[/* href */ String, Boolean]]]) | Null
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributes: (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) = null,
    className: String | (Partial[Record[LinkEntityType, String | (js.Function1[/* href */ String, String])]]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) = null,
    defaultProtocol: http | https | ftp | ftps | String = null,
    format: (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, js.Function1[/* value */ String, String]]]) = null,
    formatHref: (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, js.Function1[/* href */ String, String]]]) = null,
    nl2br: js.UndefOr[Boolean] = js.undefined,
    tagName: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, String]]) = null,
    target: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | (Partial[Record[LinkEntityType, String | Null]]) = null,
    validate: Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | (Partial[Record[LinkEntityType, js.Function1[/* href */ String, Boolean]]]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatHref != null) __obj.updateDynamic("formatHref")(formatHref.asInstanceOf[js.Any])
    if (!js.isUndefined(nl2br)) __obj.updateDynamic("nl2br")(nl2br)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

